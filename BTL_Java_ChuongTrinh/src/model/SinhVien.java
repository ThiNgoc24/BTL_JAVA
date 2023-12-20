/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

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

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }
}
