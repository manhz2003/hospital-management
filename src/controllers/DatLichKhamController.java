package controllers;

import dao.DatLichKhamDao;
import java.util.ArrayList;
import models.BacSiModel;
import models.DatLichKhamModel;

public class DatLichKhamController {

    private final DatLichKhamDao datLichDao;

    public DatLichKhamController() {
        datLichDao = DatLichKhamDao.getInstance();
    }

    public ArrayList<BacSiModel> layDanhSachBacSiTheoChuyenKhoa(String chuyenKhoa) {
        return datLichDao.selectAllByChuyenKhoa(chuyenKhoa);
    }

    public int insertDatLich(DatLichKhamModel datLich) {
        return datLichDao.insert(datLich);
    }

    public ArrayList<DatLichKhamModel> layDanhSachDatLich() {
        return datLichDao.selectAll();
    }
    
    public ArrayList<DatLichKhamModel> layDanhSachDatLich2(String tenDangNhap) {
        return datLichDao.selectAll2(tenDangNhap);
    }

    public int xoaLichKhamTheoId(String id) {
        int rowsAffected = datLichDao.deleteById(id);
        if (rowsAffected > 0) {
            return rowsAffected;
        } else {
            return -1;
        }
    }

    public boolean kiemTraTrungLich(String selectedDate) {
        return datLichDao.kiemTraTrungLich(selectedDate);
    }

}
