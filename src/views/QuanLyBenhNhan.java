/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author manht
 */
public class QuanLyBenhNhan extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public QuanLyBenhNhan() {
        initComponents();
        setTitle("Quản lý bệnh nhân");
        setIconImageJframe();
        setMenu();
        getContentPane().setBackground(Color.WHITE);
        jPanel10.setPreferredSize(new Dimension(130, 138));
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
        JMenu jMenuQuanLy = new JMenu("Quản lý");
        JMenu jMenuDatLich = new JMenu("Đặt lịch");
        JMenu jMenuThoat = new JMenu("Thoát");

//      Tạo các JMenuItem và thêm chúng vào JMenu
        JMenuItem itemBenhNhan = new JMenuItem("Quản lý bệnh nhân");
        JMenuItem itemBacSi = new JMenuItem("Quản lý bác sĩ");
        jMenuQuanLy.add(itemBacSi);
        jMenuQuanLy.add(itemBenhNhan);

//        xét màu đậm cho menu
        Font boldFont = new Font("Arial", Font.BOLD, 12);
        itemBenhNhan.setFont(boldFont);
        menuBar.add(jMenuTrangChu);
        menuBar.add(jMenuDangKy);
        menuBar.add(jMenuDangNhap);
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

//        Chuyển form quản lý bệnh nhân sang quản lý bác sĩ
        itemBacSi.addActionListener((var e) -> {
//                đóng form hiện tại
            dispose();
//                Tạo form mới
            QuanLyBacSi bacSi = new QuanLyBacSi();
//                Hiển thị form mới
            bacSi.setVisible(true);
        });

//        chuyển form quản lý bệnh nhân sang đặt lịch
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

//        chuyển form quản lý bệnh nhân khẩu sang đăng ký
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

//        chuyển form quản lý bệnh nhân sang form trang chủ
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

//        chuyển form bệnh nhân sang form đăng nhập
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtMaBenhNhan = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        radNu = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lblAnh = new javax.swing.JLabel();
        btnXoa5 = new javax.swing.JButton();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMaBenhNhan2 = new javax.swing.JLabel();
        txtTrieuChung = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMabenhNhan1 = new javax.swing.JTextField();
        txtMaBacSi = new javax.swing.JTextField();
        txtTienSuBenhAn = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtMaHoSo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtChuanDoan = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnTimTheoId = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnXoa4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnXoa7 = new javax.swing.JButton();
        btnXoa8 = new javax.swing.JButton();
        btnXoa9 = new javax.swing.JButton();
        btnTimTheoId1 = new javax.swing.JButton();
        radNam1 = new javax.swing.JRadioButton();
        radNu1 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        txtKetLuanKham = new javax.swing.JTextField();
        btnTimTheoId2 = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup2.add(radNu);
        radNu.setForeground(new java.awt.Color(0, 102, 102));
        radNu.setText("Nữ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Số điện thoại");

