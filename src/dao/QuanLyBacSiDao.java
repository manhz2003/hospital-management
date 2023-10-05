package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.BacSiModel;

public class QuanLyBacSiDao implements DaoInterface<BacSiModel> {

    private static QuanLyBacSiDao instance;

    public QuanLyBacSiDao() {

    }

    // Phương thức để lấy ra instance của QuanLyTaiKhoanDao
    public static synchronized QuanLyBacSiDao getInstance() {
        if (instance == null) {
            instance = new QuanLyBacSiDao();
        }
        return instance;
    }

    @Override
    public int insert(BacSiModel t) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rowsAffected = 0;

        try {
            // Lấy kết nối tới cơ sở dữ liệu
            connection = ConnectDB.getConnection();

            // Chuẩn bị câu truy vấn SQL để chèn dữ liệu
            String sql = "INSERT INTO bacsi (maBacSi, hoVaTen, soDienThoai, email, diaChi, GioiTinh, chuyenKhoa, kinhNghiemLamViec, hocVan, hinhAnh) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);

            // Đặt các tham số cho câu truy vấn SQL từ đối tượng DangKy
            preparedStatement.setString(1, t.getMaBacSi());
            preparedStatement.setString(2, t.getHoVaTen());
            preparedStatement.setString(3, t.getSoDienThoai());
            preparedStatement.setString(4, t.getEmai());
            preparedStatement.setString(5, t.getDiaChi());
            preparedStatement.setString(6, t.getGioiTinh());
            preparedStatement.setString(7, t.getChuyenKhoa());
            preparedStatement.setString(8, t.getKinhNgiemLamViec());
            preparedStatement.setString(9, t.getHocVan());
            preparedStatement.setString(10, t.getHinhAnh());

            // Thực hiện chèn dữ liệu và lấy số dòng bị ảnh hưởng
            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối và tài nguyên
            ConnectDB.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return rowsAffected;
    }

//    kiểm tra mã bác sĩ bị trùng
    public boolean maBacSiTrung(String maBacSi) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = ConnectDB.getConnection();

            // Kiểm tra xem mã bác sĩ đã tồn tại chưa
            String checkExistQuery = "SELECT * FROM bacsi WHERE maBacSi=?";
            preparedStatement = connection.prepareStatement(checkExistQuery);
            preparedStatement.setString(1, maBacSi);
            resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Lỗi xảy ra
        } finally {
            // Đóng tài nguyên
            ConnectDB.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public int update(BacSiModel t, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteById(String id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int rowsAffected = 0;

        try {
            // Lấy kết nối tới cơ sở dữ liệu
            connection = ConnectDB.getConnection();

            // Chuẩn bị câu truy vấn SQL để xóa dữ liệu
            String sql = "DELETE FROM bacsi WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);

            // Đặt tham số cho câu truy vấn SQL
            preparedStatement.setString(1, id);

            // Thực hiện xóa dữ liệu và lấy số dòng bị ảnh hưởng
            rowsAffected = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối và tài nguyên
            ConnectDB.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return rowsAffected;
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<BacSiModel> selectAll() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<BacSiModel> list = new ArrayList<>();

        try {
            connection = ConnectDB.getConnection();
            String sql = "SELECT * FROM bacsi";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                BacSiModel bacSi = new BacSiModel();
                bacSi.setMaBacSi(resultSet.getString("maBacSi"));
                bacSi.setHoVaTen(resultSet.getString("hoVaTen"));
                bacSi.setSoDienThoai(resultSet.getString("soDienThoai"));
                bacSi.setEmai(resultSet.getString("email"));
                bacSi.setDiaChi(resultSet.getString("diaChi"));
                bacSi.setGioiTinh(resultSet.getString("gioiTinh"));
                bacSi.setChuyenKhoa(resultSet.getString("chuyenKhoa"));
                bacSi.setKinhNgiemLamViec(resultSet.getString("kinhNghiemLamViec"));
                bacSi.setHocVan(resultSet.getString("hocVan"));
                bacSi.setHinhAnh(resultSet.getString("hinhAnh"));

                list.add(bacSi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectDB.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return list;
    }

    @Override
    public BacSiModel selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
