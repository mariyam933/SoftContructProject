
/*
 * Testing strategy for CategoriesFrameTest class
 *
 * Partition the inputs as follows:
 *
 *  Test Back Button Goes Back to MenuFrame:
 *    - Partition the input data:
 *      - Click the "Back" button.
 *      - Verify that the MenuFrame is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Back" button click event.
 *      - Analyze the logic responsible for navigating back to the MenuFrame.
 *
 *  Test Electronics Button Opens CatProductsFrame with EL Category:
 *    - Partition the input data:
 *      - Click the "Electronics" button.
 *      - Verify that the CatProductsFrame with Electronics category is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Electronics" button click event.
 *      - Analyze the logic responsible for opening the CatProductsFrame with the specified category.
 *
 *  Test Dairy Button Opens CatProductsFrame with Dairy Category:
 *    - Partition the input data:
 *      - Click the "Dairy" button.
 *      - Verify that the CatProductsFrame with Dairy category is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Dairy" button click event.
 *      - Analyze the logic responsible for opening the CatProductsFrame with the specified category.
 *
 *  Test Cosmetics Button Opens CatProductsFrame with COS Category:
 *    - Partition the input data:
 *      - Click the "Cosmetics" button.
 *      - Verify that the CatProductsFrame with Cosmetics category is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Cosmetics" button click event.
 *      - Analyze the logic responsible for opening the CatProductsFrame with the specified category.
 *
 *  Test Kitchen Button Opens CatProductsFrame with KA Category:
 *    - Partition the input data:
 *      - Click the "Kitchen" button.
 *      - Verify that the CatProductsFrame with Kitchen category is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Kitchen" button click event.
 *      - Analyze the logic responsible for opening the CatProductsFrame with the specified category.
 *
 * Test Household Button Opens CatProductsFrame with HE Category:
 *    - Partition the input data:
 *      - Click the "Household" button.
 *      - Verify that the CatProductsFrame with Household category is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Household" button click event.
 *      - Analyze the logic responsible for opening the CatProductsFrame with the specified category.
 *
 * Test Fruit and Vegetables Button Opens CatProductsFrame with FG Category:
 *    - Partition the input data:
 *      - Click the "Fruit and Vegetables" button.
 *      - Verify that the CatProductsFrame with Fruits and Vegetables category is successfully opened.
 *    - Include white-box testing:
 *      - Inspect the code handling the "Fruit and Vegetables" button click event.
 *      - Analyze the logic responsible for opening the CatProductsFrame with the specified category.
 *
 */
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import org.junit.jupiter.api.Test;

public class CategoriesFrameTest {

