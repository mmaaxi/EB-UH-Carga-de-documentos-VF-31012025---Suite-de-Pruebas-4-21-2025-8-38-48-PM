package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;

    private By uploadInput = By.id("file-upload"); 
    private By uploadButton = By.id("upload-button");
    private By errorMessage = By.id("error-message");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectInvalidFile() {
        WebElement uploadInputElement = driver.findElement(uploadInput);
        uploadInputElement.sendKeys("/path/to/invalid-file.txt");
    }

    public boolean isUploadEnabled() {
        return driver.findElement(uploadButton).isEnabled();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}