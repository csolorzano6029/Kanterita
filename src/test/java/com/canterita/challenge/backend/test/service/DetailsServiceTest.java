/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDetailsDto;
import com.canterita.challenge.backend.test.model.OrderDetailsEntity;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * @author TheLegends
 */
public class DetailsServiceTest {

    public DetailsServiceTest() {
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
     * Test of extractOrderDetails method, of class DetailsService.
     */
    @Test
    public void testExtractOrderDetails() {
        System.out.println("extractOrderDetails");
        Long idOrder = null;
        OrderDetailsService instance = new OrderDetailsService();
        OrderDetailsDto expResult = null;
        OrderDetailsDto result = instance.extractOrderDetails(idOrder);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveInformationDetails method, of class DetailsService.
     */
    @Test
    public void testSaveInformationDetails() {
        System.out.println("saveInformationDetails");
        OrderDetailsDto details = null;
        Long id = null;
        OrderDetailsService instance = new OrderDetailsService();
        OrderDetailsEntity expResult = null;
        OrderDetailsEntity result = instance.saveInformationDetails(details, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showDetails method, of class DetailsService.
     */
    @Test
    public void testShowDetails() {
        System.out.println("showDetails");
        OrderDetailsService instance = new OrderDetailsService();
        ArrayList<OrderDetailsEntity> expResult = null;
        ArrayList<OrderDetailsEntity> result = instance.showDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderId method, of class DetailsService.
     */
    @Test
    public void testOrderId() {
        System.out.println("orderId");
        Long id = null;
        OrderDetailsService instance = new OrderDetailsService();
        ArrayList<OrderDetailsEntity> expResult = null;
        ArrayList<OrderDetailsEntity> result = instance.orderId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
