/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import model.DonDeXuat;
import model.FakeData;

/**
 *
 * @author ADMIN
 */
public class TKDonDeXuatController {
    //Lấy ra danh sách đơn đăng ký

    public static List<DonDeXuat> listDon = FakeData.layDonDeXuat_Test();

    public static DonDeXuat donTheoMaDon(String maDon){
        for (DonDeXuat x : listDon) {
            if (x.getMaDon().equals(maDon)) {
                return x;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        listDon.forEach(System.out::println);
    }
    
    public static void writeDSDonToFile(List<DonDeXuat> dsDon, String filePath) {
        try {
            FileWriter wt = new FileWriter(filePath);
            PrintWriter pt = new PrintWriter(wt);
            for (DonDeXuat don : dsDon) {
                String line = String.join(",", don.getMaDon(), don.getCauHoi1(), don.getCauHoi2(),
                        don.getCauHoi3(), don.getCauHoi4(), don.getGopY());
                pt.write(line + "\n");
            }
            pt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
