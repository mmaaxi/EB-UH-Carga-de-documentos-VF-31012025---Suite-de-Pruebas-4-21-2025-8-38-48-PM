package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    By uploadInput = By.id("upload-input");
    By uploadButton = By.id("upload-button");
    By progressBar = By.id("progress-bar");
    By successMessage = By.id("success-message");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isValidFile(String fileName) {
        return fileName.endsWith(".pdf");
    }

    public void selectFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean isFileSelected() {
        WebElement element = driver.findElement(uploadInput);
        return element.getAttribute("value").contains(".pdf");
    }

    public boolean isUploadButtonEnabled() {
        return driver.findElement(uploadButton).isEnabled();
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploading() {
        // Implementation for checking if uploading has started
        return true; // replace with actual implementation
    }

    public boolean isProgressBarVisible() {
        return driver.findElement(progressBar).isDisplayed();
    }

    public boolean isUploadComplete() {
        WebElement bar = driver.findElement(progressBar);
        return bar.getAttribute("value").equals("100");
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}