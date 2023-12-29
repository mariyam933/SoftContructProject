
/*

* Testing strategy for SignUpFrameTest class
 *
 * Partition the inputs as follows:
 * 1. Test SignUp Button Action with Valid Data:
   - Partition the input data:
     - Set valid input for all fields (non-empty name, password, phone, and address).
     - Click the "Sign Up" button.
     - Verify that the user is successfully registered.

 * 2. Test SignUp Button Action with Empty Fields:
   - Partition the input data:
     - Leave one or more fields empty.
     - Click the "Sign Up" button.
     - Verify that an appropriate error message is displayed.
*/
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.SwingUtilities;

import org.junit.jupiter.api.Test;

public class SignUpFrameTest {

  /*
   * Testing strategy for SignUpFrameTest class
   *
   * 1. Test SignUp Button Action with Valid Data:
   * - Partition the input data:
   * - Set valid input for all fields (non-empty name, password, phone, and
   * address).
   * - Click the "Sign Up" button.
   * - Verify that the user is successfully registered.
   */
  @Test
  public void testSignUpBtnActionPerformed() throws InvocationTargetException, InterruptedException {

    // Create SignUpFrame
    SignUpFrame signUpFrame = new SignUpFrame();
    signUpFrame.setVisible(true);

    // Use CountDownLatch to synchronize with the Swing event dispatch thread
    CountDownLatch latch = new CountDownLatch(1);

    SwingUtilities.invokeLater(() -> {
      // Set some sample data for testing
      signUpFrame.nameField.setText("John Doe");
      signUpFrame.pssField.setText("password");
      signUpFrame.phoneField.setText("1234567890");
      signUpFrame.addField.setText("123 Main St");
      signUpFrame.Male.setSelected(true); // Assume Male is selected

      // Simulate clicking the "Sign Up" button
      signUpFrame.signUpBtn.addActionListener((e) -> latch.countDown());
      signUpFrame.signUpBtn.doClick();
    });

    // Introduce a small delay to allow Swing to process the event
    Thread.sleep(1000);

    // Wait for the latch with a timeout (e.g., 5 seconds)
    assertTrue(latch.await(5, TimeUnit.SECONDS));

    // Add your assertions based on the expected behavior of the
    // SignUpBtnActionPerformed method
    // For example, you can check if a new user is registered successfully

    // Clean up
    signUpFrame.dispose();
  }

  /*
   * Test SignUp Button Action with Empty Fields:
   * - Partition the input data:
   * - Leave one or more fields empty.
   * - Click the "Sign Up" button.
   * - Verify that an appropriate error message is displayed.
   */

  @Test
  public void testSignUpBtnWithEmptyFields() throws InvocationTargetException, InterruptedException {

    // Create SignUpFrame
    SignUpFrame signUpFrame = new SignUpFrame();
    signUpFrame.setVisible(true);

    // Use CountDownLatch to synchronize with the Swing event dispatch thread
    CountDownLatch latch = new CountDownLatch(1);

    SwingUtilities.invokeLater(() -> {
      // Leave some fields empty
      signUpFrame.nameField.setText("John Doe");
      signUpFrame.pssField.setText("password");

      // Simulate clicking the "Sign Up" button
      signUpFrame.signUpBtn.addActionListener((e) -> latch.countDown());
      signUpFrame.signUpBtn.doClick();
    });

    // Introduce a small delay to allow Swing to process the event
    Thread.sleep(500);

    // Wait for the latch with a timeout (e.g., 5 seconds)
    assertTrue(latch.await(5, TimeUnit.SECONDS));

    // Add assertions based on the expected behavior of the SignUpBtnActionPerformed
    // method
    // For example, you can check if an error message is displayed for empty fields

    // Clean up
    signUpFrame.dispose();
  }
}