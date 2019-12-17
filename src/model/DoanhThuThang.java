/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class DoanhThuThang implements Serializable{
    private String tenThang;
    private int tongDoanhThuThang;

    public String getTenThang() {
        return tenThang;
    }

    public void setTenThang(String tenThang) {
        this.tenThang = tenThang;
    }

    public int getTongDoanhThuThang() {
        return tongDoanhThuThang;
    }

    public void setTongDoanhThuThang(int tongDoanhThuThang) {
        this.tongDoanhThuThang = tongDoanhThuThang;
    }
    
    
    
    public Object[] toObject() {
        return new Object[]{tenThang,tongDoanhThuThang};
       
    }
    
    
    
}
