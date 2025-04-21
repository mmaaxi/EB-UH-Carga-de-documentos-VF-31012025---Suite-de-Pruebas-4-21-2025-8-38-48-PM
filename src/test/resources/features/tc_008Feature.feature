Feature: Metadata Extraction

  Scenario: Validate automatic metadata extraction from document
    Given I upload a PDF file with embedded metadata
    When the system detects and extracts the relevant metadata
    Then the extracted metadata should be displayed in the user interface
    And the metadata should be updated in the database