/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.repository;

import com.totaldemo.totaldemo.models.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cadri
 */
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}
