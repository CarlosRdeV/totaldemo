/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.controller;

import com.totaldemo.totaldemo.models.Profesor;
import com.totaldemo.totaldemo.service.ProfesorServiceImpl;
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
public class ProfesorController {
    
    @Autowired
    private ProfesorServiceImpl service;
    
    @GetMapping("/profesores")
    public List<Profesor> findAll(){
        return service.findAll();
    }
    
    @GetMapping("/profesores/{theId}")
    public Profesor findById(@PathVariable Long theId){
        return service.findById(theId);
    }
    
    @PostMapping("/profesores")
    public void save(@RequestBody Profesor theProfesor){
        service.save(theProfesor);
    }
    
}
