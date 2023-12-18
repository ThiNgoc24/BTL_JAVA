/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Khoa;

/**
 *
 * @author DELL
 */
public class controllerKhoa{
    public ArrayList<Khoa> readKhoaFromFile(String fileName){
        ArrayList<Khoa> dsKhoa = new ArrayList<>();
        try {
            FileReader rd = new FileReader(fileName);
            BufferedReader br = new BufferedReader(rd);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                String[] field = line.split(", ");
                String maKhoa = field[0];
                String tenKhoa = field[1];
                Khoa kh = new Khoa(maKhoa, tenKhoa);
                dsKhoa.add(kh);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            JOptionPane.showInputDialog("Lỗi đọc file");
        }
        return dsKhoa;
    }
    public void writeKhoaToFile(ArrayList<Khoa> dsKhoa, String fileName){
        try{
            FileWriter wt = new FileWriter(fileName);
            PrintWriter pt = new PrintWriter(wt);
            for(Khoa kh:dsKhoa){
                String line = String.join(", ", kh.getMaKhoa(), kh.getTenKhoa());
                pt.write(line + "\n");
            }
            pt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
