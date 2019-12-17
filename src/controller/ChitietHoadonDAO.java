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

    public ChitietHoadonDAO() {
        super();
    }

    public KhachHang getThongTinKH(String maKH) {

        KhachHang thongtinKh = new KhachHang();

        String query = "";

        try {
            PreparedStatement ps = connectionToDB.prepareStatement(query);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
//                    HoaDonTrongThang hdThang = new HoaDonTrongThang();
//                    hdThang.setMaHD(rs.getString(COL_MA_HD));
//                    hdThang.setNgayThanhToan(rs.getString(COL_NGAY));
//                    hdThang.setMaKH(rs.getString(COL_MA_KH));
//                    hdThang.setTenKH(rs.getString(COL_TEN_KH));
//                    hdThang.setDongXe(rs.getString(COL_TEN_XE));
//                    hdThang.setTongDVLK(rs.getString(COL_TONG_DV_LK));
//                    hdThang.setTongTien(rs.getString(COL_TONG_TIEN));
//                    listHDTrongThang.add(hdThang);
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
