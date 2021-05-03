/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Desarrollador;
import com.totaldemo.totaldemo.repository.DesarrolladorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cadri
 */
@Service
public class DesarrolladorServiceImpl implements DesarrolladorService {

    @Autowired
    private DesarrolladorRepository repo;

    @Override
    public List<Desarrollador> findAll() {
        return repo.findAll();
    }

    @Override
    public Desarrollador findById(Long theId) {
        Optional<Desarrollador> desarrollador = repo.findById(theId);
        Desarrollador theDesarrollador = null;
        if (desarrollador.isPresent()) {
            theDesarrollador = desarrollador.get();
            return theDesarrollador;
        }
        System.out.println("No existe un desarrollador con el Id:" + theId);
        return null;
    }

    @Override
    public void save(Desarrollador theDesarrollador) {
        theDesarrollador.setId(0L);
        repo.save(theDesarrollador);
    }

}
