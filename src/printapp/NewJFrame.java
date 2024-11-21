package printapp;

import Model.User;
import java.awt.Desktop;

import java.io.File;
import java.io.IOException;

import java.net.URI;

import java.net.http.HttpClient;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;


import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewJFrame extends javax.swing.JFrame {

    ArrayList<User> userList = new ArrayList<>();

    public NewJFrame() {
        userList = new DAO.ConnectionSQL().getListUser();
        initComponents();
        txtKetNoi.setVisible(false);
        btnX.setVisible(false);
        txtKetNoi2.setVisible(false);
        btnX2.setVisible(false);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtFilePath = new javax.swing.JTextField();
        txtFolderPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnChooseFolderPath = new javax.swing.JButton();
        btnChooseFilePath = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnPrintWord = new javax.swing.JButton();
        btnPrintPDF = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        txtPass2 = new javax.swing.JPasswordField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        txtKetNoi = new javax.swing.JTextField();
        btnX = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSOF = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        txtKetNoi2 = new javax.swing.JTextField();
        btnX2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuKichHoat = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtFilePath.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtFolderPath.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên đăng nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mật khẩu");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã bí mật");

        btnChooseFolderPath.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChooseFolderPath.setText("...");
        btnChooseFolderPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFolderPathActionPerformed(evt);
            }
        });

        btnChooseFilePath.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnChooseFilePath.setText("...");
        btnChooseFilePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFilePathActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Chọn danh sách số HD");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Chọn thư  mục lưu tệp tin PDF");

        btnPrintWord.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrintWord.setText("IN CHỨNG TỪ");
        btnPrintWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintWordActionPerformed(evt);
            }
        });

        btnPrintPDF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPrintPDF.setText("TẢI VỀ PDFs");
        btnPrintPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintPDFActionPerformed(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPass2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setText("Số bản in");

        txtKetNoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKetNoi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKetNoi.setText("Kiểm tra kết nối...");

        btnX.setText("X");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername)
                            .addComponent(txtPass)
                            .addComponent(txtPass2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFilePath)
                            .addComponent(txtFolderPath))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnChooseFolderPath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChooseFilePath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrintPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(btnPrintWord, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(txtKetNoi, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnX, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFilePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFolderPath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChooseFolderPath, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrintWord, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrintPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKetNoi)
                    .addComponent(btnX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tải minh chứng", jPanel1);

        jLabel13.setText("Nhập danh sách SOF");

        btnClose.setText("Close");

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        txtSOF.setColumns(20);
        txtSOF.setRows(5);
        jScrollPane1.setViewportView(txtSOF);

        txtKetNoi2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKetNoi2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtKetNoi2.setText("Kiểm tra kết nối...");

        btnX2.setText("X");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(txtKetNoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                    .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtKetNoi2)
                        .addComponent(btnX2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOpen, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel13)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mở SOF", jPanel2);

        jMenu1.setText("Chức năng");

        menuKichHoat.setText("Kích hoạt");
        menuKichHoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKichHoatActionPerformed(evt);
            }
        });
        jMenu1.add(menuKichHoat);

        menuExit.setText("Thoát");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuExit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////// sub menu kích hoạt
    private void menuKichHoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKichHoatActionPerformed
        new kichHoatForm().setVisible(true);
    }//GEN-LAST:event_menuKichHoatActionPerformed
//////////////////////// sub menu exit
    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int result = JOptionPane.showConfirmDialog(rootPane, "Do you want to Exit ?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

////////////////////////// btnChooseFilePath
    private void btnChooseFilePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFilePathActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            txtFilePath.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_btnChooseFilePathActionPerformed

//////////////////////////// btnChooseFolderPath
    private void btnChooseFolderPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFolderPathActionPerformed
        JFileChooser folderChooser = new JFileChooser();
        folderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnValue = folderChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = folderChooser.getSelectedFile();
            txtFolderPath.setText(selectedFolder.getAbsolutePath());
        }
    }//GEN-LAST:event_btnChooseFolderPathActionPerformed
