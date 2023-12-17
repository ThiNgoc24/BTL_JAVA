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
    private HashSet<String> nganh;

    public SinhVien() {
    }

    public SinhVien(String hoTenSV, HashSet<String> nganh) {
        this.hoTenSV = hoTenSV;
        this.nganh = nganh;
    }

    public SinhVien(String hoTenSV, HashSet<String> nganh, String maTK, String matKhau, int role) {
        super(maTK, matKhau, role);
        this.hoTenSV = hoTenSV;
        this.nganh = nganh;
    }
    
    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }

    public HashSet<String> getNganh() {
        return nganh;
    }

    public void setNganh(HashSet<String> nganh) {
        this.nganh = nganh;
    }
}
