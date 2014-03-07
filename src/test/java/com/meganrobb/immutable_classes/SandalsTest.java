/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.StoreStock.Sandals;
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
public class SandalsTest {
    
    public SandalsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCreation()throws Exception {
    Sandals san = new Sandals.Builder("prin123").sandalColor("black").sandalSize(5.0).build();
    Assert.assertEquals(san.getStockID(),"prin123");
    Assert.assertEquals(san.getSandalColor(),"black");
    Assert.assertEquals(san.getSandalSize(),5.0);}
    
    @Test
    public void testUpdate()throws Exception {
    Sandals sanN = new Sandals.Builder("prin123").sandalColor("purple").sandalSize(5.0).build();
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
