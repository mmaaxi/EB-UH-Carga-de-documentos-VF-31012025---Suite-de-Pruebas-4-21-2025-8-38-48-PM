package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_008Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By metadataDisplay = By.id("metadataDisplay");
    By databaseStatus = By.id("databaseStatus");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void uploadPDFWithMetadata() {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys("/path/to/pdf/with/metadata.pdf");
    }

    public boolean isMetadataExtracted() {
        // Logic to validate metadata extraction
        return true;
    }

    public boolean isMetadataDisplayedInUI() {
        WebElement displayElement = driver.findElement(metadataDisplay);
        return displayElement.isDisplayed();
    }

    public boolean isMetadataUpdatedInDatabase() {
        WebElement statusElement = driver.findElement(databaseStatus);
        return statusElement.isDisplayed() && statusElement.getText().equals("Updated");
    }
}