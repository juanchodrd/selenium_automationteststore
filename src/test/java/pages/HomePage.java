package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import utils.ElementActions;

import java.util.List;

public class HomePage {

    //Locators
    private By searchBox = By.id("filter_keyword");
    private By productResults = By.cssSelector(".col-md-3 .prdocutname"); // Lista de productos
    private By singleProductTitle = By.cssSelector("#product_details .productname span"); // Título en la página de detalles del producto
    private By loginButton = By.cssSelector("#customernav .main_menu a[href*='account/login']");

    private WebDriver driver;
    private ElementActions elementActions;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementActions = new ElementActions(driver);  // Inicializamos elementActions
    }

    // Método ingresar a url
    public void goToHomePage() {
        driver.get("https://automationteststore.com/");
    }

    // Método para obtener la URL actual
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // Método para buscar texto usando ElementActions
    public void search(String text) {
        elementActions.waitForElementToBeClickable(searchBox);
        driver.findElement(searchBox).sendKeys(text);
        driver.findElement(searchBox).sendKeys(Keys.RETURN);
    }

    public boolean isProductDisplayed(String productName) {
        // Verifica si estamos en la página de detalles de un único producto
        List<WebElement> singleProductElements = driver.findElements(singleProductTitle);
        if (!singleProductElements.isEmpty()) {
            // Si hay un único producto, compara el título
            String title = singleProductElements.get(0).getText();
            return title.equalsIgnoreCase(productName);
        }

        // Si no es un único producto, busca en la lista de productos
        List<WebElement> productLinks = driver.findElements(productResults);
        for (WebElement productLink : productLinks) {
            if (productLink.getText().equalsIgnoreCase(productName)) {
                return true;  // Producto encontrado en la lista de resultados
            }
        }

        return false;  // Producto no encontrado
    }

    public void goToLoginAndRegist(){
        driver.findElement(loginButton).click();
    }

}
