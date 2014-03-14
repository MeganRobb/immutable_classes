/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.StoreStock.Boots;
import com.meganrobb.immutable_classes.service.crud.BootsCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class BootsCrudServiceImpl implements BootsCrudService {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Boots find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Boots persist(Boots entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Boots merge(Boots entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Boots remove(Boots entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Boots> findAll() {
        return null;
    }

    public List<Boots> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    }
    

