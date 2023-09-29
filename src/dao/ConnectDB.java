package dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    public static Connection getConnection() {
        Connection c = null;
        try {
            String url = "jdbc:mySQL://localhost:3306/QuanLyBenhVien";
            String username = "root";
            String password = "";
            c = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void closeConnection(Connection c) {
           try {
            if (c != null){
               c.close();
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
