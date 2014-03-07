/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.StoreStock.Boots;
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
public class BootsTest {
    
    public BootsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception {
    Boots boo = new Boots.Builder("boo123").bootColor("Brown").bootSize(4.5).build();
    Assert.assertEquals(boo.getStockID(),"boo123");
    Assert.assertEquals(boo.getBootColor(),"Brown");
    Assert.assertEquals(boo.getBootSize(),4.5);}
    
    @Test
    public void testUpdate()throws Exception {
    Boots booN = new Boots.Builder("boo123").bootColor("black").bootSize(4.5).build();
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
