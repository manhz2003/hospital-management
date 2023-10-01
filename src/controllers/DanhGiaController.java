package controllers;

import dao.DanhGiaDao;
import models.DanhGiaModel;

public class DanhGiaController {

    private DanhGiaDao danhGiaDao;

    public DanhGiaController() {
        danhGiaDao = new DanhGiaDao();
    }

    public boolean luuDanhGia(DanhGiaModel danhGia) {
        return danhGiaDao.luuDanhGia(danhGia);
    }
}