/////////////// Tải về PDFs
    private void btnPrintPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintPDFActionPerformed
        String filePath = txtFilePath.getText();
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên đăng nhập");
        } else if (txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mật khẩu");
        } else if (txtPass2.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã bí mật");
        } else {
            openPDF(filePath);
        }
    }//GEN-LAST:event_btnPrintPDFActionPerformed
/////////// in chứng tử
    private void btnPrintWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintWordActionPerformed

        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên đăng nhập");
        } else if (txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mật khẩu");
        } else if (txtPass2.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã bí mật");
        } else {
            checkUser();
            
        }


    }//GEN-LAST:event_btnPrintWordActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        if (txtSOF.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Chưa nhập số SOF");
        } else {
            // Khi nút bấm, hiển thị JLabel và bắt đầu công việc
            txtKetNoi2.setVisible(true);
            btnX2.setVisible(true);
            new Thread(new Task()).start(); // Chạy tác vụ trong background
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // URL của website của bạn
            String url = "https://howkteam.vn/";
            // Gọi hàm getData để tải nội dung HTML
            String html = getData(url);
            // Gọi hàm testData để lưu và mở nội dung HTML
            testData(html);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//////////////////////// set time

    private class Task implements Runnable {

        @Override
        public void run() {
            try {
                // Giả lập công việc lâu dài
                Thread.sleep(500); // 0.5 giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Ẩn thông báo đang tải khi công việc hoàn tất
            txtKetNoi.setVisible(false);
            btnX.setVisible(false);
            txtKetNoi2.setVisible(false);
            btnX2.setVisible(false);
            JOptionPane.showMessageDialog(null, "Chưa kích hoạt phần mềm!");
        }
    }

    ///////// đồng bộ uẻname và password từ app lên = chrom driver
    public void webLogin() {
        // Đường dẫn tới ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

        // Khởi tạo trình duyệt
        WebDriver driver = new ChromeDriver();

        try {
            // Lấy thông tin đăng nhập từ giao diện
            String username = txtUsername.getText();
            String password = txtPass.getText();

            // Mở trang đăng nhập
            driver.get("https://howkteam.vn/account/login?ReturnUrl=%2F");

            // Chờ phần tử xuất hiện (WebDriverWait)
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            // Nhập thông tin đăng nhập
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("btn-primary"))); // Thay bằng ID của nút

            usernameField.sendKeys(username); // Nhập tên đăng nhập
            passwordField.sendKeys(password); // Nhập mật khẩu
            loginButton.click(); // Nhấn nút đăng nhập

            // Đợi trang chuyển tiếp sau khi đăng nhập
            wait.until(ExpectedConditions.urlContains("https://howkteam.vn/"));  // URL sau khi đăng nhập
            System.out.println("Chuyển tới trang nhập mã bí mật thành công!");

            // Chuyển sang bước nhập mã bí mật
            webLogin2(driver);  // Gọi hàm webLogin2, truyền trình duyệt
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng trình duyệt
//        driver.quit();
        }
    }

    ////////weblogin model 2
    public void webLogin2(WebDriver driver) {
        String pass2 = txtPass2.getText();
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Tìm trường nhập mã bí mật
            WebElement secretCodeField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@class, 'input hidepassword')]"))); // Thay class thực tế nếu khác
            secretCodeField.sendKeys(pass2);  // Nhập mã bí mật (có thể thay bằng giá trị từ giao diện nếu cần)

            // Nhấn nút submit
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class, 'bgbutton')]"))); // Thay class thực tế nếu khác
            submitButton.click();

            // Kiểm tra xem đã đăng nhập thành công chưa
            wait.until(ExpectedConditions.urlContains("https://howkteam.vn/"));  // URL đích sau khi đăng nhập thành công
            System.out.println("Đăng nhập thành công, bạn đã vào trang chính!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng trình duyệt (nếu cần)
            // driver.quit();
        }
    }

