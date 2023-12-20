/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class TTDSDonDangKy {
    private String maDon;
    private String maSV;
    private String maHP;
    private String tenHP;
    private String loaiDon;
    private String trangThai;
    public TTDSDonDangKy(){}

    public TTDSDonDangKy(String maDon, String maSV, String maHP, String tenHP, String loaiDon,String trangThai) {
        this.maDon = maDon;
        this.maSV = maSV;
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.loaiDon = loaiDon;
        this.trangThai = trangThai;
    }

    public String getMaDon() {
        return maDon;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaHP() {
        return maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public String getLoaiDon() {
        return loaiDon;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public void setLoaiDon(String loaiDon) {
        this.loaiDon = loaiDon;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
    @Override
    public String toString() {
        return "TTDSDonDangKy{" + "maDon=" + maDon + ", maSV=" + maSV + ", maHP=" + maHP + ", tenHP=" + tenHP + ", loaiDon=" + loaiDon + '}';
    }
    
}
