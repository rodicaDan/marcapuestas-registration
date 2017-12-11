Feature: Check that using valid data, new user can create a MARCAPUESTAS account

  #test with DNI format: test NIE, NIF, CIF

  Background: User is on the marcapuestas page
    Given user opens MARCAPUESTAS website under test
    And correct page url should be displayed

  @10-euros-offer-registration
  Scenario: Check that registration form elements are displayed correctly.
    When user clicks on the 10 euros regsistration offer image
    Then registration form should be displayed
    When user fills in DNI field with valid "NIF" format
    And User fills in first name
    And user fills in first last name
    And user fills in second last name
    And user selects female gender
    And user selected birth day
    And user selects birth month
    And user selects birth year
    And user clicks on Continue button in first step
    Then second step form is displayed

    When user fills in phone number
    And user fills in email address
    And user fills in physical address
    And user fills in country region field
    And user fills in city field
    And user fills in post code field
    And user clicks on Continue button in second step

    Then third step form is displayed
    When user fills in username field
    And user fills in password field
    #And user checks terms checkbox
    And user clicks on Create Account button
    Then cashier form is displayed
    When user clicks to accept promotion
    Then payment details form is displayed
    When user fills in credit card number
    When user fills in expriry month field
    And user fills in expiry year field





