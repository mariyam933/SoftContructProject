
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * The `ProductFrame` class represents a GUI frame displaying details of a specific product.
 * It allows users to view information such as the product image, name, price, and description.
 * Users can also add the product to their cart using the "Add to Cart" button.
 */

public class ProductFrame extends javax.swing.JFrame {

    ArrayList<Product> pr;
    int ID;
    Product showpr = null;
    customer cs = null;

    /**
     * Creates a new instance of the `ProductFrame` with the specified parameters.
     *
     * @param p  The list of products.
     * @param id The ID of the product to be displayed.
     * @param cs The customer associated with the product frame.
     */
    public ProductFrame(ArrayList<Product> p, int id, customer cs) {
        pr = p;
        ID = id;
        this.cs = cs;
        initComponents();
        ImageIcon background_img = new ImageIcon(
                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\productBG.jpeg", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(800, 670, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 800, 670);
        this.add(backgrnd);
        this.setTitle("Product Details");
        this.setResizable(false);
        addToCartBtn.setOpaque(true);
        showpr = null;
        for (int i = 0; i < pr.size(); i++) {
            if (pr.get(i).getID() == id) {
                showpr = pr.get(i);
            }
        }
        if (showpr != null) {
            ImageIcon img1 = new ImageIcon(showpr.getImgPath(), "");
            Image img2 = img1.getImage();

            Image dimg = img2.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon fimg = new ImageIcon(dimg);
            imageLabel.setIcon(fimg);
            nameLabel.setText("<html>" + showpr.getName() + "</html>");
            priceLabel.setText("" + showpr.getPrice());
            descArea.setText(showpr.getDesc());
            descArea.setLineWrap(true);
        } else {
            JOptionPane.showMessageDialog(this, "Product NOT Found! ", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);

        backBtn.setOpaque(true);
    }

    /**
     * Initializes the components of the frame, sets up the UI, and populates the product details.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBtn = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descArea = new javax.swing.JTextArea();
        addToCartBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        loginBtn.setBackground(new java.awt.Color(255, 102, 102));
        loginBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel2.setText("Description:");

        priceLabel.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        priceLabel.setText("productPrice");

        nameLabel.setFont(new java.awt.Font("Hubballi", 1, 24)); // NOI18N
        nameLabel.setText("productName");

        jLabel3.setFont(new java.awt.Font("Hubballi", 1, 26)); // NOI18N
        jLabel3.setText("Price:");

        descArea.setEditable(false);
        descArea.setColumns(20);
        descArea.setFont(new java.awt.Font("Didot", 0, 18)); // NOI18N
        descArea.setRows(5);
        descArea.setText("product description here");
        jScrollPane1.setViewportView(descArea);

        addToCartBtn.setBackground(new java.awt.Color(255, 102, 102));
        addToCartBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        addToCartBtn.setText("Add to Cart");
        addToCartBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        addToCartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 102, 102));
        backBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 252,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(priceLabel,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 168,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(24, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 524,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nameLabel)
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(priceLabel)
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37,
                                        Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the action when the "Add to Cart" button is clicked.
     *
     * @param evt The ActionEvent representing the button click.
     */
    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addToCartBtnActionPerformed
        // TODO add your handling code here:
        ArrayList<order> or = new ArrayList<>();
        order e = new order(showpr.getID(), showpr.getName(), 1, showpr.getPrice(), "curr");
        this.setVisible(false);
        or = cs.getOrders();
        or.add(e);
        cs.setOrders(or);
    }// GEN-LAST:event_addToCartBtnActionPerformed

    /**
     * Handles the action when the "Back" button is clicked.
     *
     * @param evt The ActionEvent representing the button click.
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed

        this.setVisible(false);
    }// GEN-LAST:event_backBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextArea descArea;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}
