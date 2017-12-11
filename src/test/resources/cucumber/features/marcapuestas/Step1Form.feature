@registration-form-tests

Feature: Check that the elements of the first step in the registratin form are displayec properly

  Background: User is on the marcapuestas page
    Given user opens MARCAPUESTAS website under test
    And correct page url should be displayed

  @step1-invalid-data
  Scenario: Check that registration form elements are displayed correctly.
    When user clicks on the 10 euros regsistration offer image
    Then registration form should be displayed

    When user selects DNI field
    Then user selects First Name field
    Then DNI empty field message is "" displayed

    When user fills in DNI field with invalid format
    When user selects First Name field
    Then dni error message is "" displayed

    When user fills in DNI field with valid "NIF" format
    Then dni error message is "not" displayed

    When user selects First Name field
    When user selects First Last Name field
    Then first name empty field message is "" displayed

    When user fills in first name with invalid data
    When user selects First Last Name field
    Then first name error message is "" displayed

    When User fills in first name
    When user selects First Last Name field
    Then first name error message is "not" displayed

    When user selects First Last Name field
    When user selects Second Last Name field
    Then first last name empty field message is "" displayed

    When user fills in first last name with invalid value
    When user selects Second Last Name field
    Then first last name error message is "" displayed

    When user fills in first last name
    When user selects Second Last Name field
    Then first last name error message is "not" displayed

    When user selects Second Last Name field
    When user selects Birth Day field
    Then second last name empty field message is "" displayed

    When user fills in second last name with invalid value
    When user selects Birth Day field
    Then second last name error message is "" displayed

    When user fills in second last name
    When user selects Birth Day field
    Then second last name error message is "not" displayed

    When user clicks on Continue button
    And birthday missing info message is "" displayed

    When user selected birth day
    When user clicks on Continue button
    And birthday missing info message is "" displayed

    When user selects birth month
    When user clicks on Continue button
    And birthday missing info message is "" displayed
  
  When user selects birth year
  Then birthday missing info message is "not" displayed


