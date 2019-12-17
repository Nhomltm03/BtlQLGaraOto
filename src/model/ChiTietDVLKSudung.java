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
public class ChiTietDVLKSudung implements Serializable{
    
    
    private int maHD;
    private int maDVLK;
    private int soLuong;
    private long giaThanh;
    private long tongTien;
    private String tenDVLK;

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaDVLK() {
        return maDVLK;
    }

    public void setMaDVLK(int maDVLK) {
        this.maDVLK = maDVLK;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(long giaThanh) {
        this.giaThanh = giaThanh;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }
    

    public String getTenDVLK() {
        return tenDVLK;
    }

    public void setTenDVLK(String tenDVLK) {
        this.tenDVLK = tenDVLK;
    }
    
    
    
    public Object[] toObject() {
        return new Object[]{ maDVLK, tenDVLK, soLuong,giaThanh,tongTien};

    } 
    
}
