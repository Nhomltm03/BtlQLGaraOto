/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.DVLKSudung;
import model.KhachHang;
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
public class ChitietHoadonDAOTest {
    
    public ChitietHoadonDAOTest() {
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
     * Test of getThongTinKH method, of class ChitietHoadonDAO.
     */
    @Test
    public void testGetThongTinKH() {
        System.out.println("getThongTinKH");
        String maKH = "xxx";
        ChitietHoadonDAO instance = new ChitietHoadonDAO();
        KhachHang expResult = null;
        KhachHang result = instance.getThongTinKH(maKH);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListDVLKDadung method, of class ChitietHoadonDAO.
     */
    @Test
    public void testGetListDVLKDadung() {
        System.out.println("getListDVLKDadung");
        String maHD = "aaa";
        ChitietHoadonDAO instance = new ChitietHoadonDAO();
        ArrayList<DVLKSudung> expResult = null;
        ArrayList<DVLKSudung> result = instance.getListDVLKDadung(maHD);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
