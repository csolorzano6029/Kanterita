/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canterita.challenge.backend.test.rest;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.DetailsEntity;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TheLegends
 */
public class DetailsControllerTest {
    
    public DetailsControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of orderId method, of class DetailsController.
     */
    @Test
    public void testOrderId() {
        System.out.println("orderId");
        Long id = null;
        DetailsController instance = new DetailsController();
        ArrayList<DetailsEntity> expResult = null;
        ArrayList<DetailsEntity> result = instance.orderId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDetails method, of class DetailsController.
     */
    @Test
    public void testShowDetails() {
        System.out.println("showDetails");
        DetailsController instance = new DetailsController();
        ArrayList<DetailsEntity> expResult = null;
        ArrayList<DetailsEntity> result = instance.showDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveInformationDetails method, of class DetailsController.
     */
    @Test
    public void testSaveInformationDetails() {
        System.out.println("saveInformationDetails");
        OrderDetailsDto order = null;
        Long id = null;
        DetailsController instance = new DetailsController();
        DetailsEntity expResult = null;
        DetailsEntity result = instance.saveInformationDetails(order, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