        buttonGroup2.add(radNam);
        radNam.setForeground(new java.awt.Color(0, 102, 102));
        radNam.setText("Nam");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Email");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Giới tính");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Địa chỉ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Thông tin bệnh nhân");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Họ và tên");

        lblAnh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/image-bacsi/3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAnh))
        );

        btnXoa5.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa5.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa5.setText("Tải ảnh");
        btnXoa5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa5jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Mã bệnh nhân");

        txtMaBenhNhan2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaBenhNhan2.setForeground(new java.awt.Color(0, 102, 102));
        txtMaBenhNhan2.setText("Mã bệnh nhân");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Thông tin hồ sơ bệnh án");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Tiền sử bệnh án");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Mã hồ sơ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Triệu chứng");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Mã bác sĩ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Danh sách thông tin bệnh nhân và bệnh án");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Chuẩn đoán");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Kết luận khám");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable1);

        btnTimTheoId.setBackground(new java.awt.Color(0, 102, 102));
        btnTimTheoId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimTheoId.setForeground(new java.awt.Color(255, 255, 255));
        btnTimTheoId.setText("Tìm kiếm theo mã");
        btnTimTheoId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimTheoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTheoIdActionPerformed(evt);
            }
        });

        btnXoa4.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa4.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa4.setText("Thêm");
        btnXoa4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa4jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Chức năng điều khiển");

        btnXoa7.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa7.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa7.setText("Xem");
        btnXoa7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa7jButton3ActionPerformed(evt);
            }
        });

        btnXoa8.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa8.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa8.setText("Sửa");
        btnXoa8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa8jButton3ActionPerformed(evt);
            }
        });

        btnXoa9.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa9.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa9.setText("Xóa");
        btnXoa9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa9jButton3ActionPerformed(evt);
            }
        });

        btnTimTheoId1.setBackground(new java.awt.Color(0, 102, 102));
        btnTimTheoId1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimTheoId1.setForeground(new java.awt.Color(255, 255, 255));
        btnTimTheoId1.setText("<html>hiển thị danh sách hồ sơ theo mã bệnh nhân</html>");
        btnTimTheoId1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimTheoId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTheoId1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radNam1);
        radNam1.setForeground(new java.awt.Color(0, 102, 102));
        radNam1.setText("bệnh nhân");

        buttonGroup1.add(radNu1);
        radNu1.setForeground(new java.awt.Color(0, 102, 102));
        radNu1.setText("Bệnh án");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setText("Tìm kiếm / xuất file");

        btnTimTheoId2.setBackground(new java.awt.Color(0, 102, 102));
        btnTimTheoId2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimTheoId2.setForeground(new java.awt.Color(255, 255, 255));
        btnTimTheoId2.setText("Xuất excel");
        btnTimTheoId2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimTheoId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTheoId2ActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 102, 102));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetjButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTienSuBenhAn, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMaBacSi, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaHoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMaBenhNhan2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMabenhNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTrieuChung, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKetLuanKham, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtChuanDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radNam)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(radNu))
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaBenhNhan)
                                            .addComponent(txtHoVaTen)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSoDienThoai))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnXoa5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnXoa4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radNam1))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radNu1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTimTheoId1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimTheoId, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimTheoId2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaBenhNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(radNam)
                            .addComponent(radNu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa5))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHoSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaBenhNhan2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMabenhNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radNam1)
                    .addComponent(radNu1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaBacSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTrieuChung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa4)
                        .addComponent(btnXoa7)
                        .addComponent(btnXoa8)
                        .addComponent(btnXoa9))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTienSuBenhAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuanDoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimTheoId1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txtKetLuanKham, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTimTheoId2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimTheoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoa5jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa5jButton3ActionPerformed
        // Tạo một đối tượng JFileChooser
        JFileChooser fileChooser = new JFileChooser();

        // Đặt bộ lọc để chỉ cho phép chọn các tệp hình ảnh
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Hình ảnh", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        // Hiển thị hộp thoại chọn tệp
        int result = fileChooser.showOpenDialog(this);

        // Kiểm tra xem người dùng đã chọn tệp hay chưa
        if (result == JFileChooser.APPROVE_OPTION) {
            // Lấy đường dẫn đến tệp hình ảnh được chọn
            File selectedFile = fileChooser.getSelectedFile();
            String imagePath = selectedFile.getAbsolutePath();

            // Hiển thị hình ảnh trên JLabel
            ImageIcon imageIcon = new ImageIcon(imagePath);
            lblAnh.setIcon(imageIcon);
        }
    }//GEN-LAST:event_btnXoa5jButton3ActionPerformed

    private void btnTimTheoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTheoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimTheoIdActionPerformed

    private void btnXoa4jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa4jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa4jButton3ActionPerformed

    private void btnXoa7jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa7jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa7jButton3ActionPerformed

    private void btnXoa8jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa8jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa8jButton3ActionPerformed

    private void btnXoa9jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa9jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa9jButton3ActionPerformed

    private void btnTimTheoId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTheoId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimTheoId1ActionPerformed

    private void btnTimTheoId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTheoId2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimTheoId2ActionPerformed

    private void btnResetjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetjButton3ActionPerformed
        txtMaBenhNhan.setText("");
        txtMabenhNhan1.setText("");
        txtMaHoSo.setText("");
        txtHoVaTen.setText("");
        txtSoDienThoai.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        txtMaBacSi.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        txtTrieuChung.setText("");
        txtChuanDoan.setText("");
        txtKetLuanKham.setText("");
        txtTienSuBenhAn.setText("");
        // xóa icon ảnh
        lblAnh.setIcon(null);
    }//GEN-LAST:event_btnResetjButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBenhNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new QuanLyBenhNhan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTimTheoId;
    private javax.swing.JButton btnTimTheoId1;
    private javax.swing.JButton btnTimTheoId2;
    private javax.swing.JButton btnXoa4;
    private javax.swing.JButton btnXoa5;
    private javax.swing.JButton btnXoa7;
    private javax.swing.JButton btnXoa8;
    private javax.swing.JButton btnXoa9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNam1;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JRadioButton radNu1;
    private javax.swing.JTextField txtChuanDoan;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtKetLuanKham;
    private javax.swing.JTextField txtMaBacSi;
    private javax.swing.JTextField txtMaBenhNhan;
    private javax.swing.JLabel txtMaBenhNhan2;
    private javax.swing.JTextField txtMaHoSo;
    private javax.swing.JTextField txtMabenhNhan1;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTienSuBenhAn;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTrieuChung;
    // End of variables declaration//GEN-END:variables
}
