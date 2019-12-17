/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class HoaDonTrongThang {

    private String maHD;
    private String ngayThanhToan;
    private String tenKH;
    private String maKH;
    private String dongXe;
    private String tongDVLK;
    private String tongTien;

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getDongXe() {
        return dongXe;
    }

    public void setDongXe(String dongXe) {
        this.dongXe = dongXe;
    }

    public String getTongDVLK() {
        return tongDVLK;
    }

    public void setTongDVLK(String tongDVLK) {
        this.tongDVLK = tongDVLK;
    }

    public String getTongTien() {
        return tongTien;
    }

    public void setTongTien(String tongTien) {
        this.tongTien = tongTien;
    }

    public Object[] toObject() {
        return new Object[]{maHD, ngayThanhToan, maKH, tenKH, dongXe, tongDVLK, tongTien};

    }

}
