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

/**
 *
 * @author NGUYEN VAN MANH
 */
public class HocPhan {
    private String maHP;
    private String maKhoa;
    private String maNganh;
    private String tenHP;
    private int soTC;

    public HocPhan() {
    }

    public HocPhan(String maHP, String maKhoa, String maNganh, String tenHP, int soTC) {
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
    
    
    
    public static List<HocPhan> readHocPhanFromFile(String filePath) {
        List<HocPhan> danhSachHocPhan = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 3) {
                    HocPhan hocPhan = new HocPhan();
                    hocPhan.setMaHP(parts[0]);
                    hocPhan.setTenHP(parts[1]);
                    hocPhan.setSoTC(Integer.parseInt(parts[2]));

                    danhSachHocPhan.add(hocPhan);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Xử lý lỗi nếu cần
        }

        return danhSachHocPhan;
    }

    @Override
    public String toString() {
        return "HocPhan{" + "maHP=" + maHP + ", tenHP=" + tenHP + ", soTC=" + soTC + '}';
    }
    
}
