
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 * The CatProductsFrame class represents the graphical user interface for displaying products within a specific category.
 * It extends JFrame and provides a table displaying product details along with options to go back or show detailed information about a selected product.
 */

public class CatProductsFrame extends javax.swing.JFrame {

        /** The customer associated with the category products frame. */
    customer cs = null;

    /** The list of products in the specific category. */
    ArrayList<Product> pr;

    /** The type of product category being displayed. */
    String type;

    /**
     * Creates a new instance of CatProductsFrame.
     *
     * @param cs The customer associated with the category products frame.
     * @param pr The list of products in the specific category.
     * @param type The type of product category being displayed.
     */
    public CatProductsFrame(customer cs, ArrayList<Product> pr, String type) {
        this.type = type;
        this.cs = cs;
        this.pr = pr;
        initComponents();

        //set background image
        ImageIcon background_img = new ImageIcon(
                "C:\\Users\\DELL\\Desktop\\Grocery_Management_System_Java\\SMMS_Images\\ProductsFrame.png", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(807, 456, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 807, 456);
        this.add(backgrnd);
        this.setTitle("Products");
        this.setResizable(false);
        showDetailsBtn.setOpaque(true);
        this.setLocationRelativeTo(null);

        backBtn.setOpaque(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        String[] col = { "ID", "Name", "Quantity", "Price" };
        DefaultTableModel tableModel = new DefaultTableModel(null, col);
        productsTable.setModel(tableModel);
        productsTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        TableColumnModel colModel = productsTable.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(30);
        colModel.getColumn(1).setPreferredWidth(450);
        colModel.getColumn(2).setPreferredWidth(30);
        colModel.getColumn(3).setPreferredWidth(80);
        DefaultCellEditor editor = (DefaultCellEditor) productsTable.getDefaultEditor(Object.class);
        editor.setClickCountToStart(20);
        for (int i = 0; i < pr.size(); i++) {

            if (pr.get(i).getType().equals(type)) {
                int ID = pr.get(i).getID();
                int qty = pr.get(i).getQuantity();
                double price = pr.get(i).getPrice();
                String data[] = { String.valueOf(ID), pr.get(i).getName(), String.valueOf(qty), String.valueOf(price) };
                tableModel.addRow(data);

            }

        }

    }

    /**
     * Initializes the graphical user interface components. This method is auto-generated by the NetBeans Form Editor.
     * It sets up the layout, buttons, and background image for displaying category products.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        showDetailsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productsTable.setBackground(new java.awt.Color(204, 204, 204));
        productsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        productsTable.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        productsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "ID", "Name", " Quantity", "Price"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsTable);
        if (productsTable.getColumnModel().getColumnCount() > 0) {
            productsTable.getColumnModel().getColumn(0).setMinWidth(50);
            productsTable.getColumnModel().getColumn(0).setMaxWidth(100);
            productsTable.getColumnModel().getColumn(2).setMinWidth(50);
            productsTable.getColumnModel().getColumn(2).setMaxWidth(100);
            productsTable.getColumnModel().getColumn(3).setMinWidth(80);
            productsTable.getColumnModel().getColumn(3).setMaxWidth(120);
        }

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

        showDetailsBtn.setBackground(new java.awt.Color(255, 102, 102));
        showDetailsBtn.setFont(new java.awt.Font("Hoefler Text", 1, 26)); // NOI18N
        showDetailsBtn.setText("Show Details");
        showDetailsBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        showDetailsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDetailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(62, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(showDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Event handler for the "Back" button. Closes the current category products window.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }// GEN-LAST:event_backBtnActionPerformed

    /**
     * Event handler for the "Show Details" button. Displays detailed information about the selected product.
     *
     * @param evt The ActionEvent triggered by the button.
     */
    private void showDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showDetailsBtnActionPerformed

        int row = productsTable.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please Select a Product to show its Details!", "ALERT",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            String val = productsTable.getModel().getValueAt(row, 0).toString();
            int i = Integer.parseInt(val);
            ProductFrame obj1 = new ProductFrame(pr, i, cs);
            obj1.setVisible(true);

        }
    }// GEN-LAST:event_showDetailsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productsTable;
    private javax.swing.JButton showDetailsBtn;
    // End of variables declaration//GEN-END:variables
}
