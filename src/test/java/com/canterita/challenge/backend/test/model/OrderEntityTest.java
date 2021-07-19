/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.canterita.challenge.backend.test.model;

import java.time.LocalDateTime;
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
public class OrderEntityTest {
    
    public OrderEntityTest() {
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
     * Test of getId method, of class OrderEntity.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        OrderEntity instance = new OrderEntity();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class OrderEntity.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        OrderEntity instance = new OrderEntity();
        String expResult = "";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class OrderEntity.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        OrderEntity instance = new OrderEntity();
        String expResult = "";
        String result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class OrderEntity.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        OrderEntity instance = new OrderEntity();
        Double expResult = null;
        Double result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOrder method, of class OrderEntity.
     */
    @Test
    public void testGetDateOrder() {
        System.out.println("getDateOrder");
        OrderEntity instance = new OrderEntity();
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getDateOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class OrderEntity.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        OrderEntity instance = new OrderEntity();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class OrderEntity.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        String number = "";
        OrderEntity instance = new OrderEntity();
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class OrderEntity.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        String client = "";
        OrderEntity instance = new OrderEntity();
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class OrderEntity.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        Double total = null;
        OrderEntity instance = new OrderEntity();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOrder method, of class OrderEntity.
     */
    @Test
    public void testSetDateOrder() {
        System.out.println("setDateOrder");
        LocalDateTime dateOrder = null;
        OrderEntity instance = new OrderEntity();
        instance.setDateOrder(dateOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class OrderEntity.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        OrderEntity instance = new OrderEntity();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class OrderEntity.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        OrderEntity instance = new OrderEntity();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class OrderEntity.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        OrderEntity instance = new OrderEntity();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OrderEntity.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        OrderEntity instance = new OrderEntity();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
