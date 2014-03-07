/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.targets.DailyTarget;
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
public class DailyTargetTest {
    
    public DailyTargetTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCreation()throws Exception{
    DailyTarget day = new DailyTarget.Builder("can123").dailySales(3400.00).dailyTarget(5500.00).build();
    Assert.assertEquals(day.getStoreID(),"can123");
    Assert.assertEquals(day.getDailySales(),3400.0);
    Assert.assertEquals(day.getDailyTarget(),5500.0);}
    
     @Test
    public void testUpdate()throws Exception {
    DailyTarget dayN = new DailyTarget.Builder("can123").dailySales(3400.00).dailyTarget(5500.00).build();
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
