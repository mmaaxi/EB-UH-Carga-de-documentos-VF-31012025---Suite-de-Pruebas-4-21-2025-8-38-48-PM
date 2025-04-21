Feature: Document Upload

  Scenario: Validate correct PDF file upload
    Given I have a valid PDF file "document.pdf" on my local system
    When I select the valid PDF file
    Then I should see the selected file and the upload button should be enabled
    When I click the 'Upload Document' button
    Then the system should start the uploading process
    And I should see a progress bar indicating the upload status
    And the progress bar should update correctly to 100%
    Then I should see a success message confirming the document upload