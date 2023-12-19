/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.FakeData;
import static model.FakeData.listDonDangKy;
import model.Nganh;
import model.TTDSDonDangKy;

/**
 *
 * @author Le Thi Ngoc
 */
public class ThongKeDSDonDangKy {
    public static void main(String[] args) {
//        FakeData.layDSDonDangKy();
////        List<TTDSDonDangKy> listDS =FakeData.listDonDangKy;
//        FakeData.listDonDangKy.forEach(System.out::println);
        Nganh nganh = new Nganh("1", "2", "3");
        System.out.println(nganh);
    }
}
