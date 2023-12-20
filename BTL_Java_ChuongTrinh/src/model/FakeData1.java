/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import main.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Nguyen Van Manh
 */
public class FakeData1 {
    public static String maSVDN;
    
    static {
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
}
