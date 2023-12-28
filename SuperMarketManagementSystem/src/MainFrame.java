
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * The MainFrame class represents the main graphical user interface (GUI) frame for the Grocery Management System application.
 * It displays the welcome message and provides options to log in or sign up.
 */

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates a new instance of the MainFrame.
     */
    public MainFrame() {
        initComponents();

        // Set background image for the frame
        ImageIcon background_img = new ImageIcon(
                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\MainFrame.png", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1230, 755, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1230, 755);
        this.add(backgrnd);

        // Set frame properties
        this.setTitle("Grab & Go");
        this.setResizable(false);
        loginBtn.setOpaque(true);
        signUpBtn.setOpaque(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arima Madurai", 1, 38)); // NOI18N
        jLabel2.setText("Welcome to ");

        jLabel3.setFont(new java.awt.Font("Arima Madurai", 1, 42)); // NOI18N
        jLabel3.setText("Grab & Go SuperMarket");

        loginBtn.setBackground(new java.awt.Color(255, 102, 102));
        loginBtn.setFont(new java.awt.Font("Hoefler Text", 1, 30)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signUpBtn.setBackground(new java.awt.Color(255, 102, 102));
        signUpBtn.setFont(new java.awt.Font("Hoefler Text", 1, 30)); // NOI18N
        signUpBtn.setText("Sign Up");
        signUpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(697, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(74, 74, 74))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(186, 186, 186))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(178, 178, 178)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(109, 109, 109)
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(201, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Action performed when the "Login" button is clicked.
     * It creates and displays a new LoginFrame.
     *
     * @param evt The action event that occurred (button click).
     */
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginBtnActionPerformed
        LoginFrame object = new LoginFrame();
        object.setVisible(true);
    }// GEN-LAST:event_loginBtnActionPerformed

    /**
     * Action performed when the "Sign Up" button is clicked.
     * It creates and displays a new SignUpFrame.
     *
     * @param evt The action event that occurred (button click).
     */
    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signUpBtnActionPerformed
        SignUpFrame object = new SignUpFrame();
        object.setVisible(true);
    }// GEN-LAST:event_signUpBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
