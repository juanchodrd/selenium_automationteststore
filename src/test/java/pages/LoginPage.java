package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ElementActions;

import java.util.List;

public class LoginPage {

    //Locators
    private By searchBox = By.cssSelector("input[aria-label='search']");


    private WebDriver driver;
    private ElementActions elementActions;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.elementActions = new ElementActions(driver);  // Inicializamos elementActions
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}