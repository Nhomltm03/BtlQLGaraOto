/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class DoanhThuThangTest {
    
    public DoanhThuThangTest() {
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
     * Test of getTenThang method, of class DoanhThuThang.
     */
    @Test
    public void testGetTenThang() {
        System.out.println("getTenThang");
        DoanhThuThang instance = new DoanhThuThang();
        String expResult = "";
        String result = instance.getTenThang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenThang method, of class DoanhThuThang.
     */
    @Test
    public void testSetTenThang() {
        System.out.println("setTenThang");
        String tenThang = "";
        DoanhThuThang instance = new DoanhThuThang();
        instance.setTenThang(tenThang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTongDoanhThuThang method, of class DoanhThuThang.
     */
    @Test
    public void testGetTongDoanhThuThang() {
        System.out.println("getTongDoanhThuThang");
        DoanhThuThang instance = new DoanhThuThang();
        String expResult = "";
        String result = instance.getTongDoanhThuThang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTongDoanhThuThang method, of class DoanhThuThang.
     */
    @Test
    public void testSetTongDoanhThuThang() {
        System.out.println("setTongDoanhThuThang");
        String tongDoanhThuThang = "";
        DoanhThuThang instance = new DoanhThuThang();
        instance.setTongDoanhThuThang(tongDoanhThuThang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toObject method, of class DoanhThuThang.
     */
    @Test
    public void testToObject() {
        System.out.println("toObject");
        DoanhThuThang instance = new DoanhThuThang();
        Object[] expResult = null;
        Object[] result = instance.toObject();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
