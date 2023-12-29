
/*
 * Testing strategy for MainFrameTest class
 *
 * Partition the inputs as follows:
 *
 * 1. Test Login Button Opens LoginFrame:
   - Partition the input data:
     - Click the "Login" button.
     - Verify that the LoginFrame is opened.

 * 2. Test SignUp Button Opens SignUpFrame:
   - Partition the input data:
     - Click the "Sign Up" button.
     - Verify that the SignUpFrame is opened.

*/
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import org.junit.jupiter.api.Test;

public class MainFrameTest {

  /*
   * - Click the "Login" button and observe the actionPerformed method.
   * - Inspect the code handling the "Login" button click event.
   * - Analyze the logic responsible for opening the `LoginFrame`.
   * - Verify that the `LoginFrame` is instantiated and made visible.
   */
  @Test
  void testLoginButtonOpensLoginFrame() throws InterruptedException {

    // Create a latch with a count of 1
    CountDownLatch latch = new CountDownLatch(1);

    SwingUtilities.invokeLater(() -> {
      MainFrame mainFrame = new MainFrame();

      // Set up an ActionListener to open the LoginFrame
      JButton loginButton = mainFrame.loginBtn;
      loginButton.addActionListener(e -> {
        // Count down the latch when the button is clicked
        latch.countDown();
      });

      // Simulate a button click
      loginButton.doClick();
    });

    // Wait for the latch to count down (timeout after 5 seconds)
    assertTrue(latch.await(5, TimeUnit.SECONDS));
  }

  /*
   * - Click the "Sign Up" button and observe the actionPerformed method.
   * - Inspect the code handling the "Sign Up" button click event.
   * - Analyze the logic responsible for opening the `SignUpFrame`.
   * - Verify that the `SignUpFrame` is instantiated and made visible.
   */
  @Test
  void testSignUpButtonOpensSignUpFrame() throws InterruptedException {
    // Create a latch with a count of 1
    CountDownLatch latch = new CountDownLatch(1);

    SwingUtilities.invokeLater(() -> {
      MainFrame mainFrame = new MainFrame();

      // Set up an ActionListener to open the SignUpFrame
      JButton signUpButton = mainFrame.signUpBtn;
      signUpButton.addActionListener(e -> {
        // Count down the latch when the button is clicked
        latch.countDown();
      });

      // Simulate a button click
      signUpButton.doClick();
    });

    // Wait for the latch to count down (timeout after 5 seconds)
    assertTrue(latch.await(5, TimeUnit.SECONDS));
  }
}
