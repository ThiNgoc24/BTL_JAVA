/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhvien;


import javax.swing.table.DefaultTableModel;
import controller.TKDSDonTheoSV;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.TTDonDangKy;
import model.FakeData;
/**
 *
 * @author Le Thi Ngoc
 */
public class DanhSachDonDK extends javax.swing.JFrame {

    private TKDSDonTheoSV model;
    private String maSV = FakeData.maSVDN;
    
    /**
     * Creates new form DanhSachDonDK
     */
    
    public DanhSachDonDK() {

        initComponents();
//        this.maSV = maSV;
        capNhapDon();
    }
            List<TTDonDangKy> dons = model.dsDonTheoMaSV(maSV);

    public void capNhapDon(){

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Mã đơn");
        tableModel.addColumn("Mã học phần");
        tableModel.addColumn("Tên học phần");
        tableModel.addColumn("Loại đơn");
        tableModel.addColumn("Trạng thái");
        
        for(TTDonDangKy don: dons){
               Object[] row = {
                   don.getMaDon(),
                   don.getMaHP(),
                   don.getTenHP(),
                   don.getLoaiDon(),
                   don.getTrangThai()
               
               };
              tableModel.addRow(row);
              
        }
        tbl_DonDangKYSV.setModel(tableModel);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DonDangKYSV = new javax.swing.JTable();
        btlQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_DonDangKYSV.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tbl_DonDangKYSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã học phần", "Tên học phần", "Loại đơn", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tbl_DonDangKYSV);

        btlQuayLai.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btlQuayLai.setText("Quay lại");
        btlQuayLai.setName("btnQuayLai"); // NOI18N
        btlQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(btlQuayLai)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btlQuayLai)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlQuayLaiActionPerformed
        // TODO add your handling code here:
        TrangChuSinhVien trangChu = new TrangChuSinhVien();
        trangChu.setVisible(true);
    }//GEN-LAST:event_btlQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachDonDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachDonDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachDonDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachDonDK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachDonDK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlQuayLai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DonDangKYSV;
    // End of variables declaration//GEN-END:variables
}