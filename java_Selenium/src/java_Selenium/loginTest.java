package java_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("student");
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Password123");
            WebElement loginBtn = driver.findElement(By.id("submit"));
            loginBtn.click();
            System.out.println("Title: " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            driver.quit();
        }

			
		}

	

}
