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
public class FakeData {
    public static List<Khoa> listKhoa = new ArrayList<>();
    public static List<Nganh> listNganh = new ArrayList<>();
    public static List<HocPhan> listHocPhan = new ArrayList<>();
    public static List<DonDeXuat> listDonDeXuat = new ArrayList<>();
    public static List<TTDonCaNhan> listDonCaNhan = new ArrayList<>();
    public static List<TTDonTapThe> listDonTapThe = new ArrayList<>();
    public static List<TTDonDangKy> listDonDangKy = new ArrayList<>();
    public static List<TTDonDangKy> listDonDangKy_ChuaDuyet = new ArrayList<>();
    public static String maSVDN;
    
    static {
        layMaSV();
        layHocPhan();
        layNganh();
        layKhoa();
        layDonDeXuat();
        layDSDonCaNhan();
        layDSDonTapThe();
        taoDSDonDangKy();
        taoDSDonDangKyChuaDuyet();
        layDSDonCaNhan();
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
                if(khoaInfo.length < 2)
                    continue;
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
                String[] nganhInfo = line.split(",");
                if (nganhInfo.length < 3) {
                    // Bỏ qua dòng không hợp lệ không chứa đủ các phần tử cần thiết
                    continue;
                }
                String maNganh = nganhInfo[0].trim();
                String tenNganh = nganhInfo[1].trim();
                String maKhoa = nganhInfo[2].trim();
                
                Nganh nganh = new Nganh(maNganh, tenNganh, maKhoa);
                listNganh.add(nganh);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Nganh> layNganh_Test(){
        List<Nganh> nganhs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\Nganh.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] nganhInfo = line.split(",");
                if (nganhInfo.length < 3) {
                    // Bỏ qua dòng không hợp lệ không chứa đủ các phần tử cần thiết
                    continue;
                }
                String maNganh = nganhInfo[0].trim();
                String tenNganh = nganhInfo[1].trim();
                String maKhoa = nganhInfo[2].trim();
                
                Nganh nganh = new Nganh(maNganh, tenNganh, maKhoa);
                nganhs.add(nganh);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nganhs;
    }
    
    public static void layHocPhan(){
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\HocPhan.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] hocPhanInfo = line.split(",");
                String maKhoa = hocPhanInfo[0].trim();
                String maNganh = hocPhanInfo[1].trim();
                String maHP = hocPhanInfo[2].trim();
                String tenHP = hocPhanInfo[3].trim();
                int soTC = Integer.parseInt(hocPhanInfo[4].trim());
                
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
                if (tokens.length < 6) {
                    // Bỏ qua dòng không hợp lệ không chứa đủ các phần tử cần thiết
                    continue;
                }
                TTDonCaNhan don = new TTDonCaNhan(tokens[0], tokens[1], tokens[2], tokens[3],tokens[4], tokens[5]);
                listDonCaNhan.add(don);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void layDSDonTapThe() {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\data\\DSDonTapThe.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length < 5) {
                    // Bỏ qua dòng không hợp lệ không chứa đủ các phần tử cần thiết
                    continue;
                }
                String maDonTapThe = tokens[0];
                String maSV = tokens[1];
                String tenHP = tokens[2];
                String maHP = tokens[3];
                String lyDo = tokens[4];

                List<SinhVienTapThe> dsSV = new ArrayList<>();
                for (int i = 5; i < tokens.length - 1; i += 3) {
                    if (i + 2 < tokens.length) {
                        String masv = tokens[i];
                        String tenSV = tokens[i + 1];
                        String tenNganh = tokens[i + 2];
                        dsSV.add(new SinhVienTapThe(masv, tenSV, tenNganh));
                    }
                }
                String trangThai = tokens[tokens.length - 1];