    /*
     * - Inspect the implementation of the "Back" button ActionListener.
     * - Check that the ActionListener hides the CategoriesFrame and shows the
     * MenuFrame.
     * - Verify that the CategoriesFrame is disposed of or not visible after
     * clicking "Back."
     */
    @Test
    void testBackButtonGoesBackToMenuFrame() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener to go back to MenuFrame
            JButton backButton = categoriesFrame.backBtn2;
            backButton.addActionListener(e -> {
                // Create a test MenuFrame
                MenuFrame menuFrame = new MenuFrame(testCustomer);
                menuFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            backButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Inspect the implementation of the "Electronics" button ActionListener.
     * - Check that the ActionListener creates a new instance of CatProductsFrame
     * with the "EL" category.
     * - Verify that the new CatProductsFrame is visible after clicking the
     * "Electronics" button.
     */
    @Test
    void testElectronicsButtonOpensCatProductsFrameWithELCategory() throws InterruptedException {
        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener for electronicsBtn
            JButton electronicsButton = categoriesFrame.electronicsBtn;
            electronicsButton.addActionListener(e -> {
                // Create a test CatProductsFrame for Electronics category
                CatProductsFrame catProductsFrame = new CatProductsFrame(testCustomer, testProducts, "EL");
                catProductsFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            electronicsButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Inspect the implementation of the "Dairy" button ActionListener.
     * - Check that the ActionListener creates a new instance of CatProductsFrame
     * with the "Dairy" category.
     * - Verify that the new CatProductsFrame is visible after clicking the "Dairy"
     * button.
     */
    @Test
    void testDairyButtonOpensCatProductsFrameWithDairyCategory() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener for dairyBtn
            JButton dairyButton = categoriesFrame.dairyBtn;
            dairyButton.addActionListener(e -> {
                // Create a test CatProductsFrame for Dairy category
                CatProductsFrame catProductsFrame = new CatProductsFrame(testCustomer, testProducts, "Dairy");
                catProductsFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            dairyButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Inspect the implementation of the "Cosmetics" button ActionListener.
     * - Check that the ActionListener creates a new instance of CatProductsFrame
     * with the "COS" category.
     * - Verify that the new CatProductsFrame is visible after clicking the
     * "Cosmetics" button.
     */
    @Test
    void testCosmeticsButtonOpensCatProductsFrameWithCOSCategory() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener for cosmeticsBtn
            JButton cosmeticsButton = categoriesFrame.cosmeticsBtn;
            cosmeticsButton.addActionListener(e -> {
                // Create a test CatProductsFrame for Cosmetics category
                CatProductsFrame catProductsFrame = new CatProductsFrame(testCustomer, testProducts, "COS");
                catProductsFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            cosmeticsButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Inspect the implementation of the "Kitchen" button ActionListener.
     * - Check that the ActionListener creates a new instance of CatProductsFrame
     * with the "KA" category.
     * - Verify that the new CatProductsFrame is visible after clicking the
     * "Kitchen" button.
     */
    @Test
    void testKitchenButtonOpensCatProductsFrameWithKACategory() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener for kitchenBtn
            JButton kitchenButton = categoriesFrame.kitchenBtn;
            kitchenButton.addActionListener(e -> {
                // Create a test CatProductsFrame for Kitchen category
                CatProductsFrame catProductsFrame = new CatProductsFrame(testCustomer, testProducts, "KA");
                catProductsFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            kitchenButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Inspect the implementation of the "Household" button ActionListener.
     * - Check that the ActionListener creates a new instance of CatProductsFrame
     * with the "HE" category.
     * - Verify that the new CatProductsFrame is visible after clicking the
     * "Household" button.
     */
    @Test
    void testHouseholdButtonOpensCatProductsFrameWithHECategory() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener for householdBtn
            JButton householdButton = categoriesFrame.householdBtn;
            householdButton.addActionListener(e -> {
                // Create a test CatProductsFrame for Household category
                CatProductsFrame catProductsFrame = new CatProductsFrame(testCustomer, testProducts, "HE");
                catProductsFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            householdButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }

    /*
     * - Inspect the implementation of the "Fruit and Vegetables" button
     * ActionListener.
     * - Check that the ActionListener creates a new instance of CatProductsFrame
     * with the "FG" category.
     * - Verify that the new CatProductsFrame is visible after clicking the
     * "Fruit and Vegetables" button.
     */
    @Test
    void testFruitandvButtonOpensCatProductsFrameWithFGCategory() throws InterruptedException {

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        SwingUtilities.invokeLater(() -> {
            // Create a test customer
            customer testCustomer = new customer(1, "Test Customer", "1234567890", "Test Address", "testpassword",
                    "Male");
            ArrayList<Product> testProducts = new ArrayList<>();
            CategoriesFrame categoriesFrame = new CategoriesFrame(testCustomer, testProducts);

            // Set up an ActionListener for fruitandvBtn
            JButton fruitandvButton = categoriesFrame.fruitandvBtn;
            fruitandvButton.addActionListener(e -> {
                // Create a test CatProductsFrame for Fruits and Vegetables category
                CatProductsFrame catProductsFrame = new CatProductsFrame(testCustomer, testProducts, "FG");
                catProductsFrame.setVisible(true);

                // Count down the latch when the frame is opened
                latch.countDown();
            });

            // Simulate a button click
            fruitandvButton.doClick();
        });

        // Wait for the latch to count down (timeout after 5 seconds)
        assertTrue(latch.await(5, TimeUnit.SECONDS));
    }
}
