/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.totaldemo.totaldemo.models.Videojuego;

/**
 *
 * @author cadri
 */
public interface VideojuegoRepository extends JpaRepository<Videojuego, Long> {

}
