package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginSteps {

    WebDriver driver;

    @Given("user is on login page")
    public void open_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @When("user enters valid credentials")
    public void enter_credentials() {
        System.out.println("Dummy step");
    }

    @Then("user should see homepage")
    public void verify_homepage() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Google"));
        driver.quit();
    
    }
}