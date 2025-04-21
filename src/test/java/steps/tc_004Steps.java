package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_004Page;

public class tc_004Steps {
    private WebDriver driver;
    private tc_004Page tc_004Page;
    
    public tc_004Steps() {
        this.driver = Hooks.getDriver();
        tc_004Page = PageFactory.initElements(driver, tc_004Page.class);
    }

    @Given("que el usuario tiene un archivo PDF válido para cargar")
    public void usuarioConArchivoPdfValido() {
        tc_004Page.prepareValidPdf();
    }

    @When("el usuario inicia el proceso de carga")
    public void usuarioIniciaCarga() {
        tc_004Page.startUploadProcess();
    }

    @Then("el sistema comienza la carga del documento")
    public void sistemaComienzaCarga() {
        Assert.assertTrue(tc_004Page.isUploadInProgress());
    }

    @When("hay una interrupción en la red")
    public void interrupcionEnRed() {
        tc_004Page.simulateNetworkInterruption();
    }

    @Then("el sistema detecta la interrupción y pausa el proceso de carga")
    public void sistemaDetectaInterrupcionYPausaCarga() {
        Assert.assertTrue(tc_004Page.isUploadPaused());
    }

    @Then("se muestra un mensaje de error pertinente indicando fallo de red")
    public void muestraMensajeErrorPertinente() {
        Assert.assertTrue(tc_004Page.isNetworkErrorMessageDisplayed());
    }

    @Then("la carga se cancela o se reinicia")
    public void cargaCancelaOReinicia() {
        Assert.assertTrue(tc_004Page.isUploadCanceledOrRestarted());
    }
}