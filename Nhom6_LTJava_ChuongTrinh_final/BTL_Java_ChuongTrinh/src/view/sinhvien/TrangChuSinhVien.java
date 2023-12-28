/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhvien;

import controller.TKDSDonTheoSV;
import java.util.List;
import model.FakeData;
import model.TTDonDangKy;
import view.dangnhap.DangNhap;
import view.dangnhap.DoiMatKhau;

/**
 *
 * @author Le Thi Ngoc
 */
public class TrangChuSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form TrangChuSinhVien
     */
    public TrangChuSinhVien() {
        initComponents();
    }
    private String maSV = FakeData.layMaSV_Test();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTaoDonCaNhan = new javax.swing.JButton();
        btnTaoDonTapThe = new javax.swing.JButton();
        btnXemDSDon = new javax.swing.JButton();
        btnDeXuatCaiTien = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTaoDonCaNhan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTaoDonCaNhan.setText("Tạo đơn đăng ký cá nhân");
        btnTaoDonCaNhan.setName("btnCaNhan"); // NOI18N
        btnTaoDonCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDonCaNhanActionPerformed(evt);
            }
        });

        btnTaoDonTapThe.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnTaoDonTapThe.setText("Tạo đơn đăng ký tập thể");
        btnTaoDonTapThe.setName("btnTapThe"); // NOI18N
        btnTaoDonTapThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoDonTapTheActionPerformed(evt);
            }
        });

        btnXemDSDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnXemDSDon.setText("Xem danh sách đơn đăng ký");
        btnXemDSDon.setName("btnXemDS"); // NOI18N
        btnXemDSDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemDSDonActionPerformed(evt);
            }
        });

        btnDeXuatCaiTien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDeXuatCaiTien.setText("Đề xuất cải tiến");
        btnDeXuatCaiTien.setName("btnCaiTien"); // NOI18N
        btnDeXuatCaiTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeXuatCaiTienActionPerformed(evt);
            }
        });

        btnDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.setName("btnDoiMK"); // NOI18N
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setName("btnThoat"); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnXemDSDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaoDonCaNhan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaoDonTapThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeXuatCaiTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnTaoDonCaNhan)
                .addGap(33, 33, 33)
                .addComponent(btnTaoDonTapThe)
                .addGap(33, 33, 33)
                .addComponent(btnXemDSDon)
                .addGap(33, 33, 33)
                .addComponent(btnDeXuatCaiTien)
                .addGap(35, 35, 35)
                .addComponent(btnDoiMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnDangXuat)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
        DoiMatKhau doiMatKhau = new DoiMatKhau(this, true);
        doiMatKhau.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        DangNhap dn = new DangNhap();
        dn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed


    private void btnTaoDonCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDonCaNhanActionPerformed
        // TODO add your handling code here:
                DonCaNhan dcn = new DonCaNhan(this, true);
                dcn.setVisible(true); //Truy cập đến đơn cá nhân
    }//GEN-LAST:event_btnTaoDonCaNhanActionPerformed

    private void btnXemDSDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemDSDonActionPerformed
        // TODO add your handling code here:
        
        DSDonDangKy dsDon = new DSDonDangKy(this, true);
        dsDon.setVisible(true);
    }//GEN-LAST:event_btnXemDSDonActionPerformed

    private void btnDeXuatCaiTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeXuatCaiTienActionPerformed
        // TODO add your handling code here:
        DeXuatCaiTien dx = new DeXuatCaiTien(this,true);
        dx.setVisible(true);
    }//GEN-LAST:event_btnDeXuatCaiTienActionPerformed

    private void btnTaoDonTapTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoDonTapTheActionPerformed
        // TODO add your handling code here:
        DonTapThe donTapThe = new DonTapThe(this, true);
        donTapThe.setVisible(true);
    }//GEN-LAST:event_btnTaoDonTapTheActionPerformed


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
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDeXuatCaiTien;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnTaoDonCaNhan;
    private javax.swing.JButton btnTaoDonTapThe;
    private javax.swing.JButton btnXemDSDon;
    // End of variables declaration//GEN-END:variables
}