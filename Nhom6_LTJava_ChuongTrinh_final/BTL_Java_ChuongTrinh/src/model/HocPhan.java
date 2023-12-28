/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class HocPhan {
    private String maHP;
    private String maKhoa;
    private String maNganh;
    private String tenHP;
    private int soTC;

    public HocPhan() {
    }
    
    public HocPhan(String maKhoa, String maNganh,String maHP, String tenHP, int soTC) {
        this.maHP = maHP;
        this.maKhoa = maKhoa;
        this.maNganh = maNganh;
        this.tenHP = tenHP;
        this.soTC = soTC;
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

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }
    
    @Override
    public String toString() {
        return maKhoa +"," + maNganh + "," + maHP + ","+ tenHP +  "," + soTC;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.maHP);
        hash = 37 * hash + Objects.hashCode(this.tenHP);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HocPhan other = (HocPhan) obj;
        return Objects.equals(this.maHP, other.maHP);
    }
    
}
