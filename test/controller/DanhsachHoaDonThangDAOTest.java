/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Hoadon;
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
public class DanhsachHoaDonThangDAOTest {
    
    public DanhsachHoaDonThangDAOTest() {
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
     * Test of getDanhSachHoadonTrongThang method, of class DanhsachHoaDonThangDAO.
     */
    @Test
    public void testGetDanhSachHoadonTrongThang() {
        System.out.println("getDanhSachHoadonTrongThang");
        String numQuery = "";
        DanhsachHoaDonThangDAO instance = new DanhsachHoaDonThangDAO();
        ArrayList<Hoadon> expResult = null;
        ArrayList<Hoadon> result = instance.getDanhSachHoadonTrongThang(numQuery);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
