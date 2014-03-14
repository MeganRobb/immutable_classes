/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.salaries.HOEmployees;
import com.meganrobb.immutable_classes.service.crud.HOEmployeesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class HOEmployeesCrudServiceImpl implements HOEmployeesCrudService {
    
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public HOEmployees find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public HOEmployees persist(HOEmployees entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public HOEmployees merge(HOEmployees entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public HOEmployees remove(HOEmployees entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<HOEmployees> findAll() {
        return null;
    }

    public List<HOEmployees> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
