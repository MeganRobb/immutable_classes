/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.salaries.HOManagement;
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
public class HOManagementTest {
    
    public HOManagementTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    HOManagement man = new HOManagement.Builder("abr123").staffDescrip("Executive HR").staffDeductions(2300.50).build();
    Assert.assertEquals(man.getStaffID(),"abr123");
    Assert.assertEquals(man.getStaffDescrip(),"Executive HR");
    Assert.assertEquals(man.getStaffDeductions(),2300.50);}
    
     @Test
    public void testUpdate()throws Exception {
    HOManagement manN = new HOManagement.Builder("han123").staffDescrip("Executive HR").staffDeductions(2300.50).build();
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
