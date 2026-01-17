package practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAction {

    WebDriver driver;
    @Test
    public void firstTest(){
        driver= new ChromeDriver();
       // driver.get("file:///C:/Users/akhla/Downloads/Register/Register.html");
        navigation("file:///C:/Users/akhla/Downloads/Register/Register.html");
        navigateBack();
        navogateForward();
        navigateRefresh();

    }

    private void navigateRefresh() {
        driver.navigate().refresh();
    }

    private void navogateForward() {
        driver.navigate().forward();
    }

    private void navigateBack() {
        driver.navigate().back();
    }

    private void navigation(String url) {
        driver.navigate().to(url);
    }


}


