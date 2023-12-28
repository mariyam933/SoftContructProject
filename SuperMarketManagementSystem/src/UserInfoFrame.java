
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The `UserInfoFrame` class represents a GUI frame for displaying user information.
 * It shows details such as name, gender, phone number, and address of a customer.
 */

public class UserInfoFrame extends javax.swing.JFrame {

        // Reference to the customer object associated with this frame
    customer cs = null;

    /**
     * Creates a new instance of the `UserInfoFrame`.
     *
     * @param cs The `customer` object for which information is displayed.
     */
    public UserInfoFrame(customer cs) {
        this.cs = cs;
        initComponents();
        ImageIcon background_img = new ImageIcon(
                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\UserInfo.jpeg", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1100, 820, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1100, 820);
        this.add(backgrnd);
        this.setTitle("User Information");
        this.setResizable(false);
        // panel1.setOpaque(true);
        panel1.setBackground(new Color(160, 160, 0, 55));
        backBtn.setOpaque(true);
        jLabel1.setOpaque(true);
        jLabel2.setOpaque(true);
        jLabel3.setOpaque(true);
        jLabel4.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        nameField.setText(cs.getName());
        phoneField.setText(cs.getPhoneNumber());
        addField.setText(cs.getAddress());
        genderField.setText(cs.getGender());
        this.setLocationRelativeTo(null);

    }

    /**
     * Initializes the components of the frame, sets up the UI, and handles various user actions.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        genderField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        panel1.setPreferredSize(new java.awt.Dimension(466, 685));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("InaiMathi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Your Name:");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(204, 204, 204));
        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("InaiMathi", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gender:");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("InaiMathi", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Phone Number:");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        phoneField.setEditable(false);
        phoneField.setBackground(new java.awt.Color(204, 204, 204));
        phoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("InaiMathi", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Your Address:");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 102), 2, true));

        addField.setEditable(false);
        addField.setBackground(new java.awt.Color(204, 204, 204));
        addField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 102, 102));
        backBtn.setFont(new java.awt.Font("Hoefler Text", 1, 24)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        genderField.setEditable(false);
        genderField.setBackground(new java.awt.Color(204, 204, 204));
        genderField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        genderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap(133, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout
                                                .createSequentialGroup()
                                                .addGroup(panel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(addField, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                216, Short.MAX_VALUE)
                                                        .addComponent(jLabel4,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                216, Short.MAX_VALUE)
                                                        .addComponent(jLabel3,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nameField)
                                                        .addComponent(jLabel1,
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(genderField, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                216, Short.MAX_VALUE))
                                                .addGap(111, 111, 111))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                panel1Layout.createSequentialGroup()
                                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(134, 134, 134)))));
        panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(541, Short.MAX_VALUE)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(74, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action when the user enters a name.
     *
     * @param evt The ActionEvent representing the text field action.
     */
    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameFieldActionPerformed

    }// GEN-LAST:event_nameFieldActionPerformed

    /**
     * Handles the action when the user enters a phone number.
     *
     * @param evt The ActionEvent representing the text field action.
     */
    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_phoneFieldActionPerformed

    /**
     * Handles the action when the user enters an address.
     *
     * @param evt The ActionEvent representing the text field action.
     */
    private void addFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_addFieldActionPerformed

    /**
     * Handles the action when the user clicks the "Back" button.
     *
     * @param evt The ActionEvent representing the button click.
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
        this.setVisible(false);
    }// GEN-LAST:event_backBtnActionPerformed

    /**
     * Handles the action when the user enters a gender.
     *
     * @param evt The ActionEvent representing the text field action.
     */
    private void genderFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_genderFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_genderFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField phoneField;
    // End of variables declaration//GEN-END:variables
}
