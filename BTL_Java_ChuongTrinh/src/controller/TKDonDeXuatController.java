/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.DonDeXuat;
import model.FakeData;

/**
 *
 * @author ADMIN
 */
public class TKDonDeXuatController {
    //Lấy ra danh sách đơn đăng ký

    static List<DonDeXuat> listDon = new ArrayList<>(FakeData.listDonDeXuat);

    public static DonDeXuat donTheoMaDon(String maDon) {
        for (DonDeXuat x : listDon) {
            if (x.getMaDon().equals(maDon)) {
                return x;
            }
        }
        return null;
    }
    
    public static void writeDSDonToFile(List<DonDeXuat> dsDon, String filePath) {
        try {
            FileWriter wt = new FileWriter(filePath);
            PrintWriter pt = new PrintWriter(wt);
            for (DonDeXuat don : dsDon) {
                String line = don.toString();
                pt.write(line + "\n");
            }
            pt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
