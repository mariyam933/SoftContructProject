
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * The `SignUpFrame` class represents a GUI frame for user registration.
 * Users can sign up by providing their name, password, gender, phone number, and address.
 */

public class SignUpFrame extends javax.swing.JFrame {

    /**
     * Creates a new instance of the `SignUpFrame`.
     */
    public SignUpFrame() {
        initComponents();
        ImageIcon background_img = new ImageIcon(
                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\SignUp Frame.png", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1100, 820, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1100, 820);
        this.add(backgrnd);
        this.setTitle("Sign Up");
        this.setResizable(false);
        panel1.setOpaque(true);
        panel1.setBackground(new Color(0, 0, 0, 90));
        buttonGroup1.add(Male);
        buttonGroup1.add(Female);
        signUpBtn.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    /**
     * Initializes the components of the frame, sets up the UI, and handles various user actions.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addField = new javax.swing.JTextField();
        pssField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        Female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        signUpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        panel1.setPreferredSize(new java.awt.Dimension(466, 685));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Your Name:");

        nameField.setBackground(new java.awt.Color(204, 204, 204));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gender:");

        jLabel3.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number:");

        phoneField.setBackground(new java.awt.Color(204, 204, 204));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Your Address:");

        addField.setBackground(new java.awt.Color(204, 204, 204));
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });

        pssField.setBackground(new java.awt.Color(204, 204, 204));
        pssField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pssFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Hubballi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Your Password:");

        Female.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");

        Male.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");

        signUpBtn.setBackground(new java.awt.Color(255, 102, 102));
        signUpBtn.setFont(new java.awt.Font("Hoefler Text", 1, 24)); // NOI18N
        signUpBtn.setText("Sign Up");
        signUpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        signUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
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
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                panel1Layout.createSequentialGroup()
                                                                        .addComponent(Female)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(Male))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                panel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(pssField,
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.Alignment.LEADING))
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
                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(111, 111, 111))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                panel1Layout.createSequentialGroup()
                                                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
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
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(pssField, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(addField, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Female)
                                        .addComponent(Male))
                                .addGap(35, 35, 35)
                                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(62, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(326, Short.MAX_VALUE)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(308, 308, 308)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(80, Short.MAX_VALUE)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action when the user enters a name.
     *
     * @param evt The ActionEvent representing the text field action.
     */

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
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
     * Handles the action when the user enters a password.
     *
     * @param evt The ActionEvent representing the text field action.
     */
    private void pssFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_pssFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_pssFieldActionPerformed

    /**
     * Handles the action when the user presses the "Sign Up" button.
     * Validates user input and writes user information to a file.
     *
     * @param evt The ActionEvent representing the button click.
     */
    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_signUpBtnActionPerformed
        if (nameField.getText().length() != 0 && pssField.getText().length() != 0 && addField.getText().length() != 0
                && phoneField.getText().length() != 0) {
            if (!Female.isSelected() && !Male.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please select gender option!", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                String data = "";
                try {
                    File myObj = new File(
                            "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SuperMarketManagementSystem\\src\\ID_Counter.txt");
                    Scanner myReader = new Scanner(myObj);

                    while (myReader.hasNextLine()) {
                        data = myReader.nextLine();
                    }
                    try {
                        FileWriter myWriter = new FileWriter(
                                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SuperMarketManagementSystem\\src\\"
                                        + data + ".txt");
                        String info = "";
                        if (Male.isSelected()) {
                            info = data + "," + nameField.getText() + "," + pssField.getText() + ","
                                    + addField.getText() + "," + phoneField.getText() + "," + "Male";

                        } else {
                            info = data + "," + nameField.getText() + "," + pssField.getText() + ","
                                    + addField.getText() + "," + phoneField.getText() + "," + "Female";

                        }
                        myWriter.write(info);
                        myWriter.close();
                        JOptionPane.showMessageDialog(this, "User Successfully Registered!\nYour Login ID is: " + data,
                                "ALERT", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Application ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);

                    }
                    myReader.close();

                } catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(this, "Application ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                int ID = Integer.parseInt(data);
                ID++;
                try {
                    FileWriter myWriter = new FileWriter(
                            "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SuperMarketManagementSystem\\src\\ID_Counter.txt");
                    myWriter.write("" + ID);
                    myWriter.close();
                    this.setVisible(false);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Application ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            }
        } else {

            JOptionPane.showMessageDialog(this, "Input field can not be empty!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_signUpBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField addField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPasswordField pssField;
    private javax.swing.JButton signUpBtn;
    // End of variables declaration//GEN-END:variables
}
