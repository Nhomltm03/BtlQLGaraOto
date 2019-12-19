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
public class DichVuLinhKienTest {
    
    public DichVuLinhKienTest() {
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
     * Test of getMaDVLK method, of class DichVuLinhKien.
     */
    @Test
    public void testGetMaDVLK() {
        System.out.println("getMaDVLK");
        DichVuLinhKien instance = new DichVuLinhKien();
        int expResult = 0;
        int result = instance.getMaDVLK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaDVLK method, of class DichVuLinhKien.
     */
    @Test
    public void testSetMaDVLK() {
        System.out.println("setMaDVLK");
        int maDVLK = 0;
        DichVuLinhKien instance = new DichVuLinhKien();
        instance.setMaDVLK(maDVLK);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTenDVKL method, of class DichVuLinhKien.
     */
    @Test
    public void testGetTenDVKL() {
        System.out.println("getTenDVKL");
        DichVuLinhKien instance = new DichVuLinhKien();
        String expResult = "";
        String result = instance.getTenDVKL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenDVKL method, of class DichVuLinhKien.
     */
    @Test
    public void testSetTenDVKL() {
        System.out.println("setTenDVKL");
        String tenDVKL = "";
        DichVuLinhKien instance = new DichVuLinhKien();
        instance.setTenDVKL(tenDVKL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDonGia method, of class DichVuLinhKien.
     */
    @Test
    public void testGetDonGia() {
        System.out.println("getDonGia");
        DichVuLinhKien instance = new DichVuLinhKien();
        long expResult = 0L;
        long result = instance.getDonGia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDonGia method, of class DichVuLinhKien.
     */
    @Test
    public void testSetDonGia() {
        System.out.println("setDonGia");
        long donGia = 0L;
        DichVuLinhKien instance = new DichVuLinhKien();
        instance.setDonGia(donGia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toObject method, of class DichVuLinhKien.
     */
    @Test
    public void testToObject() {
        System.out.println("toObject");
        DichVuLinhKien instance = new DichVuLinhKien();
        Object[] expResult = null;
        Object[] result = instance.toObject();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