                TTDonTapThe donTapThe = new TTDonTapThe(maDonTapThe, maSV, tenHP, maHP, lyDo, dsSV, trangThai);
                listDonTapThe.add(donTapThe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    public static void taoDSDonDangKy(){
        try {
           for(TTDonCaNhan donCaNhan : listDonCaNhan){
               String maDon = donCaNhan.getMaDonCaNhan();
               String maSV = donCaNhan.getMaSV();
               String maHP = donCaNhan.getMaHP();
               String tenHP = donCaNhan.getTenHP();
               String loaiDon = "Cá nhân";
               String trangThai = donCaNhan.getTrangThai();
               TTDonDangKy donDK = new TTDonDangKy(maDon, maSV, maHP, tenHP, loaiDon,trangThai, 1);
               listDonDangKy.add(donDK);
           }
           for(TTDonTapThe donTapThe : listDonTapThe){
               String maDon = donTapThe.getMaDonTapThe();
               String maSV = donTapThe.getMaSV();
               String maHP = donTapThe.getMaHP();
               String tenHP = donTapThe.getTenHP();
               String loaiDon = "Tập thể";
               String trangThai = donTapThe.getTrangThai();
               List<SinhVienTapThe> svs = new ArrayList<>(donTapThe.getDsSV());
               TTDonDangKy donDK = new TTDonDangKy(maDon, maSV, maHP, tenHP, loaiDon,trangThai, svs.size()+1);
               listDonDangKy.add(donDK);

           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void taoDSDonDangKyChuaDuyet(){
        listDonDangKy_ChuaDuyet.clear();
        try {
           for(TTDonCaNhan donCaNhan : listDonCaNhan){
               String maDon = donCaNhan.getMaDonCaNhan();
               String maSV = donCaNhan.getMaSV();
               String maHP = donCaNhan.getMaHP();
               String tenHP = donCaNhan.getTenHP();
               String loaiDon = "Cá nhân";
               String trangThai = donCaNhan.getTrangThai();

               if(trangThai.trim().equals("Chưa duyệt")){
                   TTDonDangKy donDK = new TTDonDangKy(maDon, maSV, maHP, tenHP, loaiDon,trangThai, 1);
                   listDonDangKy_ChuaDuyet.add(donDK);
               }
               
           }
           for(TTDonTapThe donTapThe : listDonTapThe){
               String maDon = donTapThe.getMaDonTapThe();
               String maSV = donTapThe.getMaSV();
               String maHP = donTapThe.getMaHP();
               String tenHP = donTapThe.getTenHP();
               String loaiDon = "Tập thể";
               String trangThai = donTapThe.getTrangThai();
               List<SinhVienTapThe> svs = new ArrayList<>(donTapThe.getDsSV());
               if(trangThai.trim().equals("Chưa duyệt")){
                   TTDonDangKy donDK = new TTDonDangKy(maDon, maSV, maHP, tenHP, loaiDon,trangThai, svs.size()+1);
                   listDonDangKy_ChuaDuyet.add(donDK);
               }
               
           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static List<HocPhanDangKyCuaKhoa> layHocPhantheoNganh(String maNganh){
        List<HocPhanDangKyCuaKhoa> listhp = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("src\\data\\HocPhan.txt"));
            String line;
            while((line = br.readLine())!= null){
                if(!line.trim().isEmpty()){
                    String [] xc = line.split(",");
                    if(maNganh.equals(xc[1])){
                        HocPhanDangKyCuaKhoa hp = new HocPhanDangKyCuaKhoa(xc[2],xc[3]);
                        listhp.add(hp);
                    } 
                }
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }
        return listhp;
    }

    public static void main(String[] args) {
//        layKhoa();
//        listKhoa.forEach(System.out::println);
//        layHocPhan();
//        listHocPhan.forEach(System.out::println);
//        layDonDeXuat();
//        listDonDeXuat.forEach(System.out::println);
//        layDSDonCaNhan();
//        listDonCaNhan.forEach(System.out::println);
//        layDSDonTapThe();
//        listDonTapThe.forEach(System.out::println);
//        layNganh();
        listNganh.forEach(System.out::println);

//        listDonCaNhan.forEach(System.out::println);
    }
}
