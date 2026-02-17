package java_Selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsites {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://www.google.com");
            System.out.println("Opened Google");
            System.out.println("Title: " + driver.getTitle());

            driver.navigate().to("https://www.selenium.dev");
            System.out.println("Opened Selenium Website");
            System.out.println("Title: " + driver.getTitle());
            
            driver.navigate().to("https://www.amazon.in");
            Thread.sleep(2000);
            System.out.println("opened amazon website ");
            System.out.println("title : " + driver.getTitle());

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
