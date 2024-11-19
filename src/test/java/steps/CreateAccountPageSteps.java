package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CreateAccountPage;
import utils.DriverManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateAccountPageSteps {
    private CreateAccountPage createAccountPage = new CreateAccountPage(DriverManager.getDriver());

    @And("ingreso mis datos personales")
    public void ingresoMisDatosPersonales(List<Map<String, String>> datosPersonales) {
        // Crear un nuevo Map para organizar los datos correctamente
        Map<String, String> datosMap = new HashMap<>();
        for (Map<String, String> fila : datosPersonales) {
            datosMap.put(fila.get("campo"), fila.get("valor"));
        }

        // Imprimir el nuevo Map para verificar los datos
        System.out.println("Datos personales reestructurados: " + datosMap);

        // Pasar los datos al método de la página
        createAccountPage.ingresarDatosPersonales(datosMap);
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
