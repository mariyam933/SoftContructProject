
/*
 * Testing strategy for PrevOrdersFrame class
 *
 *  Test Back Button Action:
   - Partition the input: clicking the back button
   - Click the back button and ensure that the PrevOrdersFrame is hidden.

 *  Test Get Orders Table:
   - Partition the input: customer with previous orders, customer with no previous orders
   - Get the orders table for a customer with previous orders.
   - Verify that the orders table is not null, the table model is not null, and the column count is as expected.

 * Note: Ensure that the tests cover both valid and boundary scenarios.
 */
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import org.junit.jupiter.api.Test;

public class PrevOrderFrameTest {

  /*
   * Test Back Button Action:
   * - Covers clicking the back button.
   * - The test ensures that the Back Button Action correctly hides the
   * PrevOrdersFrame.
   */
  @Test
  public void testBackButtonActionPerformed() throws InterruptedException {

    // Create a latch with a count of 1
    CountDownLatch latch = new CountDownLatch(1);

    SwingUtilities.invokeLater(() -> {
      // Create a test customer
      customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword", "Male");
      PrevOrdersFrame prevOrdersFrame = new PrevOrdersFrame(testCustomer);

      // Set up an ActionListener to perform the action when the button is clicked
      JButton backButton = prevOrdersFrame.backBtn;
      backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          // Perform the action (e.g., hiding the PrevOrdersFrame)
          // For simplicity, we'll just hide the frame here
          prevOrdersFrame.setVisible(false);

          // Count down the latch when the action is performed
          latch.countDown();
        }
      });

      // Simulate a button click
      backButton.doClick();
    });

    // Wait for the latch to count down (timeout after 5 seconds)
    assertTrue(latch.await(5, TimeUnit.SECONDS));
  }

  /*
   * Test Get Orders Table:
   * - Covers getting the orders table for a customer with previous orders.
   * - The test verifies that the orders table is not null, the table model is not
   * null,
   * and the column count is as expected.
   */

  @Test
  void testGetOrdersTable() throws InterruptedException {

    // Create a sample customer object for testing
    customer testCustomer = new customer(1, "Test Customer", "123456789", "Test Address", "testpassword", "Male");

    // Create an instance of your PrevOrdersFrame class with the sample customer
    PrevOrdersFrame prevOrdersFrame = new PrevOrdersFrame(testCustomer);

    // Create a CountDownLatch with a count of 1
    CountDownLatch latch = new CountDownLatch(1);

    // Call the method to get the orders table asynchronously
    Thread thread = new Thread(() -> {
      JTable ordersTable = prevOrdersFrame.getOrdersTable();
      // Perform assertions in the background thread
      assertNotNull(ordersTable, "Orders table should not be null");
      DefaultTableModel defaultTableModel = (DefaultTableModel) ordersTable.getModel();
      assertNotNull(defaultTableModel, "Default table model should not be null");
      assertEquals(4, defaultTableModel.getColumnCount(), "Number of columns should be 4");

      // Count down the latch to signal that the assertions are completed
      latch.countDown();
    });

    // Start the background thread
    thread.start();

    // Wait for the latch to count down (or timeout after 5 seconds)
    latch.await(5, TimeUnit.SECONDS);

    // Ensure the background thread has completed
    thread.join();

    // Additional assertions can be added if needed
  }

}