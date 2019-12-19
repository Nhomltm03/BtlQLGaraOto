/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.DoanhThuThang;
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
public class ThongKeDoanhThuThangDAOTest {
    
    public ThongKeDoanhThuThangDAOTest() {
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
     * Test of getDoanhThuThang method, of class ThongKeDoanhThuThangDAO.
     */
    @Test
    public void testGetDoanhThuThang() {
        System.out.println("getDoanhThuThang");
        ThongKeDoanhThuThangDAO instance = new ThongKeDoanhThuThangDAO();
        ArrayList<DoanhThuThang> expResult = null;
        ArrayList<DoanhThuThang> result = instance.getDoanhThuThang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
