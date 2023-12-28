
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class CategoriesFrame extends javax.swing.JFrame {

    customer cs = null;
    ArrayList<Product> products;

    /**
     * Creates new form CategoriesFrame
     */
    public CategoriesFrame(customer cs, ArrayList<Product> products) {
        this.cs = cs;
        this.products = products;
        initComponents();
        ImageIcon background_img = new ImageIcon(
                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\CategoryPage.png", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1000, 820, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1000, 820);
        this.add(backgrnd);
        this.setTitle("Categories");
        this.setResizable(false);
        electronicsBtn.setOpaque(true);
        this.setLocationRelativeTo(null);

        kitchenBtn.setOpaque(true);
        dairyBtn.setOpaque(true);
        householdBtn.setOpaque(true);
        fruitandvBtn.setOpaque(true);
        cosmeticsBtn.setOpaque(true);
        backBtn2.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dairyBtn = new javax.swing.JButton();
        cosmeticsBtn = new javax.swing.JButton();
        electronicsBtn = new javax.swing.JButton();
        householdBtn = new javax.swing.JButton();
        kitchenBtn = new javax.swing.JButton();
        fruitandvBtn = new javax.swing.JButton();
        backBtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dairyBtn.setBackground(new java.awt.Color(255, 102, 102));
        dairyBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        dairyBtn.setText("Dairy");
        dairyBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        dairyBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dairyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dairyBtnActionPerformed(evt);
            }
        });

        cosmeticsBtn.setBackground(new java.awt.Color(255, 102, 102));
        cosmeticsBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        cosmeticsBtn.setText("Cosmetics");
        cosmeticsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        cosmeticsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cosmeticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosmeticsBtnActionPerformed(evt);
            }
        });

        electronicsBtn.setBackground(new java.awt.Color(255, 102, 102));
        electronicsBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        electronicsBtn.setText("Electronics");
        electronicsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        electronicsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        electronicsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electronicsBtnActionPerformed(evt);
            }
        });

        householdBtn.setBackground(new java.awt.Color(255, 102, 102));
        householdBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        householdBtn.setText("Households");
        householdBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        householdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        householdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                householdBtnActionPerformed(evt);
            }
        });

        kitchenBtn.setBackground(new java.awt.Color(255, 102, 102));
        kitchenBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        kitchenBtn.setText("Kitchen");
        kitchenBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        kitchenBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kitchenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitchenBtnActionPerformed(evt);
            }
        });

        fruitandvBtn.setBackground(new java.awt.Color(255, 102, 102));
        fruitandvBtn.setFont(new java.awt.Font("Hoefler Text", 1, 22)); // NOI18N
        fruitandvBtn.setText("Fruits and Vegetables");
        fruitandvBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        fruitandvBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fruitandvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fruitandvBtnActionPerformed(evt);
            }
        });

        backBtn2.setBackground(new java.awt.Color(255, 102, 102));
        backBtn2.setFont(new java.awt.Font("Hoefler Text", 1, 18)); // NOI18N
        backBtn2.setText("Back");
        backBtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        backBtn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(400, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fruitandvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dairyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(electronicsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cosmeticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kitchenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(householdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(383, 383, 383))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 115,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(electronicsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(dairyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(cosmeticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(kitchenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(householdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(fruitandvBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
    }// GEN-LAST:event_backBtn2ActionPerformed

    private void electronicsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_electronicsBtnActionPerformed
        CatProductsFrame pr = new CatProductsFrame(cs, products, "EL");
        pr.setVisible(true);
    }// GEN-LAST:event_electronicsBtnActionPerformed

    private void dairyBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dairyBtnActionPerformed
        // TODO add your handling code here:
        CatProductsFrame pr = new CatProductsFrame(cs, products, "Dairy");
        pr.setVisible(true);
    }// GEN-LAST:event_dairyBtnActionPerformed

    private void cosmeticsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cosmeticsBtnActionPerformed
        // TODO add your handling code here:
        CatProductsFrame pr = new CatProductsFrame(cs, products, "COS");
        pr.setVisible(true);
    }// GEN-LAST:event_cosmeticsBtnActionPerformed

    private void kitchenBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kitchenBtnActionPerformed
        // TODO add your handling code here:
        CatProductsFrame pr = new CatProductsFrame(cs, products, "KA");
        pr.setVisible(true);
    }// GEN-LAST:event_kitchenBtnActionPerformed

    private void householdBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_householdBtnActionPerformed
        // TODO add your handling code here:
        CatProductsFrame pr = new CatProductsFrame(cs, products, "HE");
        pr.setVisible(true);
    }// GEN-LAST:event_householdBtnActionPerformed

    private void fruitandvBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fruitandvBtnActionPerformed
        // TODO add your handling code here:
        CatProductsFrame pr = new CatProductsFrame(cs, products, "FG");
        pr.setVisible(true);
    }// GEN-LAST:event_fruitandvBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton backBtn2;
    private javax.swing.JButton cosmeticsBtn;
    private javax.swing.JButton dairyBtn;
    private javax.swing.JButton electronicsBtn;
    private javax.swing.JButton fruitandvBtn;
    private javax.swing.JButton householdBtn;
    private javax.swing.JButton kitchenBtn;
    // End of variables declaration//GEN-END:variables
}
