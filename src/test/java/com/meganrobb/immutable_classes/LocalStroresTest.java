/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.stores.LocalStores;
import org.testng.Assert;
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
public class LocalStroresTest {
    
    public LocalStroresTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCreation()throws Exception{
    LocalStores local = new LocalStores.Builder("can234").storeAddress("Century City").telephone("0215582324").build();
    Assert.assertEquals(local.getStoreID(),"can234");
    Assert.assertEquals(local.getStoreAddress(),"Century City");
    Assert.assertEquals(local.getTelephone(),"0215582324");
    
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    LocalStores localN = new LocalStores.Builder("can234").storeAddress("Century City").telephone("0215582377").build();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
