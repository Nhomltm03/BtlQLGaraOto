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
public class Oto implements Serializable {

    private int maOto;
    private String bienSo;
    private String dongXe;
    private String hangXe;
    private String moTa;

    public int getMaOto() {
        return maOto;
    }

    public void setMaOto(int maOto) {
        this.maOto = maOto;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getDongXe() {
        return dongXe;
    }

    public void setDongXe(String dongXe) {
        this.dongXe = dongXe;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Object[] toObject() {
        return new Object[]{maOto, bienSo, dongXe, hangXe, moTa};
    }
}
