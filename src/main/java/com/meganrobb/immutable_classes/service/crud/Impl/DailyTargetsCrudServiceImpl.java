/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes.service.crud.Impl;

import com.meganrobb.immutable_classes.model.targets.DailyTarget;
import com.meganrobb.immutable_classes.service.crud.DailyTargetsCRudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author student
 */
public class DailyTargetsCrudServiceImpl implements DailyTargetsCRudService {
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public DailyTarget find (String s){
        return null;
    }
    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public DailyTarget persist(DailyTarget entity) {

        return null;
    }
     @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DailyTarget merge(DailyTarget entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public DailyTarget remove(DailyTarget entity) {
        return null;
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<DailyTarget> findAll() {
        return null;
    }

    public List<DailyTarget> findall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
