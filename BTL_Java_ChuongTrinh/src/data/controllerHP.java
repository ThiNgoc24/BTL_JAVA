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
import model.HocPhan;

/**
 *
 * @author DELL
 */
public class controllerHP {
    public ArrayList<HocPhan> readKhoaFromFile(String fileName){
        ArrayList<HocPhan> dsKhoa = new ArrayList<>();
        try {
            FileReader rd = new FileReader(fileName);
            BufferedReader br = new BufferedReader(rd);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
                String[] field = line.split(", ");
                String maHP = field[1];
                String tenHP = field[2];
                int soTC = Integer.parseInt(field[3]);
                HocPhan hp = new HocPhan(maHP, tenHP, soTC);
                dsKhoa.add(hp);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            JOptionPane.showInputDialog("Lỗi đọc file");
        }
        return dsKhoa;
    }
    public void writeKhoaToFile(ArrayList<HocPhan> dsHP, String fileName){
        try{
            FileWriter wt = new FileWriter(fileName);
            PrintWriter pt = new PrintWriter(wt);
            for(HocPhan hp :dsHP){
                String line = String.join(", ",hp.getMaHP(), hp.getTenHP(), String.valueOf(hp.getSoTC()));
                pt.write(line + "\n");
            }
            pt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
