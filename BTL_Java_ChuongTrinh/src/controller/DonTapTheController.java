/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.SinhVienTapThe;
import model.TTDonTapThe;
import model.TTDonTapTheModel;
import view.sinhvien.DonTapThe;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class DonTapTheController {
    private DonTapThe view;
    public DonTapTheController(DonTapThe view) {
        this.view = view;
        //gọi hàm lắng nghe sự kiện từ nút Gửi đơn
        view.setRegisterButtonListener(e -> registerDonTapThe());
    }
    
    private void registerDonTapThe() {
        // Lấy thông tin từ form và tạo đối tượng TTDonTapThe
        view.setResults();
        String maDonTapThe = view.getMaDonTapThe();
        String tenHP = view.getTenHP();
        String maHP = view.getMaHP();
        String lyDo = view.getLyDo();
        List<SinhVienTapThe> dsSV = view.getDsSV();

        TTDonTapThe donTapThe = new TTDonTapThe(maDonTapThe, tenHP, maHP, lyDo, dsSV);

        // Gọi phương thức lưu trữ trong model
        TTDonTapTheModel.saveDonTapTheInfo(donTapThe);

        // Hiển thị thông báo đăng ký thành công hoặc xử lý khác tùy ý
        view.showRegistrationSuccessMessage();
    }
}
