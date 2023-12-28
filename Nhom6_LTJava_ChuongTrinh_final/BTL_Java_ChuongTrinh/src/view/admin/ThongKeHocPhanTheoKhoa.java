/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FakeData;
import model.HocPhan;
import model.HocPhanDangKyCuaKhoa;
import model.TTDonDangKy;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class ThongKeHocPhanTheoKhoa extends javax.swing.JDialog {

    private List<TTDonDangKy> listDonDangKy;
    private List<HocPhan> listHocPhan = FakeData.layHocPhan_Test();
    private String maKhoa;
    private Map<HocPhanDangKyCuaKhoa, Integer> mapHPCuaKhoa = new HashMap<>();
    
    public ThongKeHocPhanTheoKhoa(java.awt.Dialog parent, boolean modal, String maKhoa) {
        super(parent, modal);
        this.setTitle("Thống kê danh sách học phần có đơn đăng ký theo khoa");
        this.maKhoa = maKhoa;
        initComponents();
        taoDanhSachHocPhanCuaKhoa();
        viewTable();
    }

    private void taoDanhSachHocPhanCuaKhoa() {
        mapHPCuaKhoa.clear();
        listDonDangKy = FakeData.taoDSDonDangKyChuaDuyet_Test();
        for (TTDonDangKy don : listDonDangKy) {
            String maHP = don.getMaHP();

            // Kiểm tra xem HocPhan có trong danh sách chưa
            boolean daTonTai = false;
            for (HocPhan hp : listHocPhan) {
                if (hp.getMaHP().equals(maHP)) {
                    String maKhoaHocPhan = hp.getMaKhoa();

                    // Kiểm tra xem HocPhan có thuộc khoa được chỉ định không
                    if (maKhoaHocPhan.equals(maKhoa)) {
                        HocPhanDangKyCuaKhoa hpKhoa = new HocPhanDangKyCuaKhoa(maHP, hp.getTenHP());
                        mapHPCuaKhoa.put(hpKhoa, mapHPCuaKhoa.getOrDefault(hpKhoa, 0) + 1); //getOrDefault trả về giá trị của khóa nếu tồn tại nếu không thì trả về giá trị mặc định truyền vào
                    }

                    daTonTai = true;
                    break;
                }
            }
        }
    }

    public void viewTable() {
        DefaultTableModel model = (DefaultTableModel) this.tblDSHP.getModel();
        model.setRowCount(0);

        for (Map.Entry<HocPhanDangKyCuaKhoa, Integer> entry : mapHPCuaKhoa.entrySet()) {
            HocPhanDangKyCuaKhoa hpKhoa = entry.getKey();
            int soLuongDon = entry.getValue();

            model.addRow(new Object[]{hpKhoa.getMaHP(), hpKhoa.getTenHP(), soLuongDon});
        }
    }

    private void reloadTable() {
        taoDanhSachHocPhanCuaKhoa();
        viewTable(); // Hiển thị dữ liệu mới lên table
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
        tblDSHP = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblDSHP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã học phần", "Tên học phần", "Số đơn đăng ký"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDSHP.setName("tblKhoa"); // NOI18N
        jScrollPane1.setViewportView(tblDSHP);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Xem chi tiết");
        jButton2.setName("btnQuayLai"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Quay lại");
        jButton1.setName("btnQuayLai"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDSHP.getSelectedRow();

        try{
            if (selectedRow == -1) {
                throw new Exception();

            } else {
                String maHP = (String) tblDSHP.getValueAt(selectedRow, 0);
                // Gọi giao diện Thống kê đơn đăng ký theo học phần và truyền mã học phần
                // Ví dụ: new ThongKeDonDangKyTheoHocPhan(maHP);
                TKDonDKTheoHocPhan thongKeDonDangKyTheoHocPhan = new TKDonDKTheoHocPhan(this, true, maHP);
                thongKeDonDangKyTheoHocPhan.setVisible(true);

                reloadTable();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một học phần để xem chi tiết.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
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
            java.util.logging.Logger.getLogger(ThongKeHocPhanTheoKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeHocPhanTheoKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeHocPhanTheoKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeHocPhanTheoKhoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeHocPhanTheoKhoa dialog = new ThongKeHocPhanTheoKhoa(new javax.swing.JDialog(), true,"KCNTT");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDSHP;
    // End of variables declaration//GEN-END:variables
}