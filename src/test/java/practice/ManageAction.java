package practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAction {

    WebDriver driver;
    @Test
    public void firstTest(){
        driver= new ChromeDriver();
        navigation("https://www.elgiganten.se/");
       // maximize();
       // minimize();
       // setPosition();
       //setIphoneDimention();
       // setIpadDimention();
        fullscreen();
    }

    private void fullscreen() {
    }

    private void setIpadDimention() {
        driver.manage().window().setSize(new Dimension(1024,1366));
    }

    private void setIphoneDimention() {
        driver.manage().window().setSize(new Dimension(430,932));
    }

    private void setPosition() {
        driver.manage().window().setPosition(new Point(100,200));
    }

    private void minimize() {
        driver.manage().window().minimize();
    }

    private void maximize() {
        driver.manage().window().maximize();
    }

    private void navigation(String url) {
        driver.navigate().to(url);
    }
}
