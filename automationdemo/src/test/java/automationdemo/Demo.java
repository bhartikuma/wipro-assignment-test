package automationdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         driver.get("https://www.amazon.in");

         WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
         searchBox.sendKeys("earphone");
         searchBox.sendKeys(Keys.ENTER);

         System.out.println("Search executed successfully");
		
	}
}