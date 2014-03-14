/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.service;

import com.meganrobb.immutable_classes.model.StoreStock.Boots;
import com.meganrobb.immutable_classes.service.crud.BootsCrudService;
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
public class BootsTestCrudService {
    @Mock
    BootsCrudService CrudService;
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        CrudService = Mockito.mock(BootsCrudService.class);
    }
    @Test
     public void testCreate() throws Exception {
         Boots boo = new Boots.Builder("boo123").bootColor("Brown").bootSize(4.5).build();
        Boots returnBoots = CrudService.persist(boo);
        when(CrudService.persist(boo)).thenReturn(returnBoots);
        Mockito.verify(CrudService).persist(boo);

     }
      @Test
    public void testRead() throws Exception {
         Boots boo = new Boots.Builder("boo123").bootColor("Brown").bootSize(4.5).build();
        Boots returnBoots = CrudService.find(boo.getStockID());
        when(CrudService.find(boo.getStockID())).thenReturn(returnBoots);
        Mockito.verify(CrudService).find(boo.getStockID());

    }
    @Test
    public void testDelete() throws Exception {

        Boots boo = new Boots.Builder("boo123").bootColor("Brown").bootSize(4.5).build();
        Boots returnBoots = CrudService.remove(boo);
        when(CrudService.remove(boo)).thenReturn(returnBoots);
        Mockito.verify(CrudService).remove(boo);

    }
}
