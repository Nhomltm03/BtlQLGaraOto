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
public class DichVuLinhKien implements Serializable {

    private int maDVLK;
    private String tenDVKL;
    private double donGia;

    public int getMaDVLK() {
        return maDVLK;
    }

    public void setMaDVLK(int maDVLK) {
        this.maDVLK = maDVLK;
    }

    public String getTenDVKL() {
        return tenDVKL;
    }

    public void setTenDVKL(String tenDVKL) {
        this.tenDVKL = tenDVKL;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Object[] toObject() {
        return new Object[]{maDVLK, tenDVKL, donGia};

    }

}
