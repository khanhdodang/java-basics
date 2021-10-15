package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Selenium2 {
    public static ChromeDriver driver = null;

    public static void main(String[] args) {
        /*
        TC 01#: User can login with valid credentials.

        Steps:
        1. Navigate to https://www.saucedemo.com/
        2. Enter 'standard_user' into username field
        3. Enter 'secret_sauce' into password field
        4. Click Login button

        Expected:
        1. User can login.
        2. The URL https://www.saucedemo.com/inventory.html is navigated.
        3. The 'PRODUCTS' label displays.
         */
        driver = new ChromeDriver();
//        login("standard_user", "secret_sauce");
//        login("locked_out_user", "secret_sauce");
//        login("problem_user", "secret_sauce");
//        login("performance_glitch_user", "secret_sauce");

        Account standard_acc = new Account("standard_user", "secret_sauce");
//        standard_acc.setUsername("standard_user");
//        standard_acc.setPassword("secret_sauce");

        login(standard_acc);

        driver.quit();
    }

    public static void login(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(username);

        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(password);

        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }

    public static void login(Account account) {
        driver.get("https://www.saucedemo.com/");
        WebElement input_username = driver.findElement(By.id("user-name"));
        input_username.sendKeys(account.getUsername());

        WebElement input_password = driver.findElement(By.id("password"));
        input_password.sendKeys(account.getPassword());

        WebElement button_login = driver.findElement(By.id("login-button"));
        button_login.click();
    }
}
