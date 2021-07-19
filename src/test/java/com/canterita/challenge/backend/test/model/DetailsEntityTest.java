/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canterita.challenge.backend.test.model;

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
public class DetailsEntityTest {
    
    public DetailsEntityTest() {
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
     * Test of getId method, of class DetailsEntity.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        DetailsEntity instance = new DetailsEntity();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdOrder method, of class DetailsEntity.
     */
    @Test
    public void testGetIdOrder() {
        System.out.println("getIdOrder");
        DetailsEntity instance = new DetailsEntity();
        Long expResult = null;
        Long result = instance.getIdOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDetail method, of class DetailsEntity.
     */
    @Test
    public void testGetDetail() {
        System.out.println("getDetail");
        DetailsEntity instance = new DetailsEntity();
        String expResult = "";
        String result = instance.getDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class DetailsEntity.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        DetailsEntity instance = new DetailsEntity();
        Double expResult = null;
        Double result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitPrice method, of class DetailsEntity.
     */
    @Test
    public void testGetUnitPrice() {
        System.out.println("getUnitPrice");
        DetailsEntity instance = new DetailsEntity();
        Double expResult = null;
        Double result = instance.getUnitPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDetail method, of class DetailsEntity.
     */
    @Test
    public void testGetTotalDetail() {
        System.out.println("getTotalDetail");
        DetailsEntity instance = new DetailsEntity();
        Double expResult = null;
        Double result = instance.getTotalDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class DetailsEntity.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        DetailsEntity instance = new DetailsEntity();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class DetailsEntity.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        DetailsEntity instance = new DetailsEntity();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class DetailsEntity.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        DetailsEntity instance = new DetailsEntity();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class DetailsEntity.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        DetailsEntity instance = new DetailsEntity();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class DetailsEntity.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        DetailsEntity instance = new DetailsEntity();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdOrder method, of class DetailsEntity.
     */
    @Test
    public void testSetIdOrder() {
        System.out.println("setIdOrder");
        Long idOrder = null;
        DetailsEntity instance = new DetailsEntity();
        instance.setIdOrder(idOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDetail method, of class DetailsEntity.
     */
    @Test
    public void testSetDetail() {
        System.out.println("setDetail");
        String detail = "";
        DetailsEntity instance = new DetailsEntity();
        instance.setDetail(detail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class DetailsEntity.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        Double amount = null;
        DetailsEntity instance = new DetailsEntity();
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnitPrice method, of class DetailsEntity.
     */
    @Test
    public void testSetUnitPrice() {
        System.out.println("setUnitPrice");
        Double unitPrice = null;
        DetailsEntity instance = new DetailsEntity();
        instance.setUnitPrice(unitPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalDetail method, of class DetailsEntity.
     */
    @Test
    public void testSetTotalDetail() {
        System.out.println("setTotalDetail");
        Double totalDetail = null;
        DetailsEntity instance = new DetailsEntity();
        instance.setTotalDetail(totalDetail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
