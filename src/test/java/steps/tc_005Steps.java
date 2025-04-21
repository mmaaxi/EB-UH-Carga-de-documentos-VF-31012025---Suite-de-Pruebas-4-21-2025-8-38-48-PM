package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page documentoPage = new tc_005Page();

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        documentoPage.openDocumentUploadPage();
    }

    @When("el usuario carga un archivo PDF válido")
    public void el_usuario_carga_un_archivo_PDF_válido() {
        documentoPage.uploadDocument("ruta/al/archivo/valido.pdf");
    }

    @Then("el documento se carga correctamente y se almacena en el sistema")
    public void el_documento_se_carga_correctamente_y_se_almacena_en_el_sistema() {
        Assert.assertTrue(documentoPage.isDocumentUploadedSuccessfully());
    }

    @When("el usuario intenta cargar nuevamente el mismo archivo PDF")
    public void el_usuario_intenta_cargar_nuevamente_el_mismo_archivo_PDF() {
        documentoPage.uploadDocument("ruta/al/archivo/valido.pdf");
    }

    @Then("el sistema detecta que el documento ya existe y muestra un mensaje de advertencia o error")
    public void el_sistema_detecta_que_el_documento_ya_existe_y_muestra_un_mensaje_de_advertencia_o_error() {
        Assert.assertTrue(documentoPage.isDuplicateDocumentMessageDisplayed());
    }
}