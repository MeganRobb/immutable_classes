/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.sellingPrice.SellingBoots;
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
public class SellingBootTest {
    
    public SellingBootTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    SellingBoots sboo = new SellingBoots.Builder("bo123").sellingPrice(1500.0).tax(14).costPrice(1000.0).build();
    Assert.assertEquals(sboo.getStockID(),"bo123");
    Assert.assertEquals(sboo.getSellingPrice(),1500.0);
    Assert.assertEquals(sboo.getCostPrice(),1000.0);}
    
     @Test
    public void testUpdate()throws Exception {
    SellingBoots sbooN = new SellingBoots.Builder("bo123").sellingPrice(1500.0).tax(14).costPrice(1000.0).build();
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
