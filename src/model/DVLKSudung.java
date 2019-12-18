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
public class DVLKSudung implements Serializable{
    
    private DichVuLinhKien dichVuLinhKien;
    private int soLuong;
    private long tongTien;

    public DVLKSudung(DichVuLinhKien dichVuLinhKien) {
        this.dichVuLinhKien = dichVuLinhKien;
    }
    

    public DichVuLinhKien getDichVuLinhKien() {
        return dichVuLinhKien;
    }

    public void setDichVuLinhKien(DichVuLinhKien dichVuLinhKien) {
        this.dichVuLinhKien = dichVuLinhKien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getTongTien() {
        return tongTien;
    }

    public void setTongTien(long tongTien) {
        this.tongTien = tongTien;
    }
    
    
      public Object[] toObject() {
        return new Object[]{ getDichVuLinhKien().getMaDVLK(), getDichVuLinhKien().getTenDVKL(), soLuong,getDichVuLinhKien().getDonGia(),tongTien};
    } 
    
    
}
