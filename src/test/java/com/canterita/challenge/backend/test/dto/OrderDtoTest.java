
package com.canterita.challenge.backend.test.dto;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrderDtoTest {
    
    public OrderDtoTest() {
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
     * Test of getId method, of class OrderDto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        OrderDto instance = null;
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber method, of class OrderDto.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        OrderDto instance = null;
        String expResult = "";
        String result = instance.getNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class OrderDto.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        OrderDto instance = null;
        String expResult = "";
        String result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class OrderDto.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        OrderDto instance = null;
        Double expResult = null;
        Double result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateOrder method, of class OrderDto.
     */
    @Test
    public void testGetDateOrder() {
        System.out.println("getDateOrder");
        OrderDto instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getDateOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class OrderDto.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        OrderDto instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber method, of class OrderDto.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        String number = "";
        OrderDto instance = null;
        instance.setNumber(number);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class OrderDto.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        String client = "";
        OrderDto instance = null;
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class OrderDto.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        Double total = null;
        OrderDto instance = null;
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateOrder method, of class OrderDto.
     */
    @Test
    public void testSetDateOrder() {
        System.out.println("setDateOrder");
        LocalDateTime dateOrder = null;
        OrderDto instance = null;
        instance.setDateOrder(dateOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class OrderDto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        OrderDto instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class OrderDto.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        OrderDto instance = null;
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class OrderDto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        OrderDto instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class OrderDto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        OrderDto instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
