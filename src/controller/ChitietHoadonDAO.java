/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ChiTietDVLKSudung;
import model.KhachHang;

/**
 *
 * @author admin
 */
public class ChitietHoadonDAO extends DAO {

    private static final String COL_MA_DV_LK = "maDVLK";
    private static final String COL_TEN_DV_LK = "ten";
    private static final String COL_SO_LUONG_DV_LK = "soLuong";
    private static final String COL_DON_GIA_DV_LK = "donGia";
    private static final String COL_TONG_TIEN_DV_LK = "soTien";

    private static final String COL_TEN_KH = "tenKH";
    private static final String COL_SDT_KH = "sdt";
    private static final String COL_DC_KH = "diaChi";
    private static final String COL_NOTE_KH = "ghiChu";

    public ChitietHoadonDAO() {
        super();
    }

    public KhachHang getThongTinKH(String maKH) {

        KhachHang thongtinKh = new KhachHang();

        String query = "select kh.*, oto.dongXe\n"
                + "FROM tblkhachhang kh\n"
                + "inner JOIN tbloto oto\n"
                + "ON oto.maKH = kh.maKH\n"
                + "WHERE kh.maKH = "+maKH+"\n"
                + ";";

        try {
            PreparedStatement ps = connectionToDB.prepareStatement(query);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    thongtinKh.setMaKH(Integer.parseInt(maKH));
                    thongtinKh.setTenKH(rs.getString(COL_TEN_KH));
                    thongtinKh.setSdt(rs.getString(COL_SDT_KH));
                    thongtinKh.setDiaChi(rs.getString(COL_DC_KH));
                    thongtinKh.setGhiChu(rs.getString(COL_NOTE_KH));
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return thongtinKh;
    }

    public ArrayList<ChiTietDVLKSudung> getListDVLKSudung(String maHD) {
        ArrayList<ChiTietDVLKSudung> listDVLKSudung = new ArrayList<>();

        String query = "select dd.maDVLK, dv.ten, dd.soLuong, dv.donGia, (dd.soLuong* dv.donGia) as soTien\n"
                + "from tblhoadon hd\n"
                + "inner join tbldichvulinhkiendadung dd\n"
                + "on hd.maHoaDon = dd.maHoaDon\n"
                + "inner join tbldichvulinkkien dv\n"
                + "on dd.maDVLK = dv.maDVLK\n"
                + "where hd.maHoaDon = " + maHD + ";";

        try {
            PreparedStatement ps = connectionToDB.prepareStatement(query);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    ChiTietDVLKSudung chiTietDVLKSudung = new ChiTietDVLKSudung();
                    chiTietDVLKSudung.setMaDVLK(Integer.parseInt(rs.getString(COL_MA_DV_LK)));
                    chiTietDVLKSudung.setMaHD(Integer.parseInt(maHD));
                    chiTietDVLKSudung.setTenDVLK(rs.getString(COL_TEN_DV_LK));
                    chiTietDVLKSudung.setGiaThanh(Long.parseLong(rs.getString(COL_DON_GIA_DV_LK)));
                    chiTietDVLKSudung.setSoLuong(Integer.parseInt(rs.getString(COL_SO_LUONG_DV_LK)));
                    chiTietDVLKSudung.setTongTien(Long.parseLong(rs.getString(COL_TONG_TIEN_DV_LK)));
                    listDVLKSudung.add(chiTietDVLKSudung);
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listDVLKSudung;
    }

}
