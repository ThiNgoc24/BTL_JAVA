/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//import static model.FakeData.listDonTapThe;

/**
 *
 * @author NGUYEN VAN MANH
 */

public class SinhVienTapThe {
    private String maSV;
    private String hoTen;
    private String tenNganh;
    public static List<TTDonTapThe> listDonTapThe = new ArrayList<>();

    public SinhVienTapThe() {
    }
    
    static {
        layDSDonTapThe();
    }

    public SinhVienTapThe(String maSV, String hoTen, String tenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tenNganh = tenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

     public static void layDSDonTapThe(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\DSDonTapThe.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                String maDonTapThe = tokens[0];
                String maSV = tokens[1];
                String tenHP = tokens[2];
                String maHP = tokens[3];
                String lyDo = tokens[4];

                List<SinhVienTapThe> dsSV = new ArrayList<>();
                for (int i = 5; i < tokens.length; i += 3) {
                    String masv = tokens[i];
                    String tenSV = tokens[i + 1];
                    String tenNganh = tokens[i + 2];
                    dsSV.add(new SinhVienTapThe(masv, tenSV, tenNganh));
                }
                String trangThai = tokens[tokens.length];

                TTDonTapThe donTapThe = new TTDonTapThe(maDonTapThe, maSV, tenHP, maHP, lyDo, dsSV,trangThai);
                listDonTapThe.add(donTapThe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String toString() {
        return  maSV + "," + hoTen + "," + tenNganh;
    }
    
}
