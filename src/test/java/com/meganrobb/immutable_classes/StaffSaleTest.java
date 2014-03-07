/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.sales.StaffSales;
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
public class StaffSaleTest {
    
    public StaffSaleTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    StaffSales sts = new StaffSales.Builder("defr234").dailySales(1548.0).staffQuantity(5.0).build();
    Assert.assertEquals(sts.getStaffID(),"defr234");
    Assert.assertEquals(sts.getDailySales(),1548.0);
    Assert.assertEquals(sts.getStaffQuantity(),5.0);
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    StaffSales stsN = new StaffSales.Builder("defr234").dailySales(1548.0).staffQuantity(6.0).build();
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
