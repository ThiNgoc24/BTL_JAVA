/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class TTDonCaNhan {
    private String maDonCaNhan;
    private String maSV;
    private String tenHP;
    private String maHP;
    private String lyDo;
    public TTDonCaNhan(){}
    public TTDonCaNhan(String maDonCaNhan, String maSV, String maHP, String tenHP, String lyDo) {
        this.maDonCaNhan = maDonCaNhan;
        this.maSV = maSV;
        this.tenHP = tenHP;
        this.maHP = maHP;
        this.lyDo = lyDo;
    }

    public String getMaDonCaNhan() {
        return maDonCaNhan;
    }

    public String getTenHP() {
        return tenHP;
    }

    public String getMaHP() {
        return maHP;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setMaDonCaNhan(String maDonCaNhan) {
        this.maDonCaNhan = maDonCaNhan;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "TTDonCaNhan{" + "maDonCaNhan=" + maDonCaNhan + ", maSV=" + maSV + ", tenHP=" + tenHP + ", maHP=" + maHP + ", lyDo=" + lyDo + '}';
    }
}