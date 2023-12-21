/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhvien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.SinhVien;
import model.DonDeXuat;

/**
 *
 * @author Le Thi Ngoc
 */
public class DeXuatCaiTien extends javax.swing.JFrame {

    /**
     * Creates new form DeXuatCaiTien
     */
    public DeXuatCaiTien() {
        initComponents();
    }
        ArrayList<DonDeXuat> dons = new ArrayList<DonDeXuat>();
 private static int nextMaDonTapThe = 1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGopYKhac = new javax.swing.JTextArea();
        txtcauHoi1 = new javax.swing.JTextField();
        txtCauhoi4 = new javax.swing.JTextField();
        txtCauHoi3 = new javax.swing.JTextField();
        txtCauHoi2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btlGuiDonDeXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Bạn muốn nhà trường mở thêm lớp học phần nào khác?");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Bạn có góp ý gì cho nhà trường về form đăng ký không?");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Bạn có góp ý gì về phương pháp giảng dạy các lớp học phần không?");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Thời gian học của các lớp học phần được mở có phù hợp với sinh viên không?");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Góp ý khác:");

        txtGopYKhac.setColumns(20);
        txtGopYKhac.setRows(5);
        jScrollPane1.setViewportView(txtGopYKhac);

        txtcauHoi1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtCauhoi4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtCauHoi3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtCauHoi2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btlGuiDonDeXuat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btlGuiDonDeXuat.setText("Gửi đề xuất");
        btlGuiDonDeXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlGuiDonDeXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCauHoi2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                                .addComponent(txtcauHoi1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCauHoi3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                                .addComponent(txtCauhoi4, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btlGuiDonDeXuat)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcauHoi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtCauHoi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(txtCauHoi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCauhoi4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btlGuiDonDeXuat))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//   private String sinhMaDonDeXuat(){
//        String maDon = "DTT" + String.format("%03d", nextMaDonTapThe);
//        nextMaDonTapThe++;       
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Data\\NextMaDonTapThe.txt"))) {
//        writer.write(String.valueOf(nextMaDonTapThe));
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//
//    return maDon;
//    }
//   
   private static String generateCode(String currentCode) {
        // Hàm này sẽ sinh mã mới từ mã hiện tại, ví dụ: DTT001 -> DTT002
        String prefix = currentCode.substring(0, currentCode.length() - 3);
        int suffix = Integer.parseInt(currentCode.substring(currentCode.length() - 3));
        int newSuffix = suffix + 1;
        return String.format("%s%03d", prefix, newSuffix);
    }

    private static String loadLastCodeFromFile() {
        String lastCode = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\data\\DonDeXuat.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) { // Kiểm tra xem dòng có rỗng không
                    lastCode = line.split(",")[0]; // Lấy mã ở cột đầu tiên, tách các cột bằng dấu phẩy
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lastCode;
    }

    private String sinhMaDonTapThe() {
        String currentCode = loadLastCodeFromFile();
        if (currentCode == null) {
            // Nếu không có mã trong file, khởi tạo mã ban đầu
            currentCode = "DTT001";
        }
        // Sinh mã mới
        String newCode = generateCode(currentCode);
        return newCode;
    }
    private void btlGuiDonDeXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlGuiDonDeXuatActionPerformed
        // TODO add your handling code here:
        DonDeXuat x = new DonDeXuat();
         x.setMaDon(sinhMaDonTapThe());
        x.setCauHoi1(txtcauHoi1.getText());
        x.setCauHoi2(txtCauHoi2.getText());
        x.setCauHoi3(txtCauHoi3.getText());
        x.setCauHoi4(txtCauhoi4.getText());
        x.setGopY(txtGopYKhac.getText());
        dons.add(x);

                if(txtcauHoi1.getText().isEmpty() && txtCauHoi2.getText().isEmpty() && txtCauHoi3.getText().isEmpty() && txtCauhoi4.getText().isEmpty() && txtGopYKhac.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Nhập dữ liệu trước khi lưu!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
                }              
                // Lưu dữ liệu vào file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\Data\\DonDexuat.txt", true))) {
        writer.write(x.getMaDon() + ",");
        writer.write(x.getCauHoi1() + ",");
        writer.write(x.getCauHoi2() + ",");
        writer.write(x.getCauHoi3() + ",");
        writer.write(x.getCauHoi4() + ",");
        writer.write(x.getGopY());

        writer.newLine();
        writer.flush();
        JOptionPane.showMessageDialog(this, "Dữ liệu đã được lưu vào file thành công!");

        // Xóa nội dung của các ô textbox sau khi lưu thành công
        txtcauHoi1.setText("");
        txtCauHoi2.setText("");
        txtCauHoi3.setText("");
        txtCauhoi4.setText("");
        txtGopYKhac.setText("");

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi lưu dữ liệu.", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_btlGuiDonDeXuatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TrangChuSinhVien trangChu = new TrangChuSinhVien();
        trangChu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeXuatCaiTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeXuatCaiTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeXuatCaiTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeXuatCaiTien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeXuatCaiTien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlGuiDonDeXuat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCauHoi2;
    private javax.swing.JTextField txtCauHoi3;
    private javax.swing.JTextField txtCauhoi4;
    private javax.swing.JTextArea txtGopYKhac;
    private javax.swing.JTextField txtcauHoi1;
    // End of variables declaration//GEN-END:variables
}