///////////// open pdf file
    public void openPDF(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists() && filePath.endsWith(".pdf")) {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file); // Mở file bằng ứng dụng mặc định

            } else {
                JOptionPane.showMessageDialog(rootPane, "Đường dẫn không hợp lệ hoặc không phải file PDF.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
///////////////////// check user 

    public void checkUser() {
        String userName = txtUsername.getText();
        String password = txtPass.getText();
        String password2 = txtPass2.getText();
        boolean userFound = false;

        for (User user : userList) {
            if (userName.equals(user.getUserName()) && password.equals(user.getPassWord())) {
                if (!user.getStatus().equals("active")) {
                    JOptionPane.showMessageDialog(rootPane, "Key đã hết hạn! Vui lòng kích hoạt lại.");
                    return;
                }
                if(!password2.equals(user.getPassword2())){
                    JOptionPane.showMessageDialog(rootPane, "Mật khẩu cấp 2 không chính xác");
                    return;
                }
                JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công, chào mừng: " + userName);
                webLogin();
                userFound = true;
                break;
            }
        }
        if (!userFound) {
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập hoặc mật khẩu không chính xác.");
        }
    }

//  /////////////////////////////////  get data function
    public String getData(String url) throws IOException, InterruptedException {
        // Tạo HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Tạo request với User-Agent được chỉ định
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url)) // Đặt URL của website
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")
                //.header("Cookie", "__RequestVerificationToken=G0CgtApAHHy0Gbm5Buus2QL_T5vVEmUfl_R1n7dcC1wKlp2_7MpMAWVn9JDCe2iRlIDh_U9lSPVhims91T3SSxBIbGrVKe6Gasnisyu1e801; _ga=GA1.2.2044153117.1731995865; _gid=GA1.2.1293705263.1731995865; .AspNet.ApplicationCookie=B_YIUdUXCiCqmsDZSIUJzMA5tSwH4NCD6mX4MhYTraVhh2ixo4_t73xvoBPMJkA0BKhYcDIwrVWKxrTD0TBSu9VD8_VLU-o4JfejH69ekeiJHeoSl3cmfQAp4hjNQ7j_8HNAH87AIObwbCy7mx3Qvc2mIa6sSF8MA6m-IosukZ4zHcwyzonyKusd959jmqj3_ETjOT5WD1icssrsej9vCgVripspGAVYZGyUF5aigo_OdCx39Vz6PjUfv0KDcQs_3McRMZX1bsIu2g_CqyRragpBG1xLoM0-dGchu__634rN_kPb5m5mNJGRH7l-5Vl8zIdPjQwP0xFKFR75IStIS10xV3eyMYyqFW3kFB43BlQ1R_3vF6QhaxDwQrjO7UTsSs0I0TcRlySFH66zOb7zUZzD7yIQqg_bJOiZnGUrxizafAGxIHbP5XzZct2sKSzpoEzMXNazh-Nt81ppG2a6HHcRjzcPWMr0jCsA00APghBmjCVemBoOLxsY_uQC7jai; FCNEC=%5B%5B%22AKsRol914X_5-IzzYGZM3U68quESCmCB8WyqCvYbhMeOQCks81hmuR90-9v-hPqFxfNMPaCZeBf7LdfKxZUmgsc21h3W1ELub2Shtwit_q2Uaxi9hXzruj5MryXjYhn2GiJPcnMvi8m7bYVD8xiyvuhD33ZPcu4Dhw%3D%3D%22%5D%5D")
                .GET() // Phương thức GET
                .build();

        // Gửi request và nhận response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Kiểm tra HTTP status code
        if (response.statusCode() != 200) {
            throw new IOException("Failed to fetch data. HTTP Status Code: " + response.statusCode());
        }

        // Trả về nội dung HTML dưới dạng chuỗi
        return response.body();
    }

    public void testData(String html) throws IOException {

        Path filePath = Paths.get("F:\\Luu tru\\java\\laptrinhjava\\JSP Servlet\\PrintApp\\res.html");
        Files.write(filePath, html.getBytes());

        // Mở file HTML trong trình duyệt mặc định
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(filePath.toUri());
        } else {
            JOptionPane.showMessageDialog(null, "Không thể mở trình duyệt!");
        }
    }
////////////////////////////////////////////////////////

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFilePath;
    private javax.swing.JButton btnChooseFolderPath;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnPrintPDF;
    private javax.swing.JButton btnPrintWord;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnX2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuKichHoat;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtFolderPath;
    private javax.swing.JTextField txtKetNoi;
    private javax.swing.JTextField txtKetNoi2;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextArea txtSOF;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
