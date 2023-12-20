/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class HocPhanDangKyCuaKhoa {
    private String maHP;
    private String tenHP;

    public HocPhanDangKyCuaKhoa() {
    }

    public HocPhanDangKyCuaKhoa(String maHP, String tenHP) {
        this.maHP = maHP;
        this.tenHP = tenHP;
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

    @Override
    public int hashCode() {
        int hash = 5;
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
        final HocPhanDangKyCuaKhoa other = (HocPhanDangKyCuaKhoa) obj;
        if (!Objects.equals(this.maHP, other.maHP)) {
            return false;
        }
        return Objects.equals(this.tenHP, other.tenHP);
    }



    
    @Override
    public String toString() {
        return "HocPhanDangKyCuaKhoa{" + "maHP=" + maHP + ", tenHP=" + tenHP + '}';
    }
    
    
}
