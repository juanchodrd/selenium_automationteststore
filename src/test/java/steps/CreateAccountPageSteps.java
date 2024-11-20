package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CreateAccountPage;
import utils.DataGenerator;
import utils.DriverManager;

import java.util.HashMap;
import java.util.Map;

public class CreateAccountPageSteps {
    private CreateAccountPage createAccountPage = new CreateAccountPage(DriverManager.getDriver());


    @And("ingreso mis datos personales")
    public void ingresoMisDatosPersonales() {
        Map<String, String> datosPersonales = new HashMap<>();

        // Generación automática de todos los campos
        datosPersonales.put("First Name", "");
        datosPersonales.put("Last Name", DataGenerator.generateRandomLastName());
        datosPersonales.put("E-Mail", DataGenerator.generateRandomEmail());
        datosPersonales.put("Telephone", DataGenerator.generateRandomPhone());
        datosPersonales.put("Fax", ""); // Fax opcional, puede ser vacío o generado si es necesario

        // Llama al método de la página para ingresar los datos
        createAccountPage.ingresarDatosPersonales(datosPersonales);
    }


    @And("ingreso mi dirección")
    public void ingresoMiDirección() {
    }

    @And("ingreso mis datos de inicio de sesión")
    public void ingresoMisDatosDeInicioDeSesión() {
    }

    @And("acepto la Política de Privacidad")
    public void aceptoLaPolíticaDePrivacidad() {
    }

    @And("selecciono la opción {string} para la suscripción al boletín")
    public void seleccionoLaOpciónParaLaSuscripciónAlBoletín(String arg0) {
    }

    @And("presiono el botón {string}")
    public void presionoElBotón(String arg0) {
    }

    @Then("veo el mensaje de confirmación de creación de cuenta")
    public void veoElMensajeDeConfirmaciónDeCreaciónDeCuenta() {
    }
}
