package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        driver.quit();
    }
}