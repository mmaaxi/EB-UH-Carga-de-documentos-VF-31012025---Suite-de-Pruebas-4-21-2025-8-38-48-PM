package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("I upload a PDF file with embedded metadata")
    public void i_upload_a_pdf_with_metadata() {
        page.uploadPDFWithMetadata();
    }

    @When("the system detects and extracts the relevant metadata")
    public void system_detects_and_extracts_metadata() {
        Assert.assertTrue(page.isMetadataExtracted());
    }

    @Then("the extracted metadata should be displayed in the user interface")
    public void extracted_metadata_displayed_in_ui() {
        Assert.assertTrue(page.isMetadataDisplayedInUI());
    }

    @Then("the metadata should be updated in the database")
    public void metadata_updated_in_database() {
        Assert.assertTrue(page.isMetadataUpdatedInDatabase());
    }
}