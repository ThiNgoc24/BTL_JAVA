/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class TTDonTapThe {
    private String maDonTapThe;
    private String tenHP;
    private String maHP;
    private String lyDo;
    private List<SinhVienTapThe> dsSV;

    public TTDonTapThe() {
    }

    public TTDonTapThe(String maDonTapThe, String tenHP, String maHP, String lyDo, List<SinhVienTapThe> dsSV) {
        this.maDonTapThe = maDonTapThe;
        this.tenHP = tenHP;
        this.maHP = maHP;
        this.lyDo = lyDo;
        this.dsSV = dsSV;
    }

    public String getMaDonTapThe() {
        return maDonTapThe;
    }

    public void setMaDonTapThe(String maDonTapThe) {
        this.maDonTapThe = maDonTapThe;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }


    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public List<SinhVienTapThe> getDsSV() {
        return dsSV;
    }

    public void setDsSV(List<SinhVienTapThe> dsSV) {
        this.dsSV = dsSV;
    }
    
     public void addSinhVienTapThe(SinhVienTapThe sinhVienTapThe) {
        dsSV.add(sinhVienTapThe);
    }
    
    
}
