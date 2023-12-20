/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.FakeData;
import static model.FakeData.listDonDangKy;
import model.TTDonDangKy;

/**
 *
 * @author Admin
 */
public class TKDSDonTheoSV {
    static List<TTDonDangKy> listDon = new ArrayList<>(FakeData.listDonDangKy);
    static Map<String, List<TTDonDangKy>> mapDon = new HashMap<>();
    static {
        tongHopTheoSV();
    }
    public static void tongHopTheoSV(){
        for (TTDonDangKy don : listDon) {
            String maSV = don.getMaSV();
            if (!mapDon.containsKey(maSV)) {
                mapDon.put(maSV, new ArrayList<>());
            }
            mapDon.get(maSV).add(don);
        }
}

    public static List<TTDonDangKy> dsDonTheoMaSV(String masv){
        List<TTDonDangKy> dons = new ArrayList<>();
        for (Map.Entry<String, List<TTDonDangKy>> entry : mapDon.entrySet()) {
            if(entry.getKey().equals(masv)){
                List<TTDonDangKy> danhSachTheoMaSV = entry.getValue();
                for (TTDonDangKy don : danhSachTheoMaSV) {
                    if(don.getMaSV().equals(masv)){
                        dons.add(don);
                    }
                }
            }
        }
        return dons;
    }
    
    public static void main(String[] args) {
        FakeData.listDonDangKy.forEach(System.out::println);
//        tongHopTheoSV();
        System.out.println("Kết quả tìm kiếm");
        dsDonTheoMaSV("SV001").forEach(System.out::println);
    }
}


