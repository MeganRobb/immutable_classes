/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.immutable_classes;

import com.meganrobb.immutable_classes.model.stockSuppliers.Shipping;
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
public class ShippingTest {
    
    public ShippingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCreation()throws Exception{
    Shipping ship = new Shipping.Builder("saf234").shipArrival("12:45").shipCost(14365.98).shipName("Safmarine").build();
    Assert.assertEquals(ship.getShipID(),"saf234");
    Assert.assertEquals(ship.getShipArrival(),"12:45");
    Assert.assertEquals(ship.getShipCost(),14365.98);
    Assert.assertEquals(ship.getShipName(),"Safmarine");
    
    }
    
     @Test
    public void testUpdate()throws Exception {
    Shipping shipN = new Shipping.Builder("saf234").shipArrival("12:45").shipCost(14365.98).shipName("Safmarine").build();
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
