package tests;

import base.baseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends baseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"9102293301", "Bharti@1234", "success"},
                {"valid_email@gmail.com", "wrong_password", "error"},
                {"wrong_email@gmail.com", "valid_password", "error"},
                {"", "", "validation"}
        };
    }

    @Test(dataProvider = "loginData", retryAnalyzer = utils.RetryAnalyzer.class)
    public void loginTest(String username, String password, String expectedResult) throws InterruptedException {

        driver.findElement(By.id("ctl00_phBody_SignIn_txtEmail")).clear();
        driver.findElement(By.id("ctl00_phBody_SignIn_txtEmail")).sendKeys(username);

        driver.findElement(By.id("ctl00_phBody_SignIn_txtPassword")).clear();
        driver.findElement(By.id("ctl00_phBody_SignIn_txtPassword")).sendKeys(password);

        driver.findElement(By.id("ctl00_phBody_SignIn_btnLogin")).click();

        Thread.sleep(3000);

        if (expectedResult.equals("success")) {

            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("myaccount"),
                    "Login Failed for valid credentials");

        } else if (expectedResult.equals("error")) {

            WebElement errorMsg = driver.findElement(By.id("ctl00_phBody_SignIn_lblmsg"));
            Assert.assertTrue(errorMsg.isDisplayed(),
                    "Error message not displayed");

        } else if (expectedResult.equals("validation")) {

            WebElement emailField = driver.findElement(By.id("ctl00_phBody_SignIn_txtEmail"));
            Assert.assertTrue(emailField.getAttribute("value").isEmpty(),
                    "Validation failed for empty fields");
        }
    }
}
