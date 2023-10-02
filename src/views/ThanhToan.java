/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author manht
 */
public class ThanhToan extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ThanhToan() {
        initComponents();
        setTitle("Thanh toán");
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
        JMenu jMenuQuanLy = new JMenu("Quản lý");
        JMenu jMenuDatLich = new JMenu("Đặt lịch");
        JMenu jMenuThoat = new JMenu("Thoát");

//      Tạo các JMenuItem và thêm chúng vào JMenu
        JMenuItem itemBenhNhan = new JMenuItem("Quản lý bệnh nhân");
        JMenuItem itemBacSi = new JMenuItem("Quản lý bác sĩ");
        jMenuQuanLy.add(itemBacSi);
        jMenuQuanLy.add(itemBenhNhan);

//        xét màu đậm cho menu
//        Font boldFont = new Font("Arial", Font.BOLD, 12);
//        itemBenhNhan.setFont(boldFont);
        menuBar.add(jMenuTrangChu);
        menuBar.add(jMenuDangKy);
        menuBar.add(jMenuDangNhap);
        menuBar.add(jMenuGioiThieu);
        menuBar.add(jMenuQuanLy);
        menuBar.add(jMenuDatLich);
        menuBar.add(jMenuThoat);
        int with = 14;
        int height = 14;

//      icon trang chủ
        String imgTrangChu = "views/icons/Home-icon.png";
        ClassLoader clTrangChu = getClass().getClassLoader();
        java.net.URL imageURLTrangChu = clTrangChu.getResource(imgTrangChu);
        ImageIcon iconTrangChu = new ImageIcon(imageURLTrangChu);
        jMenuTrangChu.setIcon(iconTrangChu);
        jMenuTrangChu.setIcon(new ImageIcon(iconTrangChu.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//      icon đăng ký
        String imgDangKy = "views/icons/regiter-icon.png";
        ClassLoader clDangKy = getClass().getClassLoader();
        java.net.URL imageURLDangKy = clDangKy.getResource(imgDangKy);
        ImageIcon iconDangKy = new ImageIcon(imageURLDangKy);
        jMenuDangKy.setIcon(iconDangKy);
        jMenuDangKy.setIcon(new ImageIcon(iconDangKy.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//      icon đăng nhập
        String imgDangNhap = "views/icons/login-icon.png";
        ClassLoader clDangNhap = getClass().getClassLoader();
        java.net.URL imageURLDangNhap = clDangNhap.getResource(imgDangNhap);
        ImageIcon iconDangNhap = new ImageIcon(imageURLDangNhap);
        jMenuDangNhap.setIcon(iconDangNhap);
        jMenuDangNhap.setIcon(new ImageIcon(iconDangNhap.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//      icon giới thiệu
        String imgGioiThieu = "views/icons/About-me-icon.png";
        ClassLoader clGioiThieu = getClass().getClassLoader();
        java.net.URL imageURLGioiThieu = clGioiThieu.getResource(imgGioiThieu);
        ImageIcon iconGioiThieu = new ImageIcon(imageURLGioiThieu);
        jMenuGioiThieu.setIcon(iconGioiThieu);
        jMenuGioiThieu.setIcon(new ImageIcon(iconGioiThieu.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//      icon quản lý
        String imgQuanLy = "views/icons/Logos-Device-Manager-icon.png";
        ClassLoader clQuanLy = getClass().getClassLoader();
        java.net.URL imageURLQuanLy = clQuanLy.getResource(imgQuanLy);
        ImageIcon iconQuanLy = new ImageIcon(imageURLQuanLy);
        jMenuQuanLy.setIcon(iconQuanLy);
        jMenuQuanLy.setIcon(new ImageIcon(iconQuanLy.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//        icon quản lý bệnh nhân
        String imgQuanLyBenhNhan = "views/icons/patient-icon.png";
        ClassLoader clQuanLyBenhNhan = getClass().getClassLoader();
        java.net.URL imageURLQuanLyBenhNhan = clQuanLyBenhNhan.getResource(imgQuanLyBenhNhan);
        ImageIcon iconQuanLyBenhNhan = new ImageIcon(imageURLQuanLyBenhNhan);
        itemBenhNhan.setIcon(iconQuanLyBenhNhan);
        itemBenhNhan.setIcon(new ImageIcon(iconQuanLyBenhNhan.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//        icon quản lý bác sĩ
        String imgQuanLyBacSi = "views/icons/People-Doctor-Male-icon.png";
        ClassLoader clQuanLyBacSi = getClass().getClassLoader();
        java.net.URL imageURLQuanLyBacSi = clQuanLyBacSi.getResource(imgQuanLyBacSi);
        ImageIcon iconQuanLyBacSi = new ImageIcon(imageURLQuanLyBacSi);
        itemBacSi.setIcon(iconQuanLyBenhNhan);
        itemBacSi.setIcon(new ImageIcon(iconQuanLyBacSi.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//      icon đặt lịch
        String imgDatLich = "views/icons/Apps-preferences-system-time-icon.png";
        ClassLoader clDatLich = getClass().getClassLoader();
        java.net.URL imageURLDatLich = clDatLich.getResource(imgDatLich);
        ImageIcon iconDatLich = new ImageIcon(imageURLDatLich);
        jMenuDatLich.setIcon(iconDatLich);
        jMenuDatLich.setIcon(new ImageIcon(iconDatLich.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//       icon thoát
        String imgThoat = "views/icons/Exit-icon.png";
        ClassLoader clThoat = getClass().getClassLoader();
        java.net.URL imageURLThoat = clThoat.getResource(imgThoat);
        ImageIcon iconThoat = new ImageIcon(imageURLThoat);
        jMenuThoat.setIcon(iconThoat);
        jMenuThoat.setIcon(new ImageIcon(iconThoat.getImage().getScaledInstance(with, height, Image.SCALE_DEFAULT)));

//        Chuyển form đổi mật khẩu sang quản lý bác sĩ
        itemBacSi.addActionListener((ActionEvent e) -> {
//                đóng form hiện tại
            dispose();
//                Tạo form mới
            QuanLyBacSi bacSi = new QuanLyBacSi();
//                Hiển thị form mới
            bacSi.setVisible(true);
        });

//        chuyển form đổi mật khẩu sang form quản lý bệnh nhân
        itemBenhNhan.addActionListener((ActionEvent e) -> {
//                đóng form hiện tại
            dispose();
//                Tạo form mới
            QuanLyBenhNhan benhNhan = new QuanLyBenhNhan();
//                Hiển thị form mới
            benhNhan.setVisible(true);
        });

//        chuyển form đổi mật khẩu sang đặt lịch
        jMenuDatLich.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
//                đóng form hiện tại
                dispose();
//                Tạo form mới
                QuanLyDatLich datLich = new QuanLyDatLich();
//                Hiển thị form mới
                datLich.setVisible(true);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });

//        chuyển form đổi mật khẩu sang đăng ký
        jMenuDangKy.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
//                đóng form hiện tại
                dispose();
//                Tạo form mới
                DangKy dangKy = new DangKy();

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

//        chuyển form đổi mật khẩu sang form trang chủ
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

//        chuyển form đổi mật khẩu sang form giới thiệu
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

        //        chuyển form đổi mật khẩu sang form đăng nhập
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

        jCheckBox8 = new javax.swing.JCheckBox();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        txtTenDangNhap7 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        cbbNganHang7 = new javax.swing.JComboBox<>();
        jLabel132 = new javax.swing.JLabel();
        lblMaGiaoDich49 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        btnThanhToan7 = new javax.swing.JButton();
        jLabel134 = new javax.swing.JLabel();
        lblMaGiaoDich50 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        txtSoTaiKhoan7 = new javax.swing.JTextField();
        lblMaGiaoDich51 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        txtTenTaiKhoan7 = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        lblMaGiaoDich44 = new javax.swing.JLabel();
        lblMaGiaoDich48 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        lblMaGiaoDich47 = new javax.swing.JLabel();
        lblMaGiaoDich42 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        lblMaGiaoDich43 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        lblMaGiaoDich46 = new javax.swing.JLabel();
        lblMaGiaoDich45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jCheckBox8.setText("Đồng ý điều khoản về giao dịch !");

        jLabel129.setText("Tên đăng nhập");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel130.setText("Thanh toán bằng thẻ ngân hàng");

        jLabel131.setBackground(new java.awt.Color(0, 102, 102));
        jLabel131.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Thẻ tín dụng / ghi nợ");
        jLabel131.setOpaque(true);

        cbbNganHang7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbbNganHang7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agribank", "BIDV", "VietinBank", "Vietcombank", "VPBank", "MBbank", "Techcombank", "Sacombank", "TPBank", "MaiBank" }));
        cbbNganHang7.setToolTipText("Chọn ngân hàng"); // NOI18N

        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setIcon(new javax.swing.ImageIcon("E:\\EAUT\\HK5\\java\\project\\java-swing-hospital-management\\src\\views\\icons\\Mastercard-icon.png")); // NOI18N

        lblMaGiaoDich49.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich49.setOpaque(true);

        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Visa-icon.png"))); // NOI18N

        btnThanhToan7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThanhToan7.setText("Thanh Toán");
        btnThanhToan7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToan7btnThanhToanActionPerformed(evt);
            }
        });

        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icons/Paypal-icon.png"))); // NOI18N

        lblMaGiaoDich50.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich50.setOpaque(true);

        jLabel135.setText("Số tài khoản");

        jLabel136.setText("Ngày thanh toán");

        lblMaGiaoDich51.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich51.setOpaque(true);

        jLabel137.setText("Tên tài khoản");

        jLabel138.setText("Tổng số tiền thanh toán");

        jLabel139.setText("Mã giao dịch");

        jLabel140.setText("Chọn ngân hàng");

        lblMaGiaoDich44.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich44.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich44.setOpaque(true);

        lblMaGiaoDich48.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich48.setText("Nguyễn Thế Mạnh");
        lblMaGiaoDich48.setOpaque(true);

        jLabel124.setText("Chủ tài khoản");

        jLabel123.setText("Tổng số tiền thanh toán");

        jLabel127.setText("Nội dung chuyển khoản: tên tài khoản + mã giao dịch");

        lblMaGiaoDich47.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich47.setOpaque(true);

        lblMaGiaoDich42.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich42.setText("MBBank");
        lblMaGiaoDich42.setOpaque(true);

        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/Ecommerce-Qr-Code-icon (1).png"))); // NOI18N

        jLabel121.setText("Hotline hỗ trợ khách hàng: 0987739823");

        jLabel122.setText("Số tài khoản");

        jLabel120.setText("Ngày thanh toán");

        jLabel128.setText("Mã giao dịch");

        lblMaGiaoDich43.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich43.setOpaque(true);

        jLabel126.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel126.setText("Thanh toán chuyển khoản / quét mã QR");

        jLabel119.setText("Ngân hàng");

        jLabel125.setText("Ví momo");

        lblMaGiaoDich46.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich46.setText("0987739823");
        lblMaGiaoDich46.setOpaque(true);

        lblMaGiaoDich45.setBackground(new java.awt.Color(255, 255, 255));
        lblMaGiaoDich45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaGiaoDich45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaGiaoDich45.setText("029986666868");
        lblMaGiaoDich45.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoTaiKhoan7)
                    .addComponent(txtTenTaiKhoan7)
                    .addComponent(txtTenDangNhap7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbbNganHang7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMaGiaoDich49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaGiaoDich50, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaGiaoDich51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel132)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel133)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel134))
                            .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(btnThanhToan7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblMaGiaoDich45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaGiaoDich42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaGiaoDich48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMaGiaoDich46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMaGiaoDich47, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel127)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblMaGiaoDich44, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaGiaoDich43, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel130)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel133, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel140)
                            .addComponent(jLabel139))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaGiaoDich49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbNganHang7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel135)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoTaiKhoan7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel137))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel124)
                            .addComponent(lblMaGiaoDich48, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel119)
                            .addComponent(lblMaGiaoDich42, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel122)
                            .addComponent(lblMaGiaoDich45, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel125)
                            .addComponent(lblMaGiaoDich46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel128)
                            .addComponent(lblMaGiaoDich47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(jLabel120))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaGiaoDich44, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaGiaoDich43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTenTaiKhoan7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenDangNhap7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel136)
                            .addComponent(jLabel138))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaGiaoDich50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaGiaoDich51, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThanhToan7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThanhToan7btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToan7btnThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThanhToan7btnThanhToanActionPerformed

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
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan7;
    private javax.swing.JComboBox<String> cbbNganHang7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel lblMaGiaoDich42;
    private javax.swing.JLabel lblMaGiaoDich43;
    private javax.swing.JLabel lblMaGiaoDich44;
    private javax.swing.JLabel lblMaGiaoDich45;
    private javax.swing.JLabel lblMaGiaoDich46;
    private javax.swing.JLabel lblMaGiaoDich47;
    private javax.swing.JLabel lblMaGiaoDich48;
    private javax.swing.JLabel lblMaGiaoDich49;
    private javax.swing.JLabel lblMaGiaoDich50;
    private javax.swing.JLabel lblMaGiaoDich51;
    private javax.swing.JTextField txtSoTaiKhoan7;
    private javax.swing.JTextField txtTenDangNhap7;
    private javax.swing.JTextField txtTenTaiKhoan7;
    // End of variables declaration//GEN-END:variables
}
