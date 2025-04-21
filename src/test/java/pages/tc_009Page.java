package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {
    WebDriver driver;

    private By retryButtonBy = By.id("retry-btn");
    private By successMessageBy = By.id("success-message");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void simulatePdfLoadFailure() {
        // Lógica para simular un fallo en la carga
        // Por ejemplo, invocar un script del backend que simule el error
    }

    public boolean isRetryButtonVisible() {
        return driver.findElement(retryButtonBy).isDisplayed();
    }

    public void clickRetryButton() {
        WebElement retryButton = driver.findElement(retryButtonBy);
        retryButton.click();
    }

    public boolean isPdfLoadSuccessful() {
        return driver.findElement(successMessageBy).isDisplayed();
    }
}