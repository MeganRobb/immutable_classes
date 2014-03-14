/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.stockTransfers.Transfers;
import com.meganrobb.immutable_classes.service.crud.TransferCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class TransferCrudServiceImpl implements TransferCrudService {
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Transfers find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public Transfers persist(Transfers entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Transfers merge(Transfers entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Transfers remove(Transfers entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Transfers> findAll() {
        return null;
    }

    public List<Transfers> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
