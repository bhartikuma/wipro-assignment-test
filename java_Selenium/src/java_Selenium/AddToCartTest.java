package java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AddToCartTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            // LOGIN
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // WAIT inventory page
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.className("inventory_list")));

            // ADD PRODUCT
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            System.out.println("Product Added");

            // =========================
            // CORRECT CART CLICK
            // =========================
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.cssSelector("a.shopping_cart_link"))).click();

            wait.until(ExpectedConditions.urlContains("cart.html"));
            System.out.println("Cart Page Opened");

            // CHECKOUT
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("checkout"))).click();

            wait.until(ExpectedConditions.urlContains("checkout-step-one.html"));
            System.out.println("Checkout Page Opened");

            // FILL DETAILS
            driver.findElement(By.id("first-name")).sendKeys("Sonal");
            driver.findElement(By.id("last-name")).sendKeys("Test");
            driver.findElement(By.id("postal-code")).sendKeys("123456");

            driver.findElement(By.id("continue")).click();

            // FINISH
            wait.until(ExpectedConditions.elementToBeClickable(
                    By.id("finish"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.className("complete-header")));

            System.out.println("Order Placed Successfully ✅");

        } finally {
            driver.quit();
        }
    }
}
