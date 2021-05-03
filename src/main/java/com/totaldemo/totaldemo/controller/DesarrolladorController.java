/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.controller;

import com.totaldemo.totaldemo.models.Desarrollador;
import com.totaldemo.totaldemo.service.DesarrolladorServiceImpl;
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
public class DesarrolladorController {

    @Autowired
    private DesarrolladorServiceImpl service;

    @GetMapping("/desarrolladores")
    public List<Desarrollador> findAll() {
        return service.findAll();
    }

    @GetMapping("/desarrolladores/{theId}")
    public Desarrollador findById(@PathVariable Long theId) {
        return service.findById(theId);
    }

    @PostMapping("/desarrolladores")
    public void save(@RequestBody Desarrollador theDesarrollador) {
        service.save(theDesarrollador);
    }
}
