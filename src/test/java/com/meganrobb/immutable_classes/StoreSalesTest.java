/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.sales.StoreSales;
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
public class StoreSalesTest {
    
    public StoreSalesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    StoreSales st = new StoreSales.Builder("willow80").dailySales(10548.0).dailyQuantity(36.0).build();
    Assert.assertEquals(st.getStoreID(),"willow80");
    Assert.assertEquals(st.getDailySales(),10548.0);
    Assert.assertEquals(st.getDailyQuantity(),36.0);
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    StoreSales stN = new StoreSales.Builder("canal81").dailySales(10548.0).dailyQuantity(36.0).build();
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
