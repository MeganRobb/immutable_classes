/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.service;

import com.meganrobb.immutable_classes.model.sales.StaffSales;
import com.meganrobb.immutable_classes.service.crud.StaffSalesCrudService;
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
public class StaffSalesTestCrudService {
    
    @Mock
    StaffSalesCrudService CrudService;

   @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        CrudService = Mockito.mock(StaffSalesCrudService.class);
    }
    @Test
     public void testCreate() throws Exception {
       StaffSales sts = new StaffSales.Builder("defr234").dailySales(1548.0).staffQuantity(5.0).build();
        StaffSales returnStaffSales = CrudService.persist(sts);
        when(CrudService.persist(sts)).thenReturn(returnStaffSales);
        Mockito.verify(CrudService).persist(sts);

     }
      @Test
    public void testRead() throws Exception {
         StaffSales sts = new StaffSales.Builder("defr234").dailySales(1548.0).staffQuantity(5.0).build();
        StaffSales returnStaffSales = CrudService.find(sts.getStaffID());
        when(CrudService.find(sts.getStaffID())).thenReturn(returnStaffSales);
        Mockito.verify(CrudService).find(sts.getStaffID());

    }
    @Test
    public void testDelete() throws Exception {

       StaffSales sts = new StaffSales.Builder("defr234").dailySales(1548.0).staffQuantity(5.0).build();
        StaffSales returnStaffSales = CrudService.remove(sts);
        when(CrudService.remove(sts)).thenReturn(returnStaffSales);
        Mockito.verify(CrudService).remove(sts);

    }
}
