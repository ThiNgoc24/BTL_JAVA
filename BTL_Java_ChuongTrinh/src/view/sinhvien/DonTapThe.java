/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhvien;

import controller.DonTapTheController;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FakeData;
import model.FakeData1;
import model.HocPhan;
import model.SinhVienTapThe;
import model.TTDonTapThe;

/**
 *
 * @author Le Thi Ngoc
 */
public class DonTapThe extends javax.swing.JFrame {

    /**
     * Creates new form DonTapThe
     */
    private static int nextMaDonTapThe = 1;
    private String maDonTapThe;
    private String maSV;
    private String tenHP;
    private String maHP;
    private String lyDo;
    private List<SinhVienTapThe> dsSV = new ArrayList<>();
    private String trangThai;
    private SinhVienTapThe sinhVienTapThe;
    List<HocPhan> danhSachHocPhan = HocPhan.readHocPhanFromFile("HTTT.txt");

    private static int pos = -1;
    public DonTapThe() {
        initComponents();
        viewTable();
    }
    

    private String sinhMaDonTapThe() {
        String maDon = "DTT" + String.format("%03d", nextMaDonTapThe);
        nextMaDonTapThe++;
        return maDon;
    }

    public void viewTable(){
        DefaultTableModel model = (DefaultTableModel) this.tblSVTT.getModel();
        model.setRowCount(0);
        
        for(SinhVienTapThe x:dsSV){
            model.addRow(new Object[]{x.getMaSV(),x.getHoTen(),x.getTenNganh()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGuiDon = new javax.swing.JButton();
        cbbTenHP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaHP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLyDo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSVTT = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Tên học phần");

        btnGuiDon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGuiDon.setText("Gửi đơn");
        btnGuiDon.setName("btnGuiDon"); // NOI18N
        btnGuiDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiDonActionPerformed(evt);
            }
        });

        cbbTenHP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cbbTenHP.setModel(new javax.swing.DefaultComboBoxModel<>());
        cbbTenHP.setName("cbbTenHP"); // NOI18N
        // Tạo DefaultComboBoxModel từ danh sách tên học phần
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (HocPhan hocPhan : danhSachHocPhan) {
            model.addElement(hocPhan.getTenHP());
        }
        // Thiết lập mô hình cho JComboBox
        cbbTenHP.setModel(model);
        cbbTenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTenHPActionPerformed(evt);
            }
        });
        cbbTenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Lấy tên học phần được chọn
                String selectedTenHP = (String) cbbTenHP.getSelectedItem();

                // Tìm học phần tương ứng trong danh sách
                for (HocPhan hocPhan : danhSachHocPhan) {
                    if (hocPhan.getTenHP().equals(selectedTenHP)) {
                        // Gán mã học phần vào txtMaHP
                        txtMaHP.setText(hocPhan.getMaHP());
                        break;
                    }
                }
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Mã học phần");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Lý do mở lớp");

        txtMaHP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMaHP.setName("txtMaHP"); // NOI18N

        txtLyDo.setColumns(20);
        txtLyDo.setRows(5);
        txtLyDo.setName("txtLyDo"); // NOI18N
        jScrollPane1.setViewportView(txtLyDo);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Thoát");
        jButton1.setName("btnThoat"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setName("btnThem"); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setName("btnSua"); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setName("btnXoa"); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblSVTT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Ngành học"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSVTT.setName("tblDSSV"); // NOI18N
        tblSVTT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSVTTMouseClicked(evt);
            }
        });
        tblSVTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblSVTTKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblSVTT);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Danh sách sinh viên");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnGuiDon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGuiDon))
                .addGap(60, 60, 60))
        );

        txtMaHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Lấy mã học phần từ txtMaHP
                String maHP = txtMaHP.getText();
                boolean check = false;
                // Tìm học phần tương ứng trong danh sách
                for (HocPhan hocPhan : danhSachHocPhan) {
                    if (hocPhan.getMaHP().equals(maHP)) {
                        // Gán tên học phần vào cbbTenHP
                        cbbTenHP.setSelectedItem(hocPhan.getTenHP());
                        check = true;
                        break;
                    }
                }
                if (!check){
                    JOptionPane.showMessageDialog(null, "Không tồn tại mã học phần!", "Invalidation", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ChiTietDTT chiTietDonTapThe = new ChiTietDTT(this,true);
        // Thiết lập chế độ là thêm mới cho JFrame con
        chiTietDonTapThe.setAddMode();
        //Hiển thị Jframe con
        chiTietDonTapThe.setVisible(true);
        // Code ở đây sẽ thực hiện sau khi childDialog đóng
                SinhVienTapThe sinhVienTapThe = chiTietDonTapThe.getSVTT();
                if(sinhVienTapThe != null){
                    dsSV.add(sinhVienTapThe);
                    viewTable();
                }

        
    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblSVTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVTTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSVTTMouseClicked

    private void tblSVTTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSVTTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblSVTTKeyReleased

    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = tblSVTT.getSelectedRow();

        // Kiểm tra xem có dòng nào được chọn hay không
        if (selectedRow != -1 && selectedRow < dsSV.size()) {
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa sinh viên này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                dsSV.remove(selectedRow);
                viewTable();
            }
        } else {
            // Hiển thị thông báo khi không có dòng nào được chọn
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một sinh viên để xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            int selectedRow = this.tblSVTT.getSelectedRow();
            SinhVienTapThe sv = dsSV.get(selectedRow);

            ChiTietDTT chiTietDonTapThe = new ChiTietDTT(this, true);

            // Truyền thông tin sinh viên cho JFrame con
            chiTietDonTapThe.setSinhVien(sv);

            // Thiết lập chế độ là sửa cho JFrame con
            chiTietDonTapThe.setEditMode();
            chiTietDonTapThe.setVisible(true);
            // Code ở đây sẽ thực hiện sau khi childDialog đóng
                SinhVienTapThe sinhVienTapThe = chiTietDonTapThe.getSVTT();
                if(sinhVienTapThe != null){
                    sv.setMaSV(sinhVienTapThe.getMaSV());
                    sv.setHoTen(sinhVienTapThe.getHoTen());
                    sv.setTenNganh(sinhVienTapThe.getTenNganh());
                    viewTable();
                }
                
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 sinh viên để sửa!", "Invalidation", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnGuiDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiDonActionPerformed
        // TODO add your handling code here:
        // Lấy thông tin từ form và tạo đối tượng TTDonTapThe
        this.setResults();
        TTDonTapThe donTapThe = new TTDonTapThe(maDonTapThe,maSV, tenHP, maHP, lyDo, dsSV,trangThai);

        // Gọi phương thức lưu trữ trong model
        DonTapTheController.saveDonTapTheInfo(donTapThe);

        // Hiển thị thông báo đăng ký thành công hoặc xử lý khác tùy ý
        this.showRegistrationSuccessMessage();
    }//GEN-LAST:event_btnGuiDonActionPerformed

    private void cbbTenHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTenHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTenHPActionPerformed

    public void showRegistrationSuccessMessage() {
        JOptionPane.showMessageDialog(this, "Đăng ký thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    public String getTenHP() {
        return tenHP;
    }

    public void setTenHP(String tenHP) {
        this.tenHP = tenHP;
    }

    public String getMaHP() {
        return maHP;
    }

    public void setMaHP(String maHP) {
        this.maHP = maHP;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public List<SinhVienTapThe> getDsSV() {
        return dsSV;
    }

    public void setDsSV(List<SinhVienTapThe> dsSV) {
        this.dsSV = dsSV;
    }

    public String getMaDonTapThe() {
        return maDonTapThe;
    }

    public void setMaDonTapThe(String maDonTapThe) {
        this.maDonTapThe = maDonTapThe;
    }

    public void setResults(){
        this.maDonTapThe = sinhMaDonTapThe();
        this.maSV = FakeData1.maSVDN;
        this.tenHP = cbbTenHP.getSelectedItem().toString();
        this.maHP = txtMaHP.getText();
        this.lyDo = txtLyDo.getText();
        this.trangThai = "Chưa duyệt";
    }
    
    
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
            java.util.logging.Logger.getLogger(DonTapThe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonTapThe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonTapThe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonTapThe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonTapThe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuiDon;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbTenHP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSVTT;
    private javax.swing.JTextArea txtLyDo;
    private javax.swing.JTextField txtMaHP;
    // End of variables declaration//GEN-END:variables
}
