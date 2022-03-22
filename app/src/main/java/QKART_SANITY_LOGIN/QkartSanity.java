/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package QKART_SANITY_LOGIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QkartSanity {

    public static void main(String[] args) throws Exception {
        System.out.println("Initializing Test !! ");
        WebDriver driver;
        // TODO: CRIO_TASK_MODULE_DEBUGGING: IMPORTANT! Enter the Driver Location here
        String driverLocation = "";
        System.setProperty("webdriver.chrome.driver", driverLocation);

        driver = new ChromeDriver();

        // TestCase 01
        System.out.println(
                java.time.LocalDateTime.now()
                        + ": Start Test: Test Case 1: Verify the functionality of Login Button on the home page  ");

        // Navigate to the home page of QKART
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");
        Thread.sleep(2000);
        try {
            // Find the Login button
            WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));

            // Check if the Login Button is displayed
            if (loginButton.isDisplayed()) {
                System.out.println(java.time.LocalDateTime.now()
                        + ": Step: Test Case 1: Login Button is displayed in the home page: PASS  ");
            } else {
                System.out
                        .println("Step: Test Case 1: Login Button is not displayed in the home page: FAIL  "
                                + java.time.LocalDateTime.now());
            }

            // Click on the login Button
            loginButton.click();
            Thread.sleep(5000);

            String currentUrl = driver.getCurrentUrl();

            // Check if the user is redirected to the login page
            if (currentUrl.endsWith("/login")) {
                System.out.println(
                        java.time.LocalDateTime.now()
                                + ": Step: Test Case 1: On clicking the login button, user is navigated to login page : PASS  ");
            } else {
                System.out.println(
                        java.time.LocalDateTime.now()
                                + ": Step: Test Case 1: On clicking the login button, user is not navigated to login page : FAIL  ");
                throw new Exception(
                        "Test Case 1 has failed , When the login button is clicked, page does not re-direct to login page");
            }

        } catch (Exception e) {
            System.out.println(
                    java.time.LocalDateTime.now()
                            + ": End Test: Test Case 1: Verify the functionality of Login Button on the home page: FAIL  ");
            throw new Exception("Test Case 1 has failed");
        }

        System.out.println(
                java.time.LocalDateTime.now()
                        + ": End Test: Test Case 1: Verify the functionality of Login Button on the home page: PASS  ");

        // Test Case 02
        System.out.println(
                java.time.LocalDateTime.now()
                        + ": Start Test: Test Case 2: Verify the functionality of Register Button on the home page  ");

        // Navigate to the home page of QKART
        driver.get("https://crio-qkart-frontend-qa.vercel.app/");
        Thread.sleep(2000);
        try {
            // Find the Register button
            WebElement registerButton = driver
                    .findElement(By.xpath("//button[normalize-space()='Register']"));

            // Check if the Register Button is displayed
            if (registerButton.isDisplayed()) {
                System.out.println(java.time.LocalDateTime.now()
                        + ": Step: Test Case 1: Register Button is displayed in the home page: PASS  ");
            } else {
                System.out
                        .println("Step: Test Case 1: register Button is not displayed in the home page: FAIL  "
                                + java.time.LocalDateTime.now());
            }

            // Click on the register Button
            registerButton.click();
            Thread.sleep(5000);
            String currentUrl = driver.getCurrentUrl();

            // Check if the user is redirected to the registration page
            if (currentUrl.endsWith("/register")) {
                System.out.println(
                        java.time.LocalDateTime.now()
                                + ": Step: Test Case 2: On clicking the register button, user is navigated to registration page : PASS  ");
            } else {
                System.out.println(
                        java.time.LocalDateTime.now()
                                + ": Step: Test Case 2: On clicking the register button, user is not navigated to registration page : FAIL  ");
                throw new Exception(
                        "Test Case 2 has failed , When the register button is clicked, page does not re-direct to register page");
            }

        } catch (Exception e) {
            System.out.println(
                    java.time.LocalDateTime.now()
                            + ": End Test: Test Case 2: Verify the functionality of register Button on the home page: FAIL  ");
            throw new Exception("Test Case 2 has failed");
        }

        System.out.println(
                java.time.LocalDateTime.now()
                        + ": End Test: Test Case 2: Verify the functionality of register Button on the home page: PASS  ");
        driver.quit();

    }
}
