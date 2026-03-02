package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenshotUtil;

public class baseTest {

    protected WebDriver driver;

    // Runs once before all test methods in the class
    @BeforeClass
    public void setupEnvironment() {
        WebDriverManager.chromedriver().setup();
        System.out.println("Environment Setup Completed");
    }

    // Runs before each test method
    @BeforeMethod
    public void launchBrowser() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options);

        // Open BooksWagon Login Page
        driver.get("https://www.bookswagon.com/login");
    }

    // Runs after each test method
    @AfterMethod
    public void closeBrowser(ITestResult result) {

        // If test fails, capture screenshot
        if (ITestResult.FAILURE == result.getStatus()) {
            ScreenshotUtil.captureScreenshot(driver, result.getName());
            System.out.println("Screenshot captured for failed test: " + result.getName());
        }

        if (driver != null) {
            driver.quit();
        }
    }

    // Runs once after all test methods in the class
    @AfterClass
    public void tearDownEnvironment() {
        System.out.println("Execution Completed");
    }
}