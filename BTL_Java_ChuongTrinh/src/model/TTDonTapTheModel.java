/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class TTDonTapTheModel {
    private static final String FILE_PATH = "src\\data\\DonTapThe.txt";

    public static void saveDonTapTheInfo(TTDonTapThe donTapThe) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            // Ghi thông tin chung của đơn đăng ký tập thể
            writer.write("Mã đơn tập thể: " + donTapThe.getMaDonTapThe());
            writer.newLine();
            writer.write("Tên học phần: " + donTapThe.getTenHP());
            writer.newLine();
            writer.write("Mã học phần: " + donTapThe.getMaHP());
            writer.newLine();
            
            // Ghi thông tin về danh sách sinh viên
            List<SinhVienTapThe> dsSV = donTapThe.getDsSV();
            writer.write("Danh sách sinh viên:");
            writer.newLine();
            for (SinhVienTapThe sv : dsSV) {
                writer.write("  - Mã SV: " + sv.getMaSV() + ", Tên SV: " + sv.getHoTen()+ ", Ngành học: " + sv.getTenNganh());
                writer.newLine();
            }
            
            // Ghi lý do
            writer.write("Lý do mở lớp: " + donTapThe.getLyDo());
            writer.newLine();
            
            // Kết thúc mỗi đơn đăng ký
            writer.write("-----------------------------------------");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace(); // Xử lý lỗi nếu cần thiết
        }
    }
    
    // Phương thức đọc từ file và tạo danh sách đơn
    public static List<TTDonTapThe> readDonTapTheFromFile() {
        List<TTDonTapThe> danhSachDon = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            TTDonTapThe donTapThe = null;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Mã đơn tập thể:")) {
                    if (donTapThe != null) {
                        danhSachDon.add(donTapThe);
                    }
                    donTapThe = new TTDonTapThe();
                    donTapThe.setMaDonTapThe(line.split(": ")[1]);
                } else if (line.startsWith("Tên học phần:")) {
                    donTapThe.setTenHP(line.split(": ")[1]);
                } else if (line.startsWith("Mã học phần:")) {
                    donTapThe.setMaHP(line.split(": ")[1]);
                } else if (line.startsWith("Danh sách sinh viên:")) {
                    // Đọc danh sách sinh viên
                    List<SinhVienTapThe> danhSachSV = new ArrayList<>();
                    while (!(line = reader.readLine()).startsWith("Lý do mở lớp:")) {
                        String[] svInfo = line.split(": ");
                        danhSachSV.add(new SinhVienTapThe(
                                svInfo[1], svInfo[3], svInfo[5]
                        ));
                    }
                    donTapThe.setDsSV(danhSachSV);
                } else if (line.startsWith("Lý do mở lớp:")) {
                    donTapThe.setLyDo(line.split(": ")[1]);
                }
            }

            // Thêm đơn cuối cùng vào danh sách
            if (donTapThe != null) {
                danhSachDon.add(donTapThe);
            }

        } catch (IOException e) {
            e.printStackTrace(); // Xử lý lỗi nếu cần
        }

        return danhSachDon;
    }
}
