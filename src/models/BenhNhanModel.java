package models;


public class BenhNhanModel extends NguoiModel{
    private String maBenhNhan;

    public BenhNhanModel() {
    }

    public BenhNhanModel(String hoVaTen, String soDienThoai, String emai, String gioiTinh, String diaChi) {
        super(hoVaTen, soDienThoai, emai, gioiTinh, diaChi);
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    @Override
    public String toString() {
        return "BenhNhanModel{" + "maBenhNhan=" + maBenhNhan + '}';
    }
    
    
}
