/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author manht
 */
public class QuanLyBacSi extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public QuanLyBacSi() {
        initComponents();
        setTitle("Quản lý bác sĩ");
        setIconImageJframe();
        setMenu();
        jPanel10.setBorder(new LineBorder(Color.WHITE, 1));
        getContentPane().setBackground(Color.WHITE);
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
        itemBacSi.setFont(boldFont);
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

//        chuyển form bác sĩ sang form quản lý bệnh nhân
        itemBenhNhan.addActionListener((ActionEvent e) -> {
//                đóng form hiện tại
            dispose();
//                Tạo form mới
            QuanLyBenhNhan benhNhan = new QuanLyBenhNhan();
//                Hiển thị form mới
            benhNhan.setVisible(true);
        });

//        chuyển form bác sĩ sang đặt lịch
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

//        chuyển form quản lý bác sĩ khẩu sang đăng ký
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

//        chuyển form quản lý bác sĩ sang form trang chủ
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

//        chuyển form bác sĩ sang form đăng nhập
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
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaBacSi = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        radNu = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        radNam = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnXoa4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnSua4 = new javax.swing.JButton();
        btnXoaTatCa4 = new javax.swing.JButton();
        btnThem4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnTimTheoId = new javax.swing.JButton();
        btnTimTatCa = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/image-bacsi/3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Học vấn");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Mã bác sĩ");

        radNu.setForeground(new java.awt.Color(0, 102, 102));
        radNu.setText("Nữ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Số điện thoại");

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
        jLabel5.setText("Thông tin bác sĩ");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Kinh nghiệm làm việc:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Họ và tên");

        btnXoa4.setBackground(new java.awt.Color(0, 102, 102));
        btnXoa4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa4.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa4.setText("Xóa");
        btnXoa4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa4jButton3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Chức năng điều khiển");

        btnSua4.setBackground(new java.awt.Color(0, 102, 102));
        btnSua4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua4.setForeground(new java.awt.Color(255, 255, 255));
        btnSua4.setText("Sửa");
        btnSua4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSua4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua4jButton2ActionPerformed(evt);
            }
        });

        btnXoaTatCa4.setBackground(new java.awt.Color(0, 102, 102));
        btnXoaTatCa4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoaTatCa4.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaTatCa4.setText("Xóa tất cả");
        btnXoaTatCa4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTatCa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTatCa4jButton4ActionPerformed(evt);
            }
        });

        btnThem4.setBackground(new java.awt.Color(0, 102, 102));
        btnThem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem4.setForeground(new java.awt.Color(255, 255, 255));
        btnThem4.setText("Thêm");
        btnThem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem4jButton1ActionPerformed(evt);
            }
        });

        jTable1.setForeground(new java.awt.Color(0, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Danh sách bác sĩ");

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

        btnTimTatCa.setBackground(new java.awt.Color(0, 102, 102));
        btnTimTatCa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimTatCa.setForeground(new java.awt.Color(255, 255, 255));
        btnTimTatCa.setText("Tìm kiếm tất cả");
        btnTimTatCa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimTatCa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimTatCaActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                                .addComponent(jTextField9)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField12)
                                                .addComponent(jTextField13)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMaBacSi)
                                                .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaTatCa4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnThem4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTimTheoId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTimTatCa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaBacSi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(radNam)
                                    .addComponent(radNu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimTheoId)
                            .addComponent(btnTimTatCa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaTatCa4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem4jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem4jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThem4jButton1ActionPerformed

    private void btnXoaTatCa4jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTatCa4jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaTatCa4jButton4ActionPerformed

    private void btnSua4jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua4jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua4jButton2ActionPerformed

    private void btnXoa4jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa4jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoa4jButton3ActionPerformed

    private void btnTimTheoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTheoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimTheoIdActionPerformed

    private void btnTimTatCaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimTatCaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimTatCaActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyBacSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyBacSi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua4;
    private javax.swing.JButton btnThem4;
    private javax.swing.JButton btnTimTatCa;
    private javax.swing.JButton btnTimTheoId;
    private javax.swing.JButton btnXoa4;
    private javax.swing.JButton btnXoaTatCa4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtMaBacSi;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
