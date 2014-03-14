/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.sellingPrice.SellingSandals;
import com.meganrobb.immutable_classes.service.crud.SellingSandalsCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class SellingSandalsCrudServiceImpl implements SellingSandalsCrudService {
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SellingSandals find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SellingSandals persist(SellingSandals entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SellingSandals merge(SellingSandals entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SellingSandals remove(SellingSandals entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SellingSandals> findAll() {
        return null;
    }

    public List<SellingSandals> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}
