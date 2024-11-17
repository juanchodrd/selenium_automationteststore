package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {

    private WebDriver driver;
    private WebDriverWait wait;

    public ElementActions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Método para hacer clic en un elemento usando un locator `By`
    public void click(By locator) {
        WebElement element = waitForElementToBeClickable(locator);
        element.click();
    }

    // Método para escribir texto en un campo de texto usando un locator `By`
    public void sendKeys(By locator, String text) {
        WebElement element = waitForElementToBeClickable(locator);  // Espera y obtiene el elemento aquí
        element.clear();
        element.sendKeys(text);
    }

    // Métodos de espera

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Método de scroll a un elemento
    public void scrollToElement(By locator) {
        waitForElementToBeVisible(locator);  // Espera primero
        WebElement element = driver.findElement(locator);  // Define el elemento después de la espera
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
