/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.targets.MonthlyTarget;
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
public class MonthlyTargetTest {
    
    public MonthlyTargetTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    MonthlyTarget mon = new MonthlyTarget.Builder("can123").monthlySales(13400.00).monthlyTarget(15500.00).build();
    Assert.assertEquals(mon.getStoreID(),"can123");
    Assert.assertEquals(mon.getMonthlySales(),13400.0);
    Assert.assertEquals(mon.getMonthlyTarget(),15500.0);}
    
     @Test
    public void testUpdate()throws Exception {
    MonthlyTarget monN = new MonthlyTarget.Builder("can123").monthlySales(13400.00).monthlyTarget(115500.00).build();
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
