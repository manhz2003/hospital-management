package controllers;

import dao.QuanLyBacSiDao;
import java.util.ArrayList;
import models.BacSiModel;

public class BacSiController {

    private QuanLyBacSiDao bacSiDao;

    public BacSiController() {
        bacSiDao = QuanLyBacSiDao.getInstance();
    }

    public int themBacSi(BacSiModel bacSi) {
        int rowsAffected = bacSiDao.insert(bacSi);
        if (rowsAffected > 0) {
            System.out.println("Thêm bác sĩ thành công !");
        } else {
            System.out.println("Thêm bác sĩ thất bại !");
        }
        return rowsAffected;
    }

    public boolean kiemTraMaBacSiTrung(String maBacSi) {
        return bacSiDao.maBacSiTrung(maBacSi);
    }

    // Phương thức để lấy danh sách bác sĩ từ model
    public ArrayList<BacSiModel> layDanhSachBacSi() {
        return bacSiDao.selectAll();
    }
    
    public int xoaBacSiTheoID(String id) {
    // Gọi phương thức xóa từ lớp DAO
    int rowsAffected = bacSiDao.deleteById(id);
    
    if (rowsAffected > 0) {
        // Dữ liệu đã được xóa thành công
        return rowsAffected;
    } else {
        // Xóa thất bại hoặc không tìm thấy dữ liệu để xóa
        return -1;
    }
}

}
