package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHeroKuppApp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.partialLinkText("JavaScript onload")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        driver.findElement(By.linkText("Form Authentication")).click();

        driver.findElement(By.id("username")).sendKeys("Hellousername");
        driver.findElement(By.id("password")).sendKeys("Hellopassword");
        driver.findElement(By.className("radius")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
