package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {

    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By documentUploadInput = By.id("documentUploadInput");
    By successMessage = By.id("successMessage");
    By duplicateErrorMessage = By.id("duplicateErrorMessage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public void uploadDocument(String filePath) {
        WebElement uploadElement = driver.findElement(documentUploadInput);
        uploadElement.sendKeys(filePath);
        driver.findElement(uploadButton).click();
    }
    
    public boolean isDocumentUploadedSuccessfully() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isDuplicateDocumentMessageDisplayed() {
        return driver.findElement(duplicateErrorMessage).isDisplayed();
    }
}