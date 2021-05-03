/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Videojuego;
import java.util.List;

/**
 *
 * @author cadri
 */
public interface VideojuegoService {

    public List<Videojuego> findAll();

    public Videojuego findById(Long theId);

    public void save(Videojuego theVideojuego, Long desarrolladorId, Long categoriaId, Long plataformaId);

}
