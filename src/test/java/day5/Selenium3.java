package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Selenium3 {
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

        Account standard_acc = new Account("standard_user", "secret_sauce");
//        standard_acc.setUsername("standard_user");
//        standard_acc.setPassword("secret_sauce");

        login(standard_acc);
//        click_addToCart(1);
//        click_addToCart(2);
//        click_addToCart(3);
//        click_addToCart(4);
//        click_addToCart(5);
//        click_addToCart(6);
//        click_addToCart(7);
//
//        click_RemoveProduct(1);
//        click_RemoveProduct(2);
//        click_RemoveProduct(3);
//        click_RemoveProduct(4);
//        click_RemoveProduct(5);
//        click_RemoveProduct(6);
//        click_RemoveProduct(7);

        click_ProductItem(1, "add");
//        click_ProductItem(2, "remove");
//        click_ProductItem(3, "add");
        click_ProductItem(7, "add");
        
        driver.quit();
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

    public static void click_addToCart(int index) {
        String locator = "//div[@class='inventory_item']";
        List<WebElement> elementList = driver.findElements(By.xpath(locator));

        if (index > 0 && index <= elementList.size()) {
            WebElement element = driver.findElement(By.xpath(locator + "[" + index + "]//button"));
            if (element.getText().equalsIgnoreCase("Add to cart")) {
                element.click();
            }
        }
    }

    public static void click_RemoveProduct(int index) {
        String locator = "//div[@class='inventory_item']";
        List<WebElement> elementList = driver.findElements(By.xpath(locator));
        if (index > 0 && index <= elementList.size()) {
            WebElement element = driver.findElement(By.xpath(locator + "[" + index + "]//button"));
            if (element.getText().equalsIgnoreCase("Remove")) {
                element.click();
            }
        }
    }

    /**
     * Click on Product item
     * @param index starts from 1 to the length of the list
     * @param action includes 'add' or 'remove'
     */
    public static void click_ProductItem(int index, String action) {
        String locator = "//div[@class='inventory_item']";
        List<WebElement> elementList = driver.findElements(By.xpath(locator));
        if (index > 0 && index <= elementList.size()) {
            WebElement element = driver.findElement(By.xpath(locator + "[" + index + "]//button"));
            String text = element.getText();
            if (action.equalsIgnoreCase("add") && text.equalsIgnoreCase("Add to cart")) {
                element.click();
            }
            if (action.equalsIgnoreCase("remove") && text.equalsIgnoreCase("Remove")) {
                element.click();
            }
        }
    }
}
