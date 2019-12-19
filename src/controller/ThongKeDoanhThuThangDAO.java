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
import model.DoanhThuThang;

/**
 *
 * @author admin
 */
public class ThongKeDoanhThuThangDAO extends DAO implements  ThongKeDoanhThuThang{

    private static final String COL_THANG = "thang";
    private static final String COL_DOANH_THU = "doanhThu";

    public ThongKeDoanhThuThangDAO() {
        super();
    }

    @Override
    public ArrayList<DoanhThuThang> getDoanhThuThang() {
        ArrayList<DoanhThuThang> listDoanhThuThang = new ArrayList<>();

        String query = "select month(hd.ngayThanhToan) as thang, sum(dd.soLuong* dv.donGia) as doanhthu\n"
                + "from tblhoadon hd\n"
                + "inner join tbldichvulinhkiendadung dd\n"
                + "on hd.maHoaDon = dd.maHoaDon\n"
                + "inner join tbldichvulinkkien dv\n"
                + "on dd.maDVLK = dv.maDVLK\n"
                + "group by thang ORDER BY DATE(hd.ngayThanhToan) DESC;";

        try {
            PreparedStatement ps = connectionToDB.prepareStatement(query);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    DoanhThuThang doanhThuThang = new DoanhThuThang();
                    doanhThuThang.setTenThang(rs.getString(COL_THANG));
                    doanhThuThang.setTongDoanhThuThang(rs.getString(COL_DOANH_THU));
                    listDoanhThuThang.add(doanhThuThang);
                }
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listDoanhThuThang;
    }

}
