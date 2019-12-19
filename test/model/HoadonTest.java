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
public class HoadonTest {
    
    public HoadonTest() {
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
     * Test of getMaHD method, of class Hoadon.
     */
    @Test
    public void testGetMaHD() {
        System.out.println("getMaHD");
        Hoadon instance = null;
        int expResult = 0;
        int result = instance.getMaHD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaHD method, of class Hoadon.
     */
    @Test
    public void testSetMaHD() {
        System.out.println("setMaHD");
        int maHD = 0;
        Hoadon instance = null;
        instance.setMaHD(maHD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNgayThanhtoan method, of class Hoadon.
     */
    @Test
    public void testGetNgayThanhtoan() {
        System.out.println("getNgayThanhtoan");
        Hoadon instance = null;
        String expResult = "";
        String result = instance.getNgayThanhtoan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayThanhtoan method, of class Hoadon.
     */
    @Test
    public void testSetNgayThanhtoan() {
        System.out.println("setNgayThanhtoan");
        String ngayThanhtoan = "";
        Hoadon instance = null;
        instance.setNgayThanhtoan(ngayThanhtoan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKhachHang method, of class Hoadon.
     */
    @Test
    public void testGetKhachHang() {
        System.out.println("getKhachHang");
        Hoadon instance = null;
        KhachHang expResult = null;
        KhachHang result = instance.getKhachHang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKhachHang method, of class Hoadon.
     */
    @Test
    public void testSetKhachHang() {
        System.out.println("setKhachHang");
        KhachHang khachHang = null;
        Hoadon instance = null;
        instance.setKhachHang(khachHang);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdVLKSudung method, of class Hoadon.
     */
    @Test
    public void testGetdVLKSudung() {
        System.out.println("getdVLKSudung");
        Hoadon instance = null;
        DVLKSudung expResult = null;
        DVLKSudung result = instance.getdVLKSudung();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setdVLKSudung method, of class Hoadon.
     */
    @Test
    public void testSetdVLKSudung() {
        System.out.println("setdVLKSudung");
        DVLKSudung dVLKSudung = null;
        Hoadon instance = null;
        instance.setdVLKSudung(dVLKSudung);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toObject method, of class Hoadon.
     */
    @Test
    public void testToObject() {
        System.out.println("toObject");
        Hoadon instance = null;
        Object[] expResult = null;
        Object[] result = instance.toObject();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
