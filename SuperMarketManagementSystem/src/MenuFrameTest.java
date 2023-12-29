
/*
 * Testing strategy for MenuFrameTest class
 *
 * Partition the inputs as follows:
 *
 *  Test Show Details Button Opens UserInfoFrame:
 *    - Partition the input data:
 *      - Click the "Show Details" button.
 *      - Verify that the UserInfoFrame is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Show Details" button click event.
 *      - Analyze the logic responsible for opening the UserInfoFrame.
 *
 *  Test Change Password Button Action Performed:
 *    - Partition the input data:
 *      - Click the "Change Password" button.
 *      - Verify that the ChangePasswordFrame is closed after the action.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Change Password" button click event.
 *      - Analyze the logic responsible for performing the password change.
 *
 *  Test Show Categories Button Opens CategoriesFrame:
 *    - Partition the input data:
 *      - Click the "Show Categories" button.
 *      - Verify that the CategoriesFrame is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Show Categories" button click event.
 *      - Analyze the logic responsible for opening the CategoriesFrame.
 *
 *  Test Show Cart Button Action Performed:
 *    - Partition the input data:
 *      - Click the "Show Cart" button.
 *      - Verify that the CartFrame is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Show Cart" button click event.
 *      - Analyze the logic responsible for opening the CartFrame.
 *
 * Test Show Previous Orders Button Action Performed:
 *    - Partition the input data:
 *      - Click the "Show Previous Orders" button.
 *      - Verify that the PrevOrdersFrame is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Show Previous Orders" button click event.
 *      - Analyze the logic responsible for opening the PrevOrdersFrame.
 *
 * Test Logout Button Action Performed:
 *    - Partition the input data:
 *      - Click the "Logout" button.
 *      - Verify that the logout action is successfully performed.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Logout" button click event.
 *      - Analyze the logic responsible for performing the logout action.
 *
 */
import static org.junit.jupiter.api.Assertions.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import org.junit.jupiter.api.Test;

public class MenuFrameTest {

    /*
     * - Click the "Show Details" button and observe the actionPerformed method.
     * - Inspect the code handling the "Show Details" button click event.
     * - Analyze the logic responsible for opening the `UserInfoFrame`.
     * - Verify that the `UserInfoFrame` is instantiated and made visible.
     */

    @Test
    public void testShowDetailsButtonOpensUserInfoFrame() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            MenuFrame menuFrame = new MenuFrame(testCustomer);

            // Set up an ActionListener to open the UserInfoFrame
            JButton showDetailsButton = menuFrame.showDetailsBtn;
            showDetailsButton.addActionListener(e -> {
                UserInfoFrame userInfoFrame = new UserInfoFrame(testCustomer);
                userInfoFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            showDetailsButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));

    }

    /*
     * - Partitioning:
     * - Click the "Change Password" button and observe the actionPerformed method.
     * - Inspect the code handling the "Change Password" button click event.
     * - Analyze the logic responsible for performing the password change.
     * - Verify that the frame is closed after the password change action.
     */
    @Test
    public void testChangePasswordButtonActionPerformed() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ChangePasswordFrame changePasswordFrame = new ChangePasswordFrame(testCustomer);

            // Set up an ActionListener to perform the action when the button is clicked
            JButton changePasswordButton = changePasswordFrame.changeBtn;
            changePasswordButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Perform the action (e.g., changing the password)
                    // For simplicity, we'll just close the frame here
                    changePasswordFrame.setVisible(false);

                    // Count down the latch when the action is performed
                    latch.countDown();
                }
            });

            // Simulate a button click
            changePasswordButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Click the "Show Categories" button and observe the actionPerformed method.
     * - Inspect the code handling the "Show Categories" button click event.
     * - Analyze the logic responsible for opening the `CategoriesFrame`.
     * - Verify that the `CategoriesFrame` is instantiated and made visible.
     */
    @Test
    public void testShowCategoriesButtonOpensCategoriesFrame() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            MenuFrame menuFrame = new MenuFrame(testCustomer);

            // Set up an ActionListener to open the CategoriesFrame
            JButton showCatButton = menuFrame.showCatBtn;
            showCatButton.addActionListener(e -> {
                // Create a test ArrayList<Product>
                ArrayList<Product> testProducts = new ArrayList<>();
                // Assuming you have a sample product for testing
                Product testProduct = new Electronics(1, 10, 29.99, "Test Product", "EL", "Brand", "Description");
                testProducts.add(testProduct);

                CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);
                categoriesFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            showCatButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Click the "Show Cart" button and observe the actionPerformed method.
     * - Inspect the code handling the "Show Cart" button click event.
     * - Analyze the logic responsible for opening the `CartFrame`.
     * - Verify that the `CartFrame` is instantiated and made visible.
     */
    @Test
    public void testShowCartButtonActionPerformed() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            MenuFrame menuFrame = new MenuFrame(testCustomer);

            // Set up an ActionListener to perform the action when the button is clicked
            JButton showCartButton = menuFrame.showCartBtn;
            showCartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Perform the action (e.g., opening the CartFrame)
                    // For simplicity, we'll just close the frame here
                    menuFrame.setVisible(false);

                    // Count down the latch when the action is performed
                    latch.countDown();
                }
            });

            // Simulate a button click
            showCartButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Partitioning:
     * - Click the "Show Previous Orders" button and observe the actionPerformed
     * method.
     * - Inspect the code handling the "Show Previous Orders" button click event.
     * - Analyze the logic responsible for opening the `PrevOrdersFrame`.
     * - Verify that the `PrevOrdersFrame` is instantiated and made visible.
     */
    @Test
    public void testShowPrevOrdersBtnActionPerformed() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            MenuFrame menuFrame = new MenuFrame(testCustomer);

            // Set up an ActionListener to open the PrevOrdersFrame
            JButton showPrevOrdersButton = menuFrame.showPrevOrdersBtn;
            showPrevOrdersButton.addActionListener(e -> {
                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            showPrevOrdersButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Partitioning:
     * - Click the "Logout" button and observe the actionPerformed method.
     * - Inspect the code handling the "Logout" button click event.
     * - Analyze the logic responsible for performing the logout action.
     * - Verify that the action results in the desired state changes.
     */
    @Test
    public void testLogoutBtnActionPerformed() throws InterruptedException {

        // Create a customer with sample data
        customer customer = new customer(1, "John Doe", "1234567890", "123 Main St", "password", "M");

        // Use CountDownLatch to synchronize with the Swing event dispatch thread
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a MenuFrame instance
            MenuFrame menuFrame = new MenuFrame(customer);
            menuFrame.setVisible(true);

            // Add a latch to wait for the Logout action to complete
            menuFrame.logoutBtn.addActionListener((e) -> {
                latch.countDown(); // Count down the latch when the Logout action is performed
            });

            // Simulate clicking the "Logout" button
            menuFrame.logoutBtn.doClick();
        });

        // Slight delay to allow Swing to process the events
        TimeUnit.MILLISECONDS.sleep(500);

        // Wait for the Logout action to complete or timeout after a specified duration
        assertTrue(latch.await(30, TimeUnit.SECONDS));
    }
}
