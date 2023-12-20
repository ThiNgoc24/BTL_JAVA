/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class HocPhan {
    private String maHP;
    private String tenHP;
    private int soTC;
    private String maKhoa;

    public HocPhan() {
    }

    public HocPhan(String maHP, String tenHP, int soTC) {
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.soTC = soTC;
    }
    
    public HocPhan(String maHP, String tenHP, int soTC, String maKhoa) {
        this.maHP = maHP;
        this.tenHP = tenHP;
        this.soTC = soTC;
        this.maKhoa = maKhoa;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }
    
}
