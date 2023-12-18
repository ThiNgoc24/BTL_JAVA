/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class SinhVien {
    private String maSV;
    private String hoTenSV;
    private HashSet<Nganh> chiTietNganh;
    private String maTK;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTenSV, HashSet<Nganh> chiTietNganh) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.chiTietNganh = chiTietNganh;
        this.maTK = this.maSV;
    }

    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
        this.maTK = this.maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public HashSet<Nganh> getChiTietNganh() {
        return chiTietNganh;
    }

    public void setChiTietNganh(HashSet<Nganh> chiTietNganh) {
        this.chiTietNganh = chiTietNganh;
    }
    
    
    
    
    
}
