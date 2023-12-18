/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.admin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.Khoa;

/**
 *
 * @author
 */
public class QuanLyKhoaVaLopHocPhan extends javax.swing.JFrame {

    DefaultTableModel tb = new DefaultTableModel();
    private ArrayList<Khoa> listKhoa;
    private data.controllerKhoa controller;

    /**
     * Creates new form QuanLyKhoaVaLopHocPhan
     */
    public QuanLyKhoaVaLopHocPhan() {
        initComponents();
        tb.addColumn("Mã khoa");
        tb.addColumn("Tên khoa");
        tb.addColumn("Số lớp HP");
        tbDSKhoa.setModel(tb);
        controller = new data.controllerKhoa();
        HienThi();
        loadDS("D:\\Java\\BTL\\Code\\BTL_JAVA\\BTL_Java_ChuongTrinh\\src\\data\\DSKhoa.txt");
        luuDS("D:\\Java\\BTL\\Code\\BTL_JAVA\\BTL_Java_ChuongTrinh\\src\\data\\DSKhoa.txt");
    }

    private void loadDS(String fileName) {
        listKhoa = controller.readKhoaFromFile(fileName);
        if (listKhoa != null) {
            for (Khoa kh : listKhoa) {
                tb.addRow(new Object[]{kh.getMaKhoa(), kh.getTenKhoa()});
            }
        }
//        try {
//            FileReader rd = new FileReader(fileName);
//            BufferedReader br = new BufferedReader(rd);
//            String line;
//            while((line = br.readLine()) != null){
//                String[] field = line.split("\t");
//                tb.addRow(field);
//            }
//            br.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    private void luuDS(String fileName) {
        listKhoa = new ArrayList<>();
        listKhoa.clear();
        for (int i = 0; i < tb.getRowCount(); i++) {
            String maKhoa = tb.getValueAt(i, 0).toString();
            String tenKhoa = tb.getValueAt(i, 1).toString();
            //int soLopHP = Integer.parseInt(tb.getValueAt(i, 2).toString());
            Khoa khoa = new Khoa(maKhoa, tenKhoa);
            listKhoa.add(khoa);
        }
        controller.writeKhoaToFile(listKhoa, fileName);
    }

    private void HienThi(){
        tbDSKhoa.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(tbDSKhoa.getSelectedRow() >= 0){
                    txtmaK.setText(tbDSKhoa.getValueAt(tbDSKhoa.getSelectedRow(), 0) + "");
                    txtTenK.setText(tbDSKhoa.getValueAt(tbDSKhoa.getSelectedRow(), 1) + "");
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSKhoa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmaK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        txtTenK = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbDSKhoa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbDSKhoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Mã khoa", "Tên khoa", "Số lớp học phần"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDSKhoa);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btExit)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSua)
                .addGap(18, 18, 18)
                .addComponent(btXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btExit)
                .addGap(26, 26, 26))
        );

        jLabel1.setText("Mã khoa");

        jLabel2.setText("Tên khoa");

        jLabel3.setText("Số lớp HP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenK, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(txtmaK))
                .addGap(62, 62, 62)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("QUẢN LÝ DANH SÁCH CÁC KHOA ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel4)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn quay lại chương trình", "Xác nhận", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btExitActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int selectedRow = tbDSKhoa.getSelectedRow(); // Lấy dòng được chọn

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
            luuDS("D:\\Java\\BTL\\Code\\BTL_JAVA\\BTL_Java_ChuongTrinh\\src\\data\\DSKhoa.txt");
        }
    }//GEN-LAST:event_btXoaActionPerformed
    

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int selectedRow = tbDSKhoa.getSelectedRow(); // Lấy dòng được chọn
        
        if (selectedRow == -1) { // Kiểm tra xem có dòng nào được chọn không
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            String ma  = txtmaK.getText();
            String ten = txtTenK.getText();
            
            tbDSKhoa.setValueAt(ma, selectedRow, 0);
            tbDSKhoa.setValueAt(ten, selectedRow, 1);
            
            txtmaK.setText("");
            txtTenK.setText("");
            luuDS("D:\\Java\\BTL\\Code\\BTL_JAVA\\BTL_Java_ChuongTrinh\\src\\data\\DSKhoa.txt");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        String ma = txtmaK.getText();
        String ten = txtTenK.getText();
        if(ma.isEmpty() || ten.isEmpty()){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!", "Thông báp", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Object[] kMoi = {ma, ten};
        DefaultTableModel model = (DefaultTableModel) tbDSKhoa.getModel();
        model.addRow(kMoi);
        tbDSKhoa.updateUI();
        JOptionPane.showMessageDialog(rootPane, "Thêm thành công thành viên mới !");
        luuDS("D:\\Java\\BTL\\Code\\BTL_JAVA\\BTL_Java_ChuongTrinh\\src\\data\\DSKhoa.txt");
        
        txtmaK.setText("");
        txtTenK.setText("");
    }//GEN-LAST:event_btThemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKhoaVaLopHocPhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbDSKhoa;
    private javax.swing.JTextField txtTenK;
    private javax.swing.JTextField txtmaK;
    // End of variables declaration//GEN-END:variables
}
