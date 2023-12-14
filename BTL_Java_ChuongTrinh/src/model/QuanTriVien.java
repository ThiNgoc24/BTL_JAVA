/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class QuanTriVien {
    private String maQTV;
    private String tenQTV;
    private String maTK;
    
    public QuanTriVien() {
    }

    public QuanTriVien(String maQTV, String tenQTV) {
        this.maQTV = maQTV;
        this.tenQTV = tenQTV;
    }

    public String getMaQTV() {
        return maQTV;
    }

    public void setMaQTV(String maQTV) {
        this.maQTV = maQTV;
        this.maTK = this.maQTV;
    }

    public String getTenQTV() {
        return tenQTV;
    }

    public void setTenQTV(String tenQTV) {
        this.tenQTV = tenQTV;
    }
    
}
