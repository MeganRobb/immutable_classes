/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.service;

import com.meganrobb.immutable_classes.model.salaries.HOEmployees;
import com.meganrobb.immutable_classes.service.crud.HOEmployeesCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class HOEmployeesTestCrudService {
    
   @Mock
    HOEmployeesCrudService CrudService;
    
    
    

   @BeforeClass
    public void setUpClass() throws Exception {
        MockitoAnnotations.initMocks(this);
        CrudService = Mockito.mock(HOEmployeesCrudService.class);
    }
    @Test
     public void testCreate() throws Exception {
       HOEmployees emp = new HOEmployees.Builder("hop123").staffDescrip("Import/Export").staffDeductions(1234.0).build();
        HOEmployees returnHOEmployees = CrudService.persist(emp);
        when(CrudService.persist(emp)).thenReturn(returnHOEmployees);
        Mockito.verify(CrudService).persist(emp);

     }
      @Test
    public void testRead() throws Exception {
         HOEmployees emp = new HOEmployees.Builder("hop123").staffDescrip("Import/Export").staffDeductions(1234.0).build();
        HOEmployees returnHOEmployees = CrudService.find(emp.getStaffID());
        when(CrudService.find(emp.getStaffID())).thenReturn(returnHOEmployees);
        Mockito.verify(CrudService).find(emp.getStaffID());

    }
    @Test
    public void testDelete() throws Exception {

        HOEmployees emp = new HOEmployees.Builder("hop123").staffDescrip("Import/Export").staffDeductions(1234.0).build();
        HOEmployees returnHOEmployees = CrudService.remove(emp);
        when(CrudService.remove(emp)).thenReturn(returnHOEmployees);
        Mockito.verify(CrudService).remove(emp);

    }
}
