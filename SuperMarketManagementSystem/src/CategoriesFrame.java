
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The CategoriesFrame class represents the graphical user interface for displaying product categories.
 * It extends JFrame and provides buttons to navigate to different product categories.
 */
public class CategoriesFrame extends javax.swing.JFrame {

    /** The customer associated with the categories frame. */
    customer cs = null;

    /** The list of products available in the system. */
    ArrayList<Product> products;

    /**
     * Creates a new instance of CategoriesFrame.
     *
     * @param cs The customer associated with the categories frame.
     * @param products The list of products available in the system.
     */
    public CategoriesFrame(customer cs, ArrayList<Product> products) {
        this.cs = cs;
        this.products = products;
        initComponents();

        //set background image
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
     * Initializes the graphical user interface components. This method is auto-generated by the NetBeans Form Editor.
     * It sets up the layout, buttons, and background image for displaying product categories.
     */
    @SuppressWarnings("unchecked")
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
    }

    /**
     * Event handler for the "Back" button. Closes the current categories window.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtn2ActionPerformed
        this.setVisible(false);
    }// GEN-LAST:event_backBtn2ActionPerformed


    /**
     * Event handler for the "Electronics" button. Opens the category products frame for electronics.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void electronicsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_electronicsBtnActionPerformed
        CatProductsFrame pr = new CatProductsFrame(cs, products, "EL");
        pr.setVisible(true);
    }// GEN-LAST:event_electronicsBtnActionPerformed

    /**
     * Event handler for the "Dairy" button. Opens the category products frame for dairy products.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void dairyBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_dairyBtnActionPerformed
        
        CatProductsFrame pr = new CatProductsFrame(cs, products, "Dairy");
        pr.setVisible(true);
    }// GEN-LAST:event_dairyBtnActionPerformed

    /**
     * Event handler for the "Cosmetics" button. Opens the category products frame for cosmetics.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void cosmeticsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cosmeticsBtnActionPerformed
        
        CatProductsFrame pr = new CatProductsFrame(cs, products, "COS");
        pr.setVisible(true);
    }// GEN-LAST:event_cosmeticsBtnActionPerformed

    /**
     * Event handler for the "Kitchen" button. Opens the category products frame for kitchen products.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void kitchenBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_kitchenBtnActionPerformed
        
        CatProductsFrame pr = new CatProductsFrame(cs, products, "KA");
        pr.setVisible(true);
    }// GEN-LAST:event_kitchenBtnActionPerformed

    /**
     * Event handler for the "Household" button. Opens the category products frame for household products.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void householdBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_householdBtnActionPerformed
        
        CatProductsFrame pr = new CatProductsFrame(cs, products, "HE");
        pr.setVisible(true);
    }// GEN-LAST:event_householdBtnActionPerformed

    /**
     * Event handler for the "Fruits and Vegetables" button. Opens the category products frame for fruits and vegetables.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void fruitandvBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_fruitandvBtnActionPerformed
        
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
