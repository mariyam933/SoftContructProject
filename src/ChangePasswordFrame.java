
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class ChangePasswordFrame extends javax.swing.JFrame {

    Customer cs = null;

    /**
     * Creates new form ChangePasswordFrame
     */
    public ChangePasswordFrame(Customer obj) {
        cs = obj;
        initComponents();
        ImageIcon background_img = new ImageIcon("C:/Users/MINAHIL SHAKOOR/Downloads/Grocery_Management_System_Java/SMMS_Images/SMMS_Images/Changepss.png", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1300, 750, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1300, 750);
        this.add(backgrnd);
        this.setTitle("Change Password");
        this.setResizable(false);
        backBtn.setOpaque(true);
        changeBtn.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setLocation(0, 0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oldPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        newPassField = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        oldPassField = new javax.swing.JPasswordField();
        changeBtn = new javax.swing.JButton();
        changePasswordLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oldPasswordLabel.setFont(new java.awt.Font("Hubballi", 1, 14)); // NOI18N
        oldPasswordLabel.setText("Enter Old Password:");

        newPasswordLabel.setFont(new java.awt.Font("Hubballi", 1, 14)); // NOI18N
        newPasswordLabel.setText("Enter New Password:");

        newPassField.setBackground(new java.awt.Color(204, 204, 204));
        newPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassFieldActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 128, 112));
        backBtn.setFont(new java.awt.Font("Hoefler Text", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        oldPassField.setBackground(new java.awt.Color(204, 204, 204));
        oldPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldPassFieldActionPerformed(evt);
            }
        });

        changeBtn.setBackground(new java.awt.Color(255, 128, 112));
        changeBtn.setFont(new java.awt.Font("Hoefler Text", 1, 14)); // NOI18N
        changeBtn.setText("Change Password");
        changeBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        changeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        changePasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        changePasswordLabel.setText("Change Password");
        changePasswordLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(813, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePasswordLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(newPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(oldPassField)
                        .addComponent(oldPasswordLabel)
                        .addComponent(changeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(changePasswordLabel)
                .addGap(28, 28, 28)
                .addComponent(oldPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(changeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
    }// GEN-LAST:event_backBtnActionPerformed

    private void newPassFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newPassFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_newPassFieldActionPerformed

    private void oldPassFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_oldPassFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_oldPassFieldActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_changeBtnActionPerformed
        if (oldPassField.getText().length() != 0 && newPassField.getText().length() != 0) {
            if (oldPassField.getText().equals(cs.getPassword())) {
                cs.setPassword(newPassField.getText());
                JOptionPane.showMessageDialog(this, "Password Changed successfully! ", "Alert",
                        JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(this, "Wrong Old Password!\n Try Again! ", "ERROR",
                        JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "New or Old password can not be empty! ", "ERROR",
                    JOptionPane.ERROR_MESSAGE);

        }
    }// GEN-LAST:event_changeBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton changeBtn;
    private javax.swing.JLabel changePasswordLabel;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JLabel oldPasswordLabel;
    // End of variables declaration//GEN-END:variables
}
