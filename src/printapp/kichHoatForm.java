package printapp;

import java.awt.Desktop;
import java.net.URI;

public class kichHoatForm extends javax.swing.JFrame {

    public kichHoatForm() {
        initComponents();
        setSize(400, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        jLabel8.setText("<html>>> Nhấn <a href='https://www.example.com' style='color:blue;'>[Kích hoạt]</a> để được dùng ngay phần mềm.</html>");
        jLabel9.setText("<html>>> Để được kích hoạt bản quyền, hãy gửi mã đăng ký của bạn tới email <a href='mailto:exlab247@gmail.com' style='color:blue;'>exlab247@gmail.com</a> theo mẫu dưới.</html>");
        jLabel1.setText("<html><br>**********<br><br></html>");
        jLabel2.setText("<html><b>[ Mẫu email ]</b><br>Email nhận: <a href='mailto:exlab247@gmail.com' style='color:blue;'>exlab247@gmail.com</a><br>Tiêu đề: Đăng ký kích hoạt bản quyền Auto Print Tool<br>Nội dung: Mã đăng ký BFEFBFF000906A3-1091757000</html>");
        jLabel3.setText("<html><br></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnViewInfo = new javax.swing.JButton();
        btnKich = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("jLabel8");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setText("jLabel9");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        btnViewInfo.setForeground(new java.awt.Color(51, 51, 255));
        btnViewInfo.setText("Xem thông tin");
        btnViewInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInfoActionPerformed(evt);
            }
        });

        btnKich.setForeground(new java.awt.Color(51, 51, 255));
        btnKich.setText("Kích hoạt");
        btnKich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKichActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnViewInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(btnKich, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewInfo)
                    .addComponent(btnKich)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       //
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btnViewInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInfoActionPerformed
       try {
            // Mở URL trong trình duyệt
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/atus.005"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnViewInfoActionPerformed

    private void btnKichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKichActionPerformed
        try {
            // Mở URL trong trình duyệt
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/atus.005"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnKichActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kichHoatForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKich;
    private javax.swing.JButton btnViewInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
