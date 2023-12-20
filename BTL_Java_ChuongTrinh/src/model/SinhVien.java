/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class SinhVien extends TaiKhoan{
    private String hoTenSV;
    private String maNganh;
    
    public SinhVien() {
    }

    public SinhVien(String hoTenSV, String maNganh) {
        this.hoTenSV = hoTenSV;
        this.maNganh = maNganh;
    }

    public SinhVien(String hoTenSV, String maNganh, String maTK, String matKhau, int role) {
        super(maTK, matKhau, role);
        this.hoTenSV = hoTenSV;
        this.maNganh = maNganh;
    }
   
    public String getHoTenSV() {
        return hoTenSV;
    }

    public void setHoTenSV(String hoTenSV) {
        this.hoTenSV = hoTenSV;
    }
    
    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;

    }    
}

