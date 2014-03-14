/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.service;

import com.meganrobb.immutable_classes.model.targets.DailyTarget;
import com.meganrobb.immutable_classes.service.crud.DailyTargetsCRudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class DailyTargetsTestCrudService {
     @Mock
    DailyTargetsCRudService CrudService;
    
    
    

   @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        CrudService = Mockito.mock(DailyTargetsCRudService.class);
    }
    @Test
     public void testCreate() throws Exception {
        DailyTarget day = new DailyTarget.Builder("can123").dailySales(3400.00).dailyTarget(5500.00).build();
        DailyTarget returnDailyTarget = CrudService.persist(day);
        when(CrudService.persist(day)).thenReturn(returnDailyTarget);
        Mockito.verify(CrudService).persist(day);

     }
      @Test
    public void testRead() throws Exception {
         DailyTarget day = new DailyTarget.Builder("can123").dailySales(3400.00).dailyTarget(5500.00).build();
        DailyTarget returnBoots = CrudService.find(day.getStoreID());
        when(CrudService.find(day.getStoreID())).thenReturn(returnBoots);
        Mockito.verify(CrudService).find(day.getStoreID());

    }
    @Test
    public void testDelete() throws Exception {

        DailyTarget day = new DailyTarget.Builder("can123").dailySales(3400.00).dailyTarget(5500.00).build();
        DailyTarget returnBoots = CrudService.remove(day);
        when(CrudService.remove(day)).thenReturn(returnBoots);
        Mockito.verify(CrudService).remove(day);

    }
}
