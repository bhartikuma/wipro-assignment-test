package java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/upload");

          
            String filePath = "C:/Users/sonal/Desktop/sample.txt";
            Thread.sleep(2000);

          
            driver.findElement(By.id("file-upload")).sendKeys(filePath);
            Thread.sleep(2000);

            driver.findElement(By.id("file-submit")).click();

            
            String message = driver.findElement(By.tagName("h3")).getText();
            Thread.sleep(2000);

            if (message.contains("File Uploaded")) {
                System.out.println("File Uploaded Successfully");
            } else {
                System.out.println("Upload Failed");
            }
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
