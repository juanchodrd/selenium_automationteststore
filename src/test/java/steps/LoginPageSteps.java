package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverManager;

public class LoginPageSteps {
    private LoginPage loginpage = new LoginPage(DriverManager.getDriver());

    @Then("la url contiene login {string}")
    public void laUrlContieneLogin(String urlContain) {
        String actualUrl = loginpage.getCurrentUrl();
        Assert.assertTrue("La URL no contiene el texto esperado", actualUrl.contains(urlContain));
    }
}
