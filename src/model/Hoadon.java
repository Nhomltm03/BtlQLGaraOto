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
public class Hoadon {

    private int maHD;
    private String ngayThanhtoan;
    private KhachHang khachHang;
    private DVLKSudung dVLKSudung;

    public Hoadon(KhachHang khachHang, DVLKSudung dVLKSudung) {
        this.khachHang = khachHang;
        this.dVLKSudung = dVLKSudung;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public String getNgayThanhtoan() {
        return ngayThanhtoan;
    }

    public void setNgayThanhtoan(String ngayThanhtoan) {
        this.ngayThanhtoan = ngayThanhtoan;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DVLKSudung getdVLKSudung() {
        return dVLKSudung;
    }

    public void setdVLKSudung(DVLKSudung dVLKSudung) {
        this.dVLKSudung = dVLKSudung;
    }

    public Object[] toObject() {
        return new Object[]{maHD, ngayThanhtoan, khachHang.getTenKH(), khachHang.getOto().getDongXe(),
             dVLKSudung.getSoLuong(), dVLKSudung.getTongTien()};
    }

}
