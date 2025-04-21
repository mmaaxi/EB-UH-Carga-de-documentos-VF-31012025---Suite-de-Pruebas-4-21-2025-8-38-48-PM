package steps;

import pages.tc_002Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un archivo en formato no válido")
    public void elUsuarioSeleccionaUnArchivoEnFormatoNoValido() {
        page.selectInvalidFile();
    }

    @Then("el sistema detecta el formato no válido y deshabilita la carga")
    public void elSistemaDetectaElFormatoNoValidoYDeshabilitaLaCarga() {
        assertFalse(page.isUploadEnabled());
    }

    @When("el usuario intenta presionar el botón \"Cargar documento\"")
    public void elUsuarioIntentaPresionarElBotonCargarDocumento() {
        page.clickUploadButton();
    }

    @Then("el sistema no permite la carga y muestra un mensaje de error indicando el formato incorrecto")
    public void elSistemaNoPermiteLaCargaYMuestraUnMensajeDeErrorIndicandoElFormatoIncorrecto() {
        assertEquals("Formato de archivo no permitido", page.getErrorMessage());
    }
}