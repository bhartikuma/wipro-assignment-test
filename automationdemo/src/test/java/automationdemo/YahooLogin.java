package automationdemo;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooLogin {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://login.yahoo.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")))
                .sendKeys("bhartikumari07@yahoo.com");

        driver.findElement(By.id("login-signin")).click();

        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")))
                .sendKeys("local@1234");

        driver.findElement(By.id("login-signin")).click();
        driver.findElement(By.xpath("//*[@id=\"ybarMailLink\"]/svg/path")).click();


        try {
        	wait.until(ExpectedConditions.elementToBeClickable(By.id("ybarMailLink"))).click();
            System.out.println("Login Successful");
        } catch (Exception e) {
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}

