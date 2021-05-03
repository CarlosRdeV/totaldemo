/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Plataforma;
import java.util.List;

/**
 *
 * @author cadri
 */
public interface PlataformaService {

    public List<Plataforma> findAll();

    public Plataforma findById(Long theId);

    public void save(Plataforma thePlataforma);
}
