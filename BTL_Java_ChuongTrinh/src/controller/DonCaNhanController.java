/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.TTDonCaNhan;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class DonCaNhanController {
    public static void saveDonCaNhanInfo(TTDonCaNhan donCaNhan) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\data\\DSDonCaNhan.txt", true))) {
            writer.write(donCaNhan.toString());
            writer.newLine();  // Thêm dòng mới để cách biệt giữa các bản ghi
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static List<TTDonCaNhan> readDonFromFile(String filePath) {
        List<TTDonCaNhan> dsDon = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    TTDonCaNhan don = new TTDonCaNhan();
                    don.setMaDonCaNhan(parts[0]);
                    don.setMaSV(parts[1]);
                    don.setMaHP(parts[2]);
                    don.setTenHP(parts[3]);
                    don.setLyDo(parts[4]);
                    don.setTrangThai(parts[5]); 
                    dsDon.add(don);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Xử lý lỗi nếu cần
        }
        return dsDon;
    }
}
