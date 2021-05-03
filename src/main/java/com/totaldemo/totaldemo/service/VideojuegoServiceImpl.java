/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Videojuego;
import com.totaldemo.totaldemo.models.Desarrollador;
import com.totaldemo.totaldemo.models.Categoria;
import com.totaldemo.totaldemo.models.Plataforma;
import com.totaldemo.totaldemo.repository.VideojuegoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cadri
 */
@Service
public class VideojuegoServiceImpl implements VideojuegoService {

    @Autowired
    private VideojuegoRepository repo;

    @Autowired
    private DesarrolladorServiceImpl servDesarrollador;
    
    @Autowired
    private CategoriaServiceImpl servCategoria;
    
    @Autowired
    private PlataformaServiceImpl servPlataforma;

    @Override
    public List<Videojuego> findAll() {
        return repo.findAll();
    }

    @Override
    public Videojuego findById(Long theId) {
        Optional<Videojuego> videojuego = repo.findById(theId);
        Videojuego theVideojuego = null;
        if (videojuego.isPresent()) {
            theVideojuego = videojuego.get();
            return theVideojuego;
        }
        System.out.println("No existe un videojuego con el Id:" + theId);
        return null;
    }

    @Override
    public void save(Videojuego theVideojuego, Long desarrolladorId, Long categoriaId, Long plataformaId) {
        // traer desarrollador
        Desarrollador desarrollador = servDesarrollador.findById(desarrolladorId);
        Categoria categoria = servCategoria.findById(categoriaId);
        Plataforma plataforma = servPlataforma.findById(plataformaId);
        theVideojuego.setId(0L);
        theVideojuego.addPlataforma(plataforma);
        desarrollador.addVideojuegos(theVideojuego);
        categoria.addVideojuegos(theVideojuego);
   
        repo.save(theVideojuego);
    }

}
