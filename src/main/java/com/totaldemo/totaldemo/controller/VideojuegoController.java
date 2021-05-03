/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.controller;

import com.totaldemo.totaldemo.models.Videojuego;
import com.totaldemo.totaldemo.service.VideojuegoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cadri
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class VideojuegoController {

    @Autowired
    private VideojuegoServiceImpl service;

    @GetMapping("/videojuegos")
    public List<Videojuego> findAll() {
        return service.findAll();
    }

    @GetMapping("/videojuegos/{theId}")
    public Videojuego findById(@PathVariable Long theId) {
        return service.findById(theId);
    }

    @PostMapping("/videojuegos")
    public void save(
            @RequestBody Videojuego theVideojuego,
            @RequestHeader Long desarrolladorId,
            @RequestHeader Long categoriaId,
            @RequestHeader Long plataformaId) {
        service.save(theVideojuego, desarrolladorId, categoriaId, plataformaId);
    }

}
