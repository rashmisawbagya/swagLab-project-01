package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagUI {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        WebElement username_txt = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement password_txt = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));

        username_txt.sendKeys("standard_user");
        password_txt.sendKeys("secret_sauce");
        login_btn.click();

        WebElement addtocard_btn = driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
        WebElement addtocardicon_btn = driver.findElement(By.className("shopping_cart_link"));
        addtocard_btn.click();
//        Thread.sleep(2000);
        addtocardicon_btn.click();
        Thread.sleep(3000);
        WebElement checkout_btn = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
        checkout_btn.click();
        Thread.sleep(5000);

        WebElement firstname_txt = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        WebElement lastname_txt = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        WebElement postalcode_txt = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        WebElement continu_btn = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
        firstname_txt.sendKeys("Rashmi");
        lastname_txt.sendKeys("sawbagya");
        postalcode_txt.sendKeys("80000");
        Thread.sleep(3000);
        continu_btn.click();


        WebElement finish_btn = driver.findElement(By.xpath("//*[@id=\"finish\"]"));
        finish_btn.click();
        Thread.sleep(3000);

        WebElement backhome_btn = driver.findElement(By.xpath("//*[@id=\"back-to-products\"]"));
        backhome_btn.click();
        Thread.sleep(3000);









    }
}
