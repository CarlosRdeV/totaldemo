/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author cadri
 */
@Entity
@Table
public class Plataforma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "videojuego_plataforma",
            joinColumns = @JoinColumn(name = "plataforma_id"),
            inverseJoinColumns = @JoinColumn(name = "videojuego_id")
    )
    private List<Videojuego> videojuegos;

    public Plataforma() {
    }

    public Plataforma(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }
    
    
    public void addVideojuegos(Videojuego theVideojuego) {
        if (videojuegos == null) {
            videojuegos = new ArrayList<>();
        }
        videojuegos.add(theVideojuego);
    }

    @Override
    public String toString() {
        return "Plataforma{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
