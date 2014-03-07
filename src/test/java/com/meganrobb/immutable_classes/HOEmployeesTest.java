/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.salaries.HOEmployees;
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
public class HOEmployeesTest {
    
    public HOEmployeesTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    HOEmployees emp = new HOEmployees.Builder("hop123").staffDescrip("Import/Export").staffDeductions(1234.0).build();
    Assert.assertEquals(emp.getStaffID(),"hop123");
    Assert.assertEquals(emp.getStaffDescrip(),"Import/Export");
    Assert.assertEquals(emp.getStaffDeductions(),1234.0);}
    
     @Test
    public void testUpdate()throws Exception {
    HOEmployees empN = new HOEmployees.Builder("hop123").staffDescrip("assistant Buyer").staffDeductions(1234.0).build();
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
