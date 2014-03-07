/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.targets.YearlyTarget;
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
public class YearlyTargetTest {
    
    public YearlyTargetTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
   @Test
    public void testCreation()throws Exception{
    YearlyTarget yr = new YearlyTarget.Builder("can123").yearlySales(1113400.00).yearlyTarget(1115500.00).build();
    Assert.assertEquals(yr.getStoreID(),"can123");
    Assert.assertEquals(yr.getYearlySales(),1113400.0);
    Assert.assertEquals(yr.getYearlyTarget(),1115500.0);}
    
     @Test
    public void testUpdate()throws Exception {
    YearlyTarget yrN = new YearlyTarget.Builder("can123").yearlySales(113400.00).yearlyTarget(1115500.00).build();;
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
