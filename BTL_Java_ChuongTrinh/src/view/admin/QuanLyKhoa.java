/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.FakeData;
import model.Khoa;
import model.Nganh;

/**
 *
 * @author
 */
public class QuanLyKhoa extends javax.swing.JFrame {

    private List<Khoa> listKhoa = new ArrayList<>(FakeData.listKhoa);
    private String pathKhoa = "src\\data\\Khoa.txt";
    DefaultTableModel tb;

    /**
     * Creates new form QuanLyKhoaVaLopHocPhan
     */
    public QuanLyKhoa() {
        initComponents();
        this.setTitle("Quản lý khoa");
        tbl_DSKhoa.setDefaultEditor(Object.class, null);
        loadData();
        HienThi();
    }

    private void loadData() {
        tb = new DefaultTableModel();
        List<Khoa> listKhoa = new ArrayList<>(this.listKhoa);
        tb.addColumn("Mã khoa");
        tb.addColumn("Tên khoa");
        tb.addColumn("Số ngành");
        for (Khoa khoa : listKhoa) {
            Object[] row = {
                khoa.getMaKhoa(),
                khoa.getTenKhoa(),
                khoa.getSoNganh(),};
            tb.addRow(row);
        }
        tbl_DSKhoa.setModel(tb);
    }

    private void saveFileKhoa() {
        //Cập nhật danh sách vào file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathKhoa))) {
            // Ghi dữ liệu vào file
            for (Khoa khoa : listKhoa) {
                System.out.println(khoa.toString());
                writer.write(khoa.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void HienThi() {
        tbl_DSKhoa.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tbl_DSKhoa.getSelectedRow() >= 0) {
                    txtmaK.setText(tbl_DSKhoa.getValueAt(tbl_DSKhoa.getSelectedRow(), 0) + "");
                    txtTenK.setText(tbl_DSKhoa.getValueAt(tbl_DSKhoa.getSelectedRow(), 1) + "");
                }
            }
        });
    }

    public boolean ktraMaTonTai(String maKhoa) {
        for (Khoa khoa : listKhoa) {
            if (khoa.getMaKhoa().equals(maKhoa)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_DSKhoa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btchitiet = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmaK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_DSKhoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbl_DSKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Mã khoa", "Tên khoa", "Số ngành học"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_DSKhoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DSKhoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_DSKhoa);

        btThem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btThem.setText("Thêm ");
        btThem.setName("btnThem"); // NOI18N
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btSua.setText("Sửa");
        btSua.setName("btnSua"); // NOI18N
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btXoa.setText("Xoá");
        btXoa.setName("btnXoa"); // NOI18N
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btExit.setText("Quay lại");
        btExit.setName("btnQuayLai"); // NOI18N
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btchitiet.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btchitiet.setText("Xem DS Ngành");
        btchitiet.setName("btnSua"); // NOI18N
        btchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btchitiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSua)
                .addGap(18, 18, 18)
                .addComponent(btXoa)
                .addGap(18, 18, 18)
                .addComponent(btchitiet)
                .addGap(18, 18, 18)
                .addComponent(btExit))
        );

        jLabel1.setText("Mã khoa");

        jLabel2.setText("Tên khoa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtmaK, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(txtTenK))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        TrangChuAdmin tt = new TrangChuAdmin();
        if (JOptionPane.showConfirmDialog(this, "Bạn muốn thoát khỏi chương trình này!", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            tt.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btExitActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        try {
            int selectedRow = tbl_DSKhoa.getSelectedRow(); // Lấy dòng được chọn
            if (selectedRow == -1) { // Kiểm tra xem có dòng nào được chọn không
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                // Lấy dữ liệu từ dòng được chọn
                String maKhoa = tb.getValueAt(selectedRow, 0).toString();
                String tenKhoa = tb.getValueAt(selectedRow, 1).toString();
                if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn xoá", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    // Xóa dòng dữ liệu từ bảng
                    tb.removeRow(selectedRow);

                    // Xóa dòng dữ liệu từ danh sách
                    for (Khoa khoa : listKhoa) {
                        if (khoa.getMaKhoa().equals(maKhoa) && khoa.getTenKhoa().equals(tenKhoa)) {
                            listKhoa.remove(khoa);
                            break;
                        }
                    }
                }
                saveFileKhoa();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btXoaActionPerformed


    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int selectedRow = tbl_DSKhoa.getSelectedRow(); // Lấy dòng được chọn

        if (selectedRow == -1) { // Kiểm tra xem có dòng nào được chọn không
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            String ma = txtmaK.getText();
            String ten = txtTenK.getText();

            tbl_DSKhoa.setValueAt(ma, selectedRow, 0);
            tbl_DSKhoa.setValueAt(ten, selectedRow, 1);

            saveFileKhoa();
            txtmaK.setText("");
            txtTenK.setText("");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String ma = txtmaK.getText();
        String ten = txtTenK.getText();
        if (ma.isEmpty() || ten.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ktraMaTonTai(ma)) {
            JOptionPane.showMessageDialog(null, "Mã khoa đã tồn tài trong CSDL!", "Thông báo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Object[] kMoi = {ma, ten, 0};
        DefaultTableModel model = (DefaultTableModel) tbl_DSKhoa.getModel();
        model.addRow(kMoi);
        tbl_DSKhoa.updateUI();
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
        Khoa khoa = new Khoa(ma, ten);
        listKhoa.add(khoa);
        saveFileKhoa();

        txtmaK.setText("");
        txtTenK.setText("");
    }//GEN-LAST:event_btThemActionPerformed

    private void tbl_DSKhoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DSKhoaMouseClicked

    }//GEN-LAST:event_tbl_DSKhoaMouseClicked

    private void btchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchitietActionPerformed
        try {
            int selectedRow = tbl_DSKhoa.getSelectedRow();

            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một khoa để xem chi tiết.");
            } else {
                String maKhoa = (String) tbl_DSKhoa.getValueAt(selectedRow, 0);
                // Thống kê số học phần theo học khoa và truyền mã khoa
                QuanLyNganhTheoKhoa nganhTheoKhoa = new QuanLyNganhTheoKhoa(this, true, maKhoa);
                
                nganhTheoKhoa.setVisible(true);
                Nganh nganh = nganhTheoKhoa.getNganh();
                if(nganh != null){
                    for(Khoa khoa : listKhoa){
                        if(khoa.getMaKhoa().equals(maKhoa)){
                            khoa.setSoNganh(khoa.getSoNganh()+1);
                            break;
                        }
                    }
                    loadData();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btchitietActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton btchitiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_DSKhoa;
    private javax.swing.JTextField txtTenK;
    private javax.swing.JTextField txtmaK;
    // End of variables declaration//GEN-END:variables

}
