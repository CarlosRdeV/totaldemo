/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Plataforma;
import com.totaldemo.totaldemo.repository.PlataformaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cadri
 */
@Service
public class PlataformaServiceImpl implements PlataformaService {

    @Autowired
    private PlataformaRepository repo;

    @Override
    public List<Plataforma> findAll() {
        return repo.findAll();
    }

    @Override
    public Plataforma findById(Long theId) {
        Optional<Plataforma> plataforma = repo.findById(theId);
        Plataforma thePlataforma = null;
        if (plataforma.isPresent()) {
            thePlataforma = plataforma.get();
            return thePlataforma;
        }
        System.out.println("No existe un desarrollador con el Id:" + theId);
        return null;
    }

    @Override
    public void save(Plataforma thePlataforma) {
        thePlataforma.setId(0L);
        repo.save(thePlataforma);
    }

}
