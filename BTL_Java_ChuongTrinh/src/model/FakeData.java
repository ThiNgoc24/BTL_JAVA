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
import static model.FakeData1.maSVDN;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class FakeData {
    public static List<Khoa> listKhoa = new ArrayList<>();
    public static List<Nganh> listNganh = new ArrayList<>();
    public static List<HocPhan> listHocPhan = new ArrayList<>();
    public static List<DonDeXuat> listDonDeXuat = new ArrayList<>();
    public static List<TTDonCaNhan> listDonCaNhan = new ArrayList<>();
    public static List<TTDonTapThe> listDonTapThe = new ArrayList<>();
    public static List<TTDSDonDangKy> listDonDangKy = new ArrayList<>();
    public static String maSVDN;
    
    
    static {
        layKhoa();
        layNganh();
        layHocPhan();
        layDonDeXuat();
        layDSDonCaNhan();
        layDSDonTapThe();
        layDSDonDangKy();
        layMaSV();
    }
    
    public static void layMaSV() {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\LichSuDangNhap.txt"))) {
            String line = br.readLine();
            if (line != null) {
                maSVDN = line.trim();
            } else {
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static void layKhoa(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\Khoa.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Chia cắt dữ liệu thành mã khoa và tên khoa
                String[] khoaInfo = line.split(",");
                String maKhoa = khoaInfo[0].trim();
                String tenKhoa = khoaInfo[1].trim();

                // Tạo đối tượng Khoa và thêm vào danh sách
                Khoa khoa = new Khoa(maKhoa, tenKhoa);
                listKhoa.add(khoa);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void layNganh(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\Nganh.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Chia cắt dữ liệu thành mã khoa và tên khoa
                String[] nganhInfo = line.split(",");
                String maNganh = nganhInfo[0].trim();
                String tenNganh = nganhInfo[1].trim();
                String maKhoa = nganhInfo[2].trim();
                // Tạo đối tượng Khoa và thêm vào danh sách
                Nganh nganh = new Nganh(maNganh, tenNganh, maKhoa);
                listNganh.add(nganh);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void layHocPhan(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\HocPhan.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Chia cắt dữ liệu thành mã khoa và tên khoa
                String[] hocPhanInfo = line.split(",");
                String maKhoa = hocPhanInfo[0].trim();
                String maNganh = hocPhanInfo[1].trim();
                String maHP = hocPhanInfo[2].trim();
                String tenHP = hocPhanInfo[3].trim();
                int soTC = Integer.parseInt(hocPhanInfo[4].trim());
                

                // Tạo đối tượng Khoa và thêm vào danh sách
                HocPhan hocPhan = new HocPhan(maKhoa, maNganh,maHP,tenHP,soTC);
                listHocPhan.add(hocPhan);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void layDonDeXuat(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\DonDeXuat.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                DonDeXuat don = new DonDeXuat(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
                listDonDeXuat.add(don);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void layDSDonCaNhan(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\DSDonCaNhan.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                TTDonCaNhan don = new TTDonCaNhan(tokens[0], tokens[1], tokens[2], tokens[3],tokens[4]);
                listDonCaNhan.add(don);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
                    dsSV.add(new SinhVienTapThe(maSV, tenSV, tenNganh));
                }
                String trangThai = tokens[tokens.length];

                TTDonTapThe donTapThe = new TTDonTapThe(maDonTapThe, maSV, tenHP, maHP, lyDo, dsSV,trangThai);
                listDonTapThe.add(donTapThe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void layDSDonDangKy(){
        try {
           for(TTDonCaNhan donCaNhan : listDonCaNhan){
               String maDon = donCaNhan.getMaDonCaNhan();
               String maSV = donCaNhan.getMaSV();
               String maHP = donCaNhan.getMaHP();
               String tenHP = donCaNhan.getTenHP();
               String loaiDon = "Cá nhân";
               String trangThai = "Chưa duyệt";
               TTDSDonDangKy donDK = new TTDSDonDangKy(maDon, maSV, maHP, tenHP, loaiDon,trangThai);
               listDonDangKy.add(donDK);
           }
           for(TTDonTapThe donTapThe : listDonTapThe){
               String maDon = donTapThe.getMaDonTapThe();
               String maSV = donTapThe.getMaSV();
               String maHP = donTapThe.getMaHP();
               String tenHP = donTapThe.getTenHP();
               String loaiDon = "Tập thể";
               String trangThai = "Chưa duyệt";
               TTDSDonDangKy donDK = new TTDSDonDangKy(maDon, maSV, maHP, tenHP, loaiDon,trangThai);
               listDonDangKy.add(donDK);
           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        layKhoa();
        listKhoa.forEach(System.out::println);
        layHocPhan();
        listHocPhan.forEach(System.out::println);
        layDonDeXuat();
//        listDonDeXuat.forEach();
        layDSDonCaNhan();
        listDonCaNhan.forEach(System.out::println);
        layDSDonTapThe();
        listDonTapThe.forEach(System.out::println);
        layNganh();
        listNganh.forEach(System.out::println);
        listDonDangKy.forEach(System.out::println);
    }
}
