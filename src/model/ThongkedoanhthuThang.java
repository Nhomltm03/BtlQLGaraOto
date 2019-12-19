/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ThongkedoanhthuThang extends Hoadon{

private ArrayList<Hoadon> listHD;

    public ThongkedoanhthuThang(KhachHang khachHang, DVLKSudung dVLKSudung) {
        super(khachHang, dVLKSudung);
    }

    public ArrayList<Hoadon> getListHD() {
        return listHD;
    }

    public void setListHD(ArrayList<Hoadon> listHD) {
        this.listHD = listHD;
    }

    
   
    
    
}
