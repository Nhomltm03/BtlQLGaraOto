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
import model.DVLKSudung;
import model.DichVuLinhKien;
import model.Hoadon;
import model.KhachHang;
import model.Oto;

/**
 *
 * @author admin
 */
public class DanhsachHoaDonThangDAO extends DAO {

    private static final String COL_MA_HD = "maHoaDon";
    private static final String COL_NGAY = "ngayThanhToan";
    private static final String COL_MA_KH = "maKH";
    private static final String COL_TEN_KH = "tenKH";
    private static final String COL_TEN_XE = "dongXe";
    private static final String COL_TONG_DV_LK = "tongDVLK";
    private static final String COL_TONG_TIEN = "tongTien";

    public DanhsachHoaDonThangDAO() {
        super();
    }

    public ArrayList<Hoadon> getDanhSachHoadonTrongThang(String numQuery) {
        ArrayList<Hoadon> listHoadon = new ArrayList<>();

        String query = "select hd.maHoaDon, hd.ngayThanhToan, kh.*,"
                + " oto.dongXe,sum(dd.soLuong)tongDVLK,"
                + " sum(dd.soLuong* dv.donGia) AS tongTien\n"
                + "from tblhoadon hd\n"
                + "inner join tbloto oto\n"
                + "on hd.maOto = oto.maOto\n"
                + "inner join tblkhachhang kh\n"
                + "on kh.maKH = oto.maKH\n"
                + "inner join tbldichvulinhkiendadung dd\n"
                + "on hd.maHoaDon = dd.maHoaDon\n"
                + "inner join tbldichvulinkkien dv\n"
                + "on dd.maDVLK = dv.maDVLK\n"
                + "where month(hd.ngayThanhToan) = " + numQuery + " \n"
                + "group BY hd.maHoaDon \n"
                + "ORDER BY DATE(hd.ngayThanhToan) DESC;";

        try {
            PreparedStatement ps = connectionToDB.prepareStatement(query);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next() ) {
                    Oto oto = new Oto();
                    KhachHang khachHang = new KhachHang(oto);
                    DichVuLinhKien dichVuLinhKien = new DichVuLinhKien();
                    DVLKSudung dVLKSudung = new DVLKSudung(dichVuLinhKien);
                    Hoadon hd = new Hoadon(khachHang, dVLKSudung);
                    hd.setMaHD(Integer.parseInt(rs.getString(COL_MA_HD)));
                    hd.setNgayThanhtoan(rs.getString(COL_NGAY));
                    khachHang.setMaKH(Integer.parseInt(rs.getString(COL_MA_KH)));
                    khachHang.setTenKH(rs.getString(COL_TEN_KH));
                    oto.setDongXe(rs.getString(COL_TEN_XE));
                    dVLKSudung.setSoLuong(Integer.parseInt(rs.getString(COL_TONG_DV_LK)));
                    dVLKSudung.setTongTien(Long.parseLong(rs.getString(COL_TONG_TIEN)));
                    listHoadon.add(hd);
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listHoadon;
    }

}
