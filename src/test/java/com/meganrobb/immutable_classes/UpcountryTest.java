/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.stores.UpCountryStrores;
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
public class UpcountryTest {
    
    public UpcountryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    UpCountryStrores upco = new UpCountryStrores.Builder("nic234").storeAddress("Nicolway").telephone("0115582324").build();
    Assert.assertEquals(upco.getStoreID(),"nic234");
    Assert.assertEquals(upco.getStoreAddress(),"Nicolway");
    Assert.assertEquals(upco.getTelephone(),"0115582324");
    
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    UpCountryStrores upcoN = new UpCountryStrores.Builder("nic234").storeAddress("Nicolway").telephone("0115582377").build();
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
