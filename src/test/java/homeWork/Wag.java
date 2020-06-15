package homeWork;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wag extends BaseTest{

    @Test
    public void TestWag() throws InterruptedException {

        WebElement bookWalkButton = driver.findElement(By.cssSelector(".sc-bxivhb.dmgvyV"));

        bookWalkButton.click();

        Thread.sleep(5000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys("elana@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.sendKeys("abdcf");

        WebElement firstName = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstName.sendKeys("Elena");

        WebElement lastName = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastName.sendKeys("Entsova");

        WebElement phone = driver.findElement(By.cssSelector("input[name=\"phone\"]"));

        phone.sendKeys("3045867394");





    }
}
