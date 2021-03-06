/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.salaries.StoreFullTime;
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
public class StoreFullTimeTest {
    
    public StoreFullTimeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testCreation()throws Exception{
    StoreFullTime sft = new StoreFullTime.Builder("defr234").staffRate(22.50).staffHours(87.0).staffDeductions(800.0).build();
    Assert.assertEquals(sft.getStaffID(),"defr234");
    Assert.assertEquals(sft.getStaffHours(),87.0);
    Assert.assertEquals(sft.getStaffRate(),22.50);
    Assert.assertEquals(sft.getStaffDeductions(),800.0);
    }
    
     @Test
    public void testUpdate()throws Exception {
    StoreFullTime sftN = new StoreFullTime.Builder("defr234").staffRate(24.50).staffHours(87).staffDeductions(800.0).build();
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
