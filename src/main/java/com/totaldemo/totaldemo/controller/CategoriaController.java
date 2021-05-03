/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.controller;

import com.totaldemo.totaldemo.models.Categoria;
import com.totaldemo.totaldemo.service.CategoriaServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cadri
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    private CategoriaServiceImpl service;

    @GetMapping("/categorias")
    public List<Categoria> findAll() {
        return service.findAll();
    }

    @GetMapping("/categorias/{theId}")
    public Categoria findById(@PathVariable Long theId) {
        return service.findById(theId);
    }

    @PostMapping("/categorias")
    public void save(@RequestBody Categoria theCategoria) {
        service.save(theCategoria);
    }

}
