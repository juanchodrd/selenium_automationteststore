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
        // Verificar y llenar cada campo directamente
        String firstName = datosPersonales.get("First Name");
        String lastName = datosPersonales.get("Last Name");
        String email = datosPersonales.get("E-Mail");
        String telephone = datosPersonales.get("Telephone");
        String fax = datosPersonales.get("Fax");

        if (firstName != null) {
            elementActions.sendKeys(firstNameInput, firstName);
        }
        if (lastName != null) {
            driver.findElement(lastNameInput).clear();
            driver.findElement(lastNameInput).sendKeys(lastName);
        }
        if (email != null) {
            driver.findElement(emailInput).clear();
            driver.findElement(emailInput).sendKeys(email);
        }
        if (telephone != null) {
            driver.findElement(telephoneInput).clear();
            driver.findElement(telephoneInput).sendKeys(telephone);
        }
        if (fax != null) {
            driver.findElement(faxInput).clear();
            driver.findElement(faxInput).sendKeys(fax);
        }
    }

}
