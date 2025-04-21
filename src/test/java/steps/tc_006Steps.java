package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("El usuario inicia la carga de un documento PDF de tamaño mediano")
    public void iniciarCargaDePDF() {
        page.cargarPDFMediano();
    }

    @Then("El sistema debe mostrar una barra de progreso visible y actualizable")
    public void verificarBarraProgresoVisibleYActualizable() {
        Assert.assertTrue("La barra de progreso no es visible", page.esBarraProgresoVisible());
    }

    @Then("La barra de progreso debe actualizarse de forma continua")
    public void verificarActualizacionContinuaBarraProgreso() {
        Assert.assertTrue("La barra de progreso no se actualiza continuamente", page.esActualizacionContinua());
    }

    @Then("El tiempo de respuesta entre actualizaciones debe ser adecuado")
    public void verificarTiempoRespuestaAdecuado() {
        Assert.assertTrue("El tiempo de respuesta no es adecuado", page.tiempoRespuestaAdecuado());
    }
}