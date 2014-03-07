/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.stockSuppliers.Suppliers;
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
public class SuppliersTest {
    
    public SuppliersTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    Suppliers sup = new Suppliers.Builder("fu567").supplierName("FuNU").supplierLOcation("China").build();
    Assert.assertEquals(sup.getSupplierID(),"fu567");
    Assert.assertEquals(sup.getSupplierName(),"FuNU");
    Assert.assertEquals(sup.getSupplierLOcation(),"China");
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    Suppliers supN = new Suppliers.Builder("fu567").supplierName("FuNU").supplierLOcation("China").build();
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
