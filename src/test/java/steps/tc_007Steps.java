package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {
    tc_007Page uploadPage = new tc_007Page();

    @Given("el usuario ha iniciado sesión y está en la página de carga de archivos")
    public void usuarioEnPaginaDeCarga() {
        uploadPage.navegarPaginaDeCarga();
    }

    @When("el usuario inicia la carga de un archivo PDF largo")
    public void iniciarCargaDeArchivo() {
        uploadPage.iniciarCargaDeArchivo();
    }

    @Then("el proceso de carga inicia mostrando la barra de progreso")
    public void verificarBarraDeProgreso() {
        Assert.assertTrue(uploadPage.verificarBarraDeProgreso());
    }

    @When("el usuario presiona el botón 'Cancelar Carga'")
    public void presionarBotonCancelar() {
        uploadPage.presionarBotonCancelar();
    }

    @Then("el sistema interrumpe el proceso de carga y muestra un mensaje confirmando la cancelación")
    public void verificarCancelacion() {
        Assert.assertTrue(uploadPage.verificarMensajeCancelacion());
    }

    @When("el archivo busca en el sistema")
    public void buscarArchivoEnSistema() {
        uploadPage.buscarArchivoEnSistema();
    }

    @Then("el archivo no debe quedar registrado en el sistema")
    public void verificarArchivoNoRegistrado() {
        Assert.assertFalse(uploadPage.estaArchivoRegistrado());
    }
    
    @Then("el sistema debe liberar cualquier recurso asignado")
    public void verificarLiberacionDeRecursos() {
        Assert.assertTrue(uploadPage.verificarLiberacionDeRecursos());
    }
}