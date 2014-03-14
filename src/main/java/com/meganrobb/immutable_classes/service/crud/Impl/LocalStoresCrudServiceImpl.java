/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.stores.LocalStores;
import com.meganrobb.immutable_classes.service.crud.LocalStoresCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class LocalStoresCrudServiceImpl implements LocalStoresCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public LocalStores find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public LocalStores persist(LocalStores entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public LocalStores merge(LocalStores entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public LocalStores remove(LocalStores entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<LocalStores> findAll() {
        return null;
    }

    public List<LocalStores> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
