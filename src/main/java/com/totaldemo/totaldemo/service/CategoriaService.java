/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.totaldemo.totaldemo.service;

import com.totaldemo.totaldemo.models.Categoria;
import java.util.List;

/**
 *
 * @author cadri
 */
public interface CategoriaService {

    public List<Categoria> findAll();

    public Categoria findById(Long theId);

    public void save(Categoria theCategoria);
}
