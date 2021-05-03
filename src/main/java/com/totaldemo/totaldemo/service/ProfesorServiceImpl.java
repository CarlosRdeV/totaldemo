/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Profesor;
import com.totaldemo.totaldemo.repository.ProfesorRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cadri
 */
@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    private ProfesorRepository repo;

    @Override
    public List<Profesor> findAll() {
        return repo.findAll();
    }

    @Override
    public Profesor findById(Long theId) {

        Optional<Profesor> profesor = repo.findById(theId);
        Profesor theProfesor = null;
        if (profesor.isPresent()) {
            theProfesor = profesor.get();
            return theProfesor;
        }
        System.out.println("No existe un profesor con el Id:" + theId);
        return null;
    }

    @Override
    public void save(Profesor theProfesor) {
        theProfesor.setId(0L);
        repo.save(theProfesor);
    }

}
