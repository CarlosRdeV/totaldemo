/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import java.util.List;
import com.totaldemo.totaldemo.models.Profesor;

/**
 *
 * @author cadri
 */
public interface ProfesorService {

    public List<Profesor> findAll();

    public Profesor findById(Long theId);

    public void save(Profesor theProfesor);

}
