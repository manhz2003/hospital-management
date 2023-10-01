package dao;
import java.sql.*;
import models.DanhGiaModel;
public class DanhGiaDao {

     public boolean luuDanhGia(DanhGiaModel danhGia) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectDB.getConnection();

            String insertQuery = "INSERT INTO danhgia (tenTaiKhoan, danhGia, gopY) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, danhGia.getTenTaiKhoan());
            preparedStatement.setString(2, danhGia.getDanhGia());
            preparedStatement.setString(3, danhGia.getGopY());

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Lỗi xảy ra
        } finally {
            ConnectDB.closeConnection(connection);
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
