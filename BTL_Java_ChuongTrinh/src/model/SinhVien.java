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
public class SinhVien{
    private String maSV;
    private String hoTenSV;
    private String maNganh;
    private String maKhoa;

    public SinhVien() {
    }

    public SinhVien(String hoTenSV, String maNganh) {
        this.hoTenSV = hoTenSV;
        this.maNganh = maNganh;
    }

    public SinhVien(String maSV, String hoTenSV, String maNganh, String maKhoa) {
        this.maSV = maSV;
        this.hoTenSV = hoTenSV;
        this.maNganh = maNganh;
        this.maKhoa = maKhoa;
    }
    
    public String getMaSV() {
        return maSV;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    
}
