/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author manht
 */
public class QuanLyHoSoBenhAn extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public QuanLyHoSoBenhAn() {
        initComponents();
        setTitle("Hồ sơ bệnh án");
        setIconImageJframe();
        setMenu();
    }

    //    set icon cho jframe form
    private void setIconImageJframe() {
        URL hospitalIcon = DangKy.class.getResource("icons/Hospital-red-icon.png");
        Image img;
        img = Toolkit.getDefaultToolkit().createImage(hospitalIcon);
        this.setIconImage(img);
    }

//    menu
    private JFrame frame;

    private void setMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu jMenuTrangChu = new JMenu("Trang chủ");
        JMenu jMenuDangKy = new JMenu("Đăng ký");
        JMenu jMenuDangNhap = new JMenu("Đăng nhập");
        JMenu jMenuGioiThieu = new JMenu("Giới thiệu");
        JMenu jMenuThoat = new JMenu("Thoát");

//        xét màu đậm cho menu
//        Font boldFont = new Font("Arial", Font.BOLD, 12);
//        jMenuDangNhap.setFont(boldFont);
        menuBar.add(jMenuTrangChu);
        menuBar.add(jMenuDangKy);
        menuBar.add(jMenuDangNhap);
        menuBar.add(jMenuGioiThieu);
        menuBar.add(jMenuThoat);
        int with = 14;
        int height = 14;

//        chuyển form quản lý bác sĩ khẩu sang đăng ký
        jMenuDangKy.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
//                đóng form hiện tại
                dispose();
//                Tạo form mới
                DangKy dangKy = null;
                try {
                    dangKy = new DangKy();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(QuanLyHoSoBenhAn.class.getName()).log(Level.SEVERE, null, ex);
                }

//                Hiển thị form mới
                dangKy.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });

//        chuyển form quản lý hồ sơ bệnh án sang form trang chủ
        jMenuTrangChu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
//                đóng form hiện tại
                dispose();
//                Tạo form mới
                TrangChu trangChu = new TrangChu();
//                Hiển thị form mới
                trangChu.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });

//        chuyển form quản lý hồ sơ bệnh án sang form giới thiệu
        jMenuGioiThieu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
//                đóng form hiện tại
                dispose();
//                Tạo form mới
                GioiThieu gioiThieu = new GioiThieu();

//                Hiển thị form mới
                gioiThieu.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });

        //        chuyển form hồ sơ bệnh án sang form đăng nhập
        jMenuDangNhap.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
//                đóng form hiện tại
                dispose();
//                Tạo form mới
                DangNhap dangNhap = new DangNhap();

//                Hiển thị form mới
                dangNhap.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });

//        thoát chương trình
        jMenuThoat.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                int result = JOptionPane.showConfirmDialog(frame, "Bạn có chắc chắn muốn thoát chương trình không?", "Thoát chương trình", JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });

//       icon trang chủ
        String imgTrangChu = "views/icons/Home-icon.png";
        ClassLoader clTrangChu = getClass().getClassLoader();
        java.net.URL imageURLTrangChu = clTrangChu.getResource(imgTrangChu);
        ImageIcon iconTrangChu = new ImageIcon(imageURLTrangChu);
        jMenuTrangChu.setIcon(iconTrangChu);
        jMenuTrangChu.setIcon(new ImageIcon(iconTrangChu.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//       icon đăng ký
        String imgDangKy = "views/icons/regiter-icon.png";
        ClassLoader clDangKy = getClass().getClassLoader();
        java.net.URL imageURLDangKy = clDangKy.getResource(imgDangKy);
        ImageIcon iconDangKy = new ImageIcon(imageURLDangKy);
        jMenuDangKy.setIcon(iconDangKy);
        jMenuDangKy.setIcon(new ImageIcon(iconDangKy.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//       icon đăng nhập
        String imgDangNhap = "views/icons/login-icon.png";
        ClassLoader clDangNhap = getClass().getClassLoader();
        java.net.URL imageURLDangNhap = clDangNhap.getResource(imgDangNhap);
        ImageIcon iconDangNhap = new ImageIcon(imageURLDangNhap);
        jMenuDangNhap.setIcon(iconDangNhap);
        jMenuDangNhap.setIcon(new ImageIcon(iconDangNhap.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//       icon giới thiệu
        String imgGioiThieu = "views/icons/About-me-icon.png";
        ClassLoader clGioiThieu = getClass().getClassLoader();
        java.net.URL imageURLGioiThieu = clGioiThieu.getResource(imgGioiThieu);
        ImageIcon iconGioiThieu = new ImageIcon(imageURLGioiThieu);
        jMenuGioiThieu.setIcon(iconGioiThieu);
        jMenuGioiThieu.setIcon(new ImageIcon(iconGioiThieu.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//       icon thoát
        String imgThoat = "views/icons/Exit-icon.png";
        ClassLoader clThoat = getClass().getClassLoader();
        java.net.URL imageURLThoat = clThoat.getResource(imgThoat);
        ImageIcon iconThoat = new ImageIcon(imageURLThoat);
        jMenuThoat.setIcon(iconThoat);
        jMenuThoat.setIcon(new ImageIcon(iconThoat.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

        setJMenuBar(menuBar);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jButton1)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButton1)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHoSoBenhAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoSoBenhAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoSoBenhAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHoSoBenhAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHoSoBenhAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
