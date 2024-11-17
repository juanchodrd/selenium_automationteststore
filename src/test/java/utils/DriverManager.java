package utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;

    public static void initialize() {
        if (driver == null) {
            driver = BrowserUtils.openBrowser();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void close() {
        if (driver != null) {
            BrowserUtils.closeBrowser(driver);
            driver = null;
        }
    }
}
