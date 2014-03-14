/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.sales.StaffSales;
import com.meganrobb.immutable_classes.service.crud.StaffSalesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class StaffSalesCrudServiceImpl implements StaffSalesCrudService {
     @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public StaffSales find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public StaffSales persist(StaffSales entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public StaffSales merge(StaffSales entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public StaffSales remove(StaffSales entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<StaffSales> findAll() {
        return null;
    }

    public List<StaffSales> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
