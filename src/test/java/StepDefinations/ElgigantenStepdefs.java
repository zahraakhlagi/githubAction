package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElgigantenStepdefs {

    private WebDriver driver;
    private WebDriverWait wait;


    @Given("Open elgigantens page")
    public void openElgigantensPage() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        driver = new ChromeDriver(options); // <-- viktigt
        driver.get("https://www.elgiganten.se/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By okBtn = By.xpath("//*[@id='cookie-information-template-wrapper']//button[normalize-space()='OK']");
        wait.until(ExpectedConditions.elementToBeClickable(okBtn)).click();  // <-- klick!
    }
    @When("click on rea alternative")
    public void clickOnReaAlternative() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By reaLink = By.cssSelector("a[href='/kampanj/mellandagsrea']");
        wait.until(ExpectedConditions.elementToBeClickable(reaLink)).click();
    }


    @Then("rea page is open")
    public void reaPageIsOpen() {


    }


}
