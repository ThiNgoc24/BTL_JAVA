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
public class SinhVien extends TaiKhoan{
    private String hoTenSV;
    private String nganh;

    public SinhVien() {
    }

    public SinhVien(String hoTenSV, String nganh) {
        this.hoTenSV = hoTenSV;
        this.nganh = nganh;
    }

    public SinhVien(String hoTenSV, String nganh, String maTK, String matKhau, int role) {
        super(maTK, matKhau, role);
        this.hoTenSV = hoTenSV;
        this.nganh = nganh;
    }

    public String getHoTenSV() {
        return hoTenSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
}

