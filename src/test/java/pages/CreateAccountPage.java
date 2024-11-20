package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementActions;

import java.util.Map;

public class CreateAccountPage {

    private WebDriver driver;
    private ElementActions elementActions;

    // Definir localizadores usando `By`
    private By firstNameInput = By.id("AccountFrm_firstname");
    private By lastNameInput = By.id("AccountFrm_lastname");
    private By emailInput = By.id("AccountFrm_email");
    private By telephoneInput = By.id("AccountFrm_telephone");
    private By faxInput = By.id("AccountFrm_fax");

    // Constructor para inicializar el driver
    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        this.elementActions = new ElementActions(driver);  // Inicializamos elementActions
    }

    public void ingresarDatosPersonales(Map<String, String> datosPersonales) {
        driver.findElement(firstNameInput).sendKeys(datosPersonales.get("First Name"));
        driver.findElement(lastNameInput).sendKeys(datosPersonales.get("Last Name"));
        driver.findElement(emailInput).sendKeys(datosPersonales.get("E-Mail"));
        driver.findElement(telephoneInput).sendKeys(datosPersonales.get("Telephone"));
        driver.findElement(faxInput).sendKeys(datosPersonales.get("Fax"));
    }


}
