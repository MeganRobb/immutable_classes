/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.stockTransfers.Transfers;
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
public class TransferTest {
    
    public TransferTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    Transfers tran = new Transfers.Builder("willow80").storeGoinTo("tyger67").quantity(4).build();
    Assert.assertEquals(tran.getStoreID(),"willow80");
    Assert.assertEquals(tran.getStoreGoinTo(),"tyger67");
    Assert.assertEquals(tran.getQuantity(),4);
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    Transfers tranN = new Transfers.Builder("willow80").storeGoinTo("cav64").quantity(4).build();
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
