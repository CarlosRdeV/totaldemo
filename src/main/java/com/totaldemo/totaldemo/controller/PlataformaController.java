/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.controller;

import com.totaldemo.totaldemo.models.Plataforma;
import com.totaldemo.totaldemo.service.PlataformaServiceImpl;
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
public class PlataformaController {

    @Autowired
    private PlataformaServiceImpl service;

    @GetMapping("/plataformas")
    public List<Plataforma> findAll() {
        return service.findAll();
    }

    @GetMapping("/plataformas/{theId}")
    public Plataforma findById(@PathVariable Long theId) {
        return service.findById(theId);
    }

    @PostMapping("/plataformas")
    public void save(@RequestBody Plataforma thePlataforma) {
        service.save(thePlataforma);
    }
}
