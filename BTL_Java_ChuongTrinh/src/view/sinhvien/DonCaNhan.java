/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.sinhvien;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.DefaultComboBoxModel;
import model.HocPhan;
import model.SinhVien;

/**
 *
 * @author Le Thi Ngoc
 */
public class DonCaNhan extends javax.swing.JFrame {
    List<String> data = new ArrayList<>();
    private static int nextMaDon = 1;
    private String lyDo;
    private SinhVien sv = new SinhVien("Nguyễn Thị Điệp", "HTTT", "2021601120", "abcd");
    List<HocPhan> danhSachHocPhan = HocPhan.readHocPhanFromFile("HTTT.txt");

    /**
     * Creates new form ĐonCaNhan
     */
    public DonCaNhan() {
        initComponents();
        /*data.add("Tư tưởng Hồ Chí Minh");
        data.add("Pháp luật đại cương");
        data.add("Kỹ năng giao tiếp");
        data.add("Giáo dục thể chất");
        data.add("Kiến trúc máy tính");
        data.add("Toán rời rạc");
        data.add("Lập trình căn bản");
        data.add("Kỹ thuật lập trình");
        data.add("Cơ sở dữ liệu");
        data.add("TcCNTT2");
        cboTenHP.removeAllItems();
        for (String ten : data) {
            cboTenHP.addItem(ten);
        }*/
    }
     private String MaDon() {
        String maDon = "DCN" + String.format("%04d", nextMaDon);
        nextMaDon++;
        return maDon;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cboTenHP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaHP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLyDo = new javax.swing.JTextArea();
        btnThoat = new javax.swing.JButton();
        btnGui = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Tên học phần");

        cboTenHP.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cboTenHP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboTenHP.setName("cbbTenHP"); // NOI18N
        cboTenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenHPActionPerformed(evt);
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

        btnThoat.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setName("btnThoat"); // NOI18N
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnGui.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnGui.setText("Gửi đơn");
        btnGui.setName("btnGuiDon"); // NOI18N
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTenHP, 0, 239, Short.MAX_VALUE)
                            .addComponent(txtMaHP)))
                    .addComponent(jLabel4))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnGui)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboTenHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGui)
                    .addComponent(btnThoat))
                .addGap(22, 22, 22))
        );

        // Tạo DefaultComboBoxModel từ danh sách tên học phần
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (HocPhan hocPhan : danhSachHocPhan) {
            model.addElement(hocPhan.getTenHP());
        }
        // Thiết lập mô hình cho JComboBox
        cboTenHP.setModel(model);
        cboTenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenHPActionPerformed(evt);
            }
        });
        cboTenHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Lấy tên học phần được chọn
                String selectedTenHP = (String) cboTenHP.getSelectedItem();

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        // TODO add your handling code here:
        this.themDon();
    }

    private void themDon() {
        String d1 = (String) cboTenHP.getSelectedItem();
        String d2 = txtMaHP.getText();
        String d3 = txtLyDo.getText();

        if (d1.trim().equals("") || d2.trim().equals("") || d3.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!", "Invalidation", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            String md = MaDon();
            String filePath = "src/Data/DonCaNhan.txt";
            try {
                // Khởi tạo FileWriter với đường dẫn tới tệp tin và true để cho phép ghi thêm
                FileWriter fileWriter = new FileWriter(filePath, true);

                // Khởi tạo BufferedWriter
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Ghi dữ liệu vào tệp tin
                bufferedWriter.write(md + ", " + sv.getMaTK() + ", " + sv.getHoTenSV() + ", " + d1 + ", " + d2 + ", " + d3);
                bufferedWriter.newLine(); // Thêm dòng mới sau mỗi dữ liệu

                // Đóng BufferedWriter
                bufferedWriter.close();
                JOptionPane.showMessageDialog(this, "Thêm đơn thành công!", "Invalidation", JOptionPane.ERROR_MESSAGE);
                System.out.println("Đã thêm dữ liệu vào tệp tin thành công.");
            } catch (IOException e) {
                System.out.println("Đã xảy ra lỗi khi thêm dữ liệu vào tệp tin: " + e.getMessage());
            }
        }                          

    }//GEN-LAST:event_btnGuiActionPerformed

    private void cboTenHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenHPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTenHPActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
                TrangChuSinhVien sv = new TrangChuSinhVien();
                sv.setVisible(true); //Truy cập đến trang chủ sinh viên
                dispose(); //Đóng giao diện hiện tại
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(DonCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonCaNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonCaNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGui;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboTenHP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtLyDo;
    private javax.swing.JTextField txtMaHP;
    // End of variables declaration//GEN-END:variables
}
