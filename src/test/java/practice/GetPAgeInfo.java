package practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class GetPAgeInfo {
    WebDriver driver;

    @Test
    public void firstTest(){
        driver= new ChromeDriver();
        navigation("https://www.elgiganten.se/");
        maximize();
        //getCurrentUrll();
        //getSource();
       //getTitel();
        getWindowsHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        getWindowsHandle();
    }

    private void getWindowsHandle() {
        String windowHandle= driver.getWindowHandle();
        System.out.println(windowHandle);
    }

    private void getTitel() {
        String title= driver.getTitle();
        System.out.println(title);
    }

    private void getSource() {
        String source= driver.getPageSource();
        System.out.println(source);
    }

    private void getCurrentUrll() {
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
    }

    private void maximize() {
        driver.manage().window().maximize();
    }

    private void navigation(String url) {
        driver.navigate().to(url);
    }
}
