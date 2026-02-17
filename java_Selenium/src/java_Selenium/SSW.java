package java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SSW {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            // Step 1: Open Google
            driver.get("https://www.google.com");

            // Step 2: Find search box
            WebElement searchBox = driver.findElement(By.name("q"));

            // Step 3: Type text
            searchBox.sendKeys("https://practicetestautomation.com/practice-test-login/");

            // Step 4: Press Enter
            searchBox.sendKeys(Keys.ENTER);

            // Print page title
            System.out.println("Title: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            driver.quit();
        }
    }
}
