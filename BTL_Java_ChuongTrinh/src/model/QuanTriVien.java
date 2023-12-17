/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class QuanTriVien extends TaiKhoan{
    private String tenQTV;
    
    public QuanTriVien() {
    }

    public QuanTriVien(String tenQTV) {
        this.tenQTV = tenQTV;
    }

    public QuanTriVien(String tenQTV, String maTK, String matKhau, int role) {
        super(maTK, matKhau, role);
        this.tenQTV = tenQTV;
    }
 
    public String getTenQTV() {
        return tenQTV;
    }

    public void setTenQTV(String tenQTV) {
        this.tenQTV = tenQTV;
    }
    
}
