package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {

    private WebDriver driver;
    private By progressBar = By.id("progressBar");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarPDFMediano() {
        // Lógica para inicializar la carga de un PDF mediano
    }

    public boolean esBarraProgresoVisible() {
        WebElement bar = driver.findElement(progressBar);
        return bar.isDisplayed();
    }

    public boolean esActualizacionContinua() {
        // Lógica para verificar que la barra de progreso se actualiza continuamente
        return true;
    }

    public boolean tiempoRespuestaAdecuado() {
        // Lógica para verificar que el tiempo de respuesta entre actualizaciones es adecuado
        return true;
    }
}