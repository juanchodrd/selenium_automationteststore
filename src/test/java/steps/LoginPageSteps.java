package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utils.ConfigFileReader;
import utils.DriverManager;

public class LoginPageSteps {
    private static ConfigFileReader configFileReader = new ConfigFileReader();
    private LoginPage loginpage = new LoginPage(DriverManager.getDriver());

    @Then("verifico que la url contiene login {string}")
    public void laUrlContieneLogin(String urlContain) {
        String actualUrl = loginpage.getCurrentUrl();
        Assert.assertTrue("La URL no contiene el texto esperado", actualUrl.contains(urlContain));
    }

    @And("en la pagina de login presiono el radio button register account")
    public void enLaPaginaDeLoginpresionoElRadioButtonRegisterAccount() {
        loginpage.selectRegisterAccount();
    }

    @And("luego presiono continue")
    public void presionoContinue() {
        loginpage.clickContinue();
    }

    @And("ingreso credenciales del usuario")
    public void ingresoElNombreDeUsuarioYLaClave() {
        String username = configFileReader.getUsername();
        String password = configFileReader.getPassword();
        loginpage.enterCredentials(username, password);
    }

    @And("presiono el boton de login")
    public void presionoElBotonDeLogin() {
        loginpage.selectLoginButton();
    }

    @Then("veo el mensaje de bienvenida")
    public void veoElMensajeDeBienvenida() {
        boolean loginExitoso = loginpage.validateSuccessLogin();
        Assert.assertTrue("El mensaje de bienvenida no es visible, el login ha fallado", loginExitoso);
    }
}
