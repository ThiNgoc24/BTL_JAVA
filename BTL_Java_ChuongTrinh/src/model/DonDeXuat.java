/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Le Thi Ngoc
 */
public class DonDeXuat {
    private String maDon;
    private String cauHoi1;
    private String cauHoi2;
    private String cauHoi3;
    private String cauHoi4;
    private String gopY;

    public DonDeXuat(){
        
    }
    
    public DonDeXuat(String maDon, String cauHoi1, String cauHoi2, String cauHoi3, String cauHoi4, String gopY) {
        this.maDon = maDon;
        this.cauHoi1 = cauHoi1;
        this.cauHoi2 = cauHoi2;
        this.cauHoi3 = cauHoi3;
        this.cauHoi4 = cauHoi4;
        this.gopY = gopY;
    }

    public String getMaDon() {
        return maDon;
    }

    public String getCauHoi1() {
        return cauHoi1;
    }

    public String getCauHoi2() {
        return cauHoi2;
    }

    public String getCauHoi3() {
        return cauHoi3;
    }

    public String getCauHoi4() {
        return cauHoi4;
    }

    public String getGopY() {
        return gopY;
    }

    public void setMaDon(String maDon) {
        this.maDon = maDon;
    }

    public void setCauHoi1(String cauHoi1) {
        this.cauHoi1 = cauHoi1;
    }

    public void setCauHoi2(String cauHoi2) {
        this.cauHoi2 = cauHoi2;
    }

    public void setCauHoi3(String cauHoi3) {
        this.cauHoi3 = cauHoi3;
    }

    public void setCauHoi4(String cauHoi4) {
        this.cauHoi4 = cauHoi4;
    }

    public void setGopY(String gopY) {
        this.gopY = gopY;
    }

    @Override
    public String toString() {
        return "DonDeXuat{" + "maDon=" + maDon + ", cauHoi1=" + cauHoi1 + ", cauHoi2=" + cauHoi2 + ", cauHoi3=" + cauHoi3 + ", cauHoi4=" + cauHoi4 + ", gopY=" + gopY + '}';
    }
}
