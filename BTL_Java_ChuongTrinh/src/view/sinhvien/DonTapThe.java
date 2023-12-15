/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhvien;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HocPhan;

import model.SinhVien;

import model.SinhVienTapThe;

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
    private String tenHP;
    private String maHP;
    private String lyDo;
    private List<SinhVienTapThe> dsSV = new ArrayList<>();
    private SinhVienTapThe sinhVienTapThe;
    List<HocPhan> danhSachHocPhan = HocPhan.readHocPhanFromFile("HTTT.txt");

    private static int pos = -1;
    public DonTapThe() {
        initComponents();
       dsSV.add(new SinhVienTapThe("111","Nguyen Van Manh","CNTT"));
       dsSV.add(new SinhVienTapThe("222","Nguyen Van Manh","CNTT"));
       dsSV.add(new SinhVienTapThe("333","Nguyen Van Manh","CNTT"));
       dsSV.add(new SinhVienTapThe("444","Nguyen Van Manh","CNTT"));
       view();
       viewTable();
    }
    

    private String sinhMaDonTapThe() {
        String maDon = "DTT" + String.format("%04d", nextMaDonTapThe);
        nextMaDonTapThe++;
        return maDon;
    }
    public void view(){
        if(pos>=0){
            sinhVienTapThe = dsSV.get(pos);
            this.txtMaSV.setText(sinhVienTapThe.getMaSV());
            this.txtTenSV.setText(sinhVienTapThe.getHoTen());
            this.txtNganh.setText(sinhVienTapThe.getTenNganh());
        }
        
        
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
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSVTT = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txtTenSV = new javax.swing.JTextField();
        txtNganh = new javax.swing.JTextField();
        txtMaSV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();

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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Danh sách sinh viên");

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Mã sinh viên");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Tên sinh viên");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Ngành học");

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

        txtTenSV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTenSV.setName("txtMaHP"); // NOI18N

        txtNganh.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtNganh.setName("txtMaHP"); // NOI18N
        txtNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNganhActionPerformed(evt);
            }
        });

        txtMaSV.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtMaSV.setName("txtMaHP"); // NOI18N
        txtMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSVActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Thông tin sinh viên trong danh sách");

        btnLuu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(147, 147, 147)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btnGuiDon))
                        .addComponent(jLabel5))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnGuiDon))
                .addContainerGap())
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
        txtMaSV.setText("");
        txtTenSV.setText("");
        txtNganh.setText("");
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSVActionPerformed

    private void txtNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNganhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNganhActionPerformed

    private void tblSVTTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSVTTMouseClicked
        // TODO add your handling code here:
        pos = this.tblSVTT.getSelectedRow();
        view();
    }//GEN-LAST:event_tblSVTTMouseClicked

    private void tblSVTTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblSVTTKeyReleased
        // TODO add your handling code here:
        pos = this.tblSVTT.getSelectedRow();
        view();
    }//GEN-LAST:event_tblSVTTKeyReleased

    public boolean isCheck(){
        if(txtMaSV.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mã sinh viên!", "Invalidation", JOptionPane.ERROR_MESSAGE);
            txtMaSV.requestFocus();
            return false;
        }
        if(txtTenSV.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên sinh viên!", "Invalidation", JOptionPane.ERROR_MESSAGE);
            txtTenSV.requestFocus();
            return false;
        }
        if(txtNganh.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập ngành học!", "Invalidation", JOptionPane.ERROR_MESSAGE);
            txtNganh.requestFocus();
            return false;
        }
        return true;
    }
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        if(isCheck()){
            String maSV = txtMaSV.getText();
            String hoTen = txtTenSV.getText();
            String nganh = txtNganh.getText();

            //Kiem tra dieu kien truoc khi luu
            dsSV.add(new SinhVienTapThe(maSV,hoTen,nganh));
            view();
            viewTable();
        }
        
        
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int pos = this.tblSVTT.getSelectedRow();
        SinhVienTapThe sv = dsSV.get(pos);
        if(dsSV.contains(sv)){
            dsSV.remove(sv);
        }
        view();
        viewTable();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

        try{
            int pos = this.tblSVTT.getSelectedRow();
            dsSV.get(pos).setMaSV(txtMaSV.getText());
            dsSV.get(pos).setHoTen(txtTenSV.getText());
            dsSV.get(pos).setTenNganh(txtNganh.getText());
            view();
            viewTable();
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 sinh viên để sửa!", "Invalidation", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnGuiDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiDonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGuiDonActionPerformed

    private void cbbTenHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTenHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTenHPActionPerformed

    public void showRegistrationSuccessMessage() {
        JOptionPane.showMessageDialog(this, "Đăng ký thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    public void setRegisterButtonListener(ActionListener listener) {
        btnGuiDon.addActionListener(listener);
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
        this.tenHP = cbbTenHP.getSelectedItem().toString();
        this.maHP = txtMaHP.getText();
        this.lyDo = txtLyDo.getText();
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
    private javax.swing.JButton btnLuu;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSVTT;
    private javax.swing.JTextArea txtLyDo;
    private javax.swing.JTextField txtMaHP;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtNganh;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables
}
