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
public class DVLKSudungTest {
    
    public DVLKSudungTest() {
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
     * Test of getDichVuLinhKien method, of class DVLKSudung.
     */
    @Test
    public void testGetDichVuLinhKien() {
        System.out.println("getDichVuLinhKien");
        DVLKSudung instance = null;
        DichVuLinhKien expResult = null;
        DichVuLinhKien result = instance.getDichVuLinhKien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDichVuLinhKien method, of class DVLKSudung.
     */
    @Test
    public void testSetDichVuLinhKien() {
        System.out.println("setDichVuLinhKien");
        DichVuLinhKien dichVuLinhKien = null;
        DVLKSudung instance = null;
        instance.setDichVuLinhKien(dichVuLinhKien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSoLuong method, of class DVLKSudung.
     */
    @Test
    public void testGetSoLuong() {
        System.out.println("getSoLuong");
        DVLKSudung instance = null;
        int expResult = 0;
        int result = instance.getSoLuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoLuong method, of class DVLKSudung.
     */
    @Test
    public void testSetSoLuong() {
        System.out.println("setSoLuong");
        int soLuong = 0;
        DVLKSudung instance = null;
        instance.setSoLuong(soLuong);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTongTien method, of class DVLKSudung.
     */
    @Test
    public void testGetTongTien() {
        System.out.println("getTongTien");
        DVLKSudung instance = null;
        long expResult = 0L;
        long result = instance.getTongTien();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTongTien method, of class DVLKSudung.
     */
    @Test
    public void testSetTongTien() {
        System.out.println("setTongTien");
        long tongTien = 0L;
        DVLKSudung instance = null;
        instance.setTongTien(tongTien);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toObject method, of class DVLKSudung.
     */
    @Test
    public void testToObject() {
        System.out.println("toObject");
        DVLKSudung instance = null;
        Object[] expResult = null;
        Object[] result = instance.toObject();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
