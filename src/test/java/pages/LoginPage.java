package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;

public class LoginPage {

    //Locators
    private By inputLoginName = By.id("loginFrm_loginname");
    private By inputPassword = By.id("loginFrm_password");
    private By btnLogin = By.cssSelector("button[title='Login']");
    private By welcomeMessage = By.xpath("//div[contains(text(), 'Welcome back')]");
    private By buttonContinue = By.cssSelector("button[title='Continue']");
    private By radioRegisterAccount = By.cssSelector("input[name='account'][value='register']");
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

    public void selectRegisterAccount() {
        driver.findElement(radioRegisterAccount).click();
    }

    public void clickContinue() {
        driver.findElement(buttonContinue).click();
    }

    public void enterCredentials(String user, String pass) {
        elementActions.sendKeys(inputLoginName, user);
        elementActions.sendKeys(inputPassword, pass);
    }

    public void selectLoginButton() {
        elementActions.click(btnLogin);
    }

    public boolean validateSuccessLogin() {
        try {
            // Espero a que el mensaje de bienvenida sea visible
            elementActions.waitForElementToBeVisible(welcomeMessage);
            return true; // Login fue exitoso si el elemento es visible
        } catch (TimeoutException e) {
            return false; // Si el elemento no aparece en el tiempo esperado, el login falló
        }
    }


}