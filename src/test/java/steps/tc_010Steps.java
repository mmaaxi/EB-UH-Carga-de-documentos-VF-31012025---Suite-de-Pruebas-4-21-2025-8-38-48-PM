package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {
    
    tc_010Page page = new tc_010Page();

    @Given("el usuario tiene varios archivos PDF listos para cargar")
    public void readyToLoadMultiplePDFs() {
        // Configuración inicial si es necesaria
    }

    @When("el usuario inicia la carga de los archivos PDF en diferentes pestañas")
    public void initiateConcurrentUpload() {
        page.openNewTabForUpload("file1.pdf");
        page.openNewTabForUpload("file2.pdf");
        // Repetir según necesidad
    }

    @Then("el sistema debe permitir la carga concurrente sin afectar el rendimiento general")
    public void verifyConcurrentUploadPerformance() {
        assertTrue(page.isSystemPerformanceStable());
    }

    @Then("verificar que cada carga se realice correctamente con barras de progreso separadas")
    public void verifyIndividualProgressBars() {
        assertTrue(page.isProgressDisplayedSeparately());
    }

    @Then("mostrar mensajes de confirmación individuales para cada documento")
    public void verifyIndividualConfirmationMessages() {
        assertTrue(page.areConfirmationMessagesDisplayed());
    }
}