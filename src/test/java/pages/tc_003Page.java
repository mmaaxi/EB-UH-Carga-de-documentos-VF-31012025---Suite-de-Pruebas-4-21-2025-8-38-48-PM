package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc_003Page {
    WebDriver driver;
    WebDriverWait wait;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void selectFileExceedingSizeLimit() {
        WebElement uploadInput = driver.findElement(By.id("file-upload"));
        uploadInput.sendKeys("/path/to/large/file.pdf");
    }

    public void uploadFile() {
        WebElement uploadButton = driver.findElement(By.id("upload-button"));
        uploadButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error-message")));
        return errorMessage.getText().contains("el archivo excede el tamaño permitido");
    }
}