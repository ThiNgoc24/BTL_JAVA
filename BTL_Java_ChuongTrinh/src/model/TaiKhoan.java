/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class TaiKhoan {
    private String maTK;
    private String matKhau;
//    private int role; //role = 1 -> Sinh viên; role = 0 -> Quản trị viên

    public TaiKhoan() {
    }

    public TaiKhoan(String maTK, String matKhau) {
        this.maTK = maTK;
        this.matKhau = matKhau;
    }
    
//    public TaiKhoan(String maTK, String matKhau, int role) {
//        this.maTK = maTK;
//        this.matKhau = matKhau;
//        this.role = role;
//    }

    public String getMaTK() {
        return maTK;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

//    public int getRole() {
//        return role;
//    }
//
//    public void setRole(int role) {
//        this.role = role;
//    }

}
