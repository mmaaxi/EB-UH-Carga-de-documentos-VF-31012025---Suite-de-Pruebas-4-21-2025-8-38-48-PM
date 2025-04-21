package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("que la primera carga de un documento PDF falla")
    public void que_primera_carga_de_un_documento_pdf_falla() {
        page.simulatePdfLoadFailure();
        Assert.assertTrue("Opción para reintentar carga no visible", page.isRetryButtonVisible());
    }

    @When("el usuario presiona el botón de 'Reintentar carga'")
    public void el_usuario_presiona_el_boton_de_reintentar_carga() {
        page.clickRetryButton();
    }

    @Then("el sistema reanuda o reinicia el proceso de carga y se completa correctamente")
    public void el_sistema_reanuda_o_reinicia_el_proceso_de_carga_y_se_completa_correctamente() {
        Assert.assertTrue("La carga del PDF no se completó correctamente", page.isPdfLoadSuccessful());
    }
}