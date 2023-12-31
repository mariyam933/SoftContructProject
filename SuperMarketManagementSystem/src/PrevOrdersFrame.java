
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 * The `PrevOrdersFrame` class represents a frame for displaying the previous orders of a customer
 * in the grocery management system.
 */
public class PrevOrdersFrame extends javax.swing.JFrame {

    // Reference to the customer whose previous orders are being displayed
    customer cs = null;

    /**
     * Creates a new instance of `PrevOrdersFrame`.
     *
     * @param cs The customer object representing the current user.
     */
    public PrevOrdersFrame(customer cs) {
        this.cs = cs;
        ArrayList<order> or;
        initComponents();

        // Set background image
        ImageIcon background_img = new ImageIcon("/Users/waniya_mustafa/Desktop/SMMS_Images/previousOrderFrame.jpeg", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1000, 820, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1000, 820);
        this.add(backgrnd);
        this.setTitle("Categories");
        this.setResizable(false);
        backBtn.setOpaque(true);
                this.setLocationRelativeTo(null);

         // Set default close operation
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Retrieve customer's orders
        or = cs.getOrders();
        String[] col = {"ID", "Name", "Quantity", "Price"};
        DefaultTableModel tableModel = new DefaultTableModel(null, col);
        ordersTable.setModel(tableModel);
        ordersTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
        TableColumnModel colModel = ordersTable.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(30);
        colModel.getColumn(1).setPreferredWidth(450);
        colModel.getColumn(2).setPreferredWidth(30);
        colModel.getColumn(3).setPreferredWidth(80);
        DefaultCellEditor editor = (DefaultCellEditor) ordersTable.getDefaultEditor(Object.class);
        editor.setClickCountToStart(20);

        // Populate the table with previous orders
        for (int i = 0; i < or.size(); i++) {

            if (or.get(i).getType().equals("prev")) {
                int ID = or.get(i).getID();
                int qty = or.get(i).getQuantity();
                double price = or.get(i).getTotalPrice();
                String data[] = {String.valueOf(ID), or.get(i).getName(), String.valueOf(qty), String.valueOf(price)};
                tableModel.addRow(data);

            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ordersTable.setBackground(new java.awt.Color(204, 204, 204));
        ordersTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        ordersTable.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ordersTable);

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
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
 * Handles the action when the "Back" button is clicked in the PrevOrdersFrame.
 * This method sets the visibility of the current frame to false, effectively
 * hiding it and allowing the user to navigate back to the previous frame or window.
 *
 * @param evt The ActionEvent triggered when the "Back" button is clicked.
 */
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ordersTable;
    // End of variables declaration//GEN-END:variables
}
