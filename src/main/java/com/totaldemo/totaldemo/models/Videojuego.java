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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author cadri
 */
@Entity
@Table
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String nombre;

    @Column
    private Integer anio;

    @ManyToOne
    @JoinColumn(name = "desarrollador_id")
    private Desarrollador desarrollador;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToMany
    @JoinTable(
            name = "videojuego_plataforma",
            joinColumns = @JoinColumn(name = "videojuego_id"),
            inverseJoinColumns = @JoinColumn(name = "plataforma_id")
    )
    private List<Plataforma> plataformas;

    public Videojuego() {
    }

    public Videojuego(String nombre, Integer anio) {
        this.nombre = nombre;
        this.anio = anio;
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

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Plataforma> getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(List<Plataforma> plataformas) {
        this.plataformas = plataformas;
    }
    
    
    public void addPlataforma(Plataforma thePlataforma) {
        if (plataformas == null) {
            plataformas = new ArrayList<>();
        }
        plataformas.add(thePlataforma);
    }

    @Override
    public String toString() {
        return "Videojuego{" + "id=" + id + ", nombre=" + nombre + ", anio=" + anio + '}';
    }

}
