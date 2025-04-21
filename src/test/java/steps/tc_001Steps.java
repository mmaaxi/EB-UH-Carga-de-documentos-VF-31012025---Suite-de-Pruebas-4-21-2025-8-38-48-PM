package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("I have a valid PDF file {string} on my local system")
    public void i_have_a_valid_pdf_file_on_my_local_system(String fileName) {
        assertTrue(page.isValidFile(fileName));
    }

    @When("I select the valid PDF file")
    public void i_select_the_valid_pdf_file() {
        page.selectFile("path/to/document.pdf");
    }

    @Then("I should see the selected file and the upload button should be enabled")
    public void i_should_see_the_selected_file_and_the_upload_button_should_be_enabled() {
        assertTrue(page.isFileSelected());
        assertTrue(page.isUploadButtonEnabled());
    }

    @When("I click the 'Upload Document' button")
    public void i_click_the_upload_document_button() {
        page.clickUploadButton();
    }

    @Then("the system should start the uploading process")
    public void the_system_should_start_the_uploading_process() {
        assertTrue(page.isUploading());
    }

    @Then("I should see a progress bar indicating the upload status")
    public void i_should_see_a_progress_bar_indicating_the_upload_status() {
        assertTrue(page.isProgressBarVisible());
    }

    @Then("the progress bar should update correctly to 100%")
    public void the_progress_bar_should_update_correctly_to_100() {
        assertTrue(page.isUploadComplete());
    }

    @Then("I should see a success message confirming the document upload")
    public void i_should_see_a_success_message_confirming_the_document_upload() {
        assertTrue(page.isSuccessMessageDisplayed());
    }
}