/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Categoria;
import com.totaldemo.totaldemo.repository.CategoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cadri
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    @Override
    public List<Categoria> findAll() {
        return repo.findAll();
    }

    @Override
    public Categoria findById(Long theId) {
        Optional<Categoria> categoria = repo.findById(theId);
        Categoria theCategoria = null;
        if (categoria.isPresent()) {
            theCategoria = categoria.get();
            return theCategoria;
        }
        System.out.println("No existe una categoria con el Id:" + theId);
        return null;
    }

    @Override
    public void save(Categoria theCategoria) {
        theCategoria.setId(0L);
        repo.save(theCategoria);
    }

}
