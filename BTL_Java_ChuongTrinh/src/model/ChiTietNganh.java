/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class ChiTietNganh {
    private String maSV;
    private String maNganh;
    private int namHoc;

    public ChiTietNganh() {
    }

    public ChiTietNganh(String maSV, String maNganh, int namHoc) {
        this.maSV = maSV;
        this.maNganh = maNganh;
        this.namHoc = namHoc;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof ChiTietNganh){
            ChiTietNganh chiTietNganh = (ChiTietNganh)obj;
            if(chiTietNganh.getMaSV().equals(this.maSV) && chiTietNganh.getMaNganh().equals(this.maNganh)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.maNganh.hashCode()*this.maSV.hashCode();
    }
    
}
