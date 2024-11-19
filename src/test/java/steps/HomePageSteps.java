package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverManager;

public class HomePageSteps {
    private HomePage homePage = new HomePage(DriverManager.getDriver()); // Pasar el WebDriver desde DriverManager
    private LoginPage loginpage = new LoginPage(DriverManager.getDriver());

    @Given("que estoy en la home page")
    public void queEstoyEnLaHomePage() {
        homePage.goToHomePage();
    }


    @When("ingreso el texto {string} en el cuadro de busqueda")
    public void ingreso_un_texto_en_el_cuadro_de_busqueda(String textToSearch) {
        homePage.search(textToSearch);
    }

    @Then("se muestra {string} como resultado de la busqueda")
    public void se_muestran_resultados_de_la_busqueda(String textToSearch) {
        // Validar que el libro aparece en los resultados de búsqueda
        boolean isItemFound = homePage.isProductDisplayed(textToSearch);

        // Asegúrate de que el libro haya sido encontrado en los resultados
        Assert.assertTrue("El item '" + textToSearch + "' no se muestra en los resultados", isItemFound);
    }

    @Then("la url contiene automationteststore {string}")
    public void laUrlContieneAutomationteststore(String urlContain) {
        String actualUrl = homePage.getCurrentUrl();
        Assert.assertTrue("La URL no contiene el texto esperado", actualUrl.contains(urlContain));
    }

    @Then("presiono el boton de login or register")
    public void presionoElBotonDeLoginOrRegister() {
        homePage.goToLoginOrRegist();
    }

}
