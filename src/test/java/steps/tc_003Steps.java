package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("el usuario selecciona un archivo PDF que excede el tamaño permitido")
    public void el_usuario_selecciona_un_archivo_pdf_que_excede_el_tamaño_permitido() {
        page.selectFileExceedingSizeLimit();
    }

    @When("el usuario intenta cargar el archivo")
    public void el_usuario_intenta_cargar_el_archivo() {
        page.uploadFile();
    }

    @Then("el sistema presenta un mensaje de error indicando tamaño excesivo del archivo")
    public void el_sistema_presenta_un_mensaje_de_error_indicando_tamaño_excesivo_del_archivo() {
        Assert.assertTrue(page.isErrorMessageDisplayed());
    }
}