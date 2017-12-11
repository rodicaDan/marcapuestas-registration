#"Step 1" form:
  # click on continue button with all fields empty = > check error messages
  # fill them in with incorrect data and check error messages
  # fill all data correctly and click on continue - user should be taken to step 2
  # when in step 2, click on the button corresponding to step 1=> check step 1 is displayed with data filled in.Ability:
  # when in step 1 and not all fields are filled in with valid data, check that step circle buttons 2 and 3 don't work.

  #"Step 2" form:
  # click on continue button with all fields empty = > check error messages
  # fill them in with incorrect data and check error messages
  # fill all data correctly and click on continue - user should be taken to step 2
  # when in step 2, click on the button corresponding to step 1=> check step 1 is displayed with data filled in.Ability:
  # when in step 1 and not all fields are filled in with valid data, check that step circle button 3 don't work. but step 1 button works.

@registration-form-tests

Feature: Check that the elements of the first step in the registratin form are displayec properly

  Background: User is on the marcapuestas page
    Given user opens MARCAPUESTAS website under test
    And correct page url should be displayed

  @10-euros-offer-form-ui
  Scenario: Check that registration form elements are displayed correctly.
    When user clicks on the 10 euros regsistration offer image
    Then registration form should be displayed
    And correct form title is displayed
    And correct form subtitle is displayed
    And correct citizenship label is displayed
    And correct citizenship field is displayed correctly
    And DNI field is displayed correctly
    And female gender button is displayed
    And male gender button is displayed
    And male gender button is "" selected
    And female gender button is "not" selected
    And First Name field is displayed correctly
    And First Last Name field is displayed correctly
    And Second Last Name field is displayed correctly
    And birthday label is displayed correctly
    And Day field is displayed correctly
    And Month field is displayed correctly
    And Year field is displayed correctly
    And Continue button is displayed correctly
    And form footer image location is correct
    And ten euros offer image location is correct


#
#    Then username field is displayed
#    And password field is displayed
#    And Remember Me checkbox is displayed
#    And Forgotten Password link is displayed
#    And a Login button is displayed
#    And registration offer with euros is displayed
#    And registration offer for casino is displayed
#    And registrqation offer for double first deposit is displayed

  @casino-offer-form-ui
  Scenario: Check that registration form elements are displayed correctly when casino offer registration form is open.
    When user clicks on the casino offer registration
    Then registration form should be displayed
    And correct form title is displayed
    And correct form subtitle is displayed
    And correct citizenship label is displayed
    And correct citizenship field is displayed correctly
    And DNI field is displayed correctly
    And female gender button is displayed
    And male gender button is displayed
    And male gender button is "" selected
    And female gender button is "not" selected
    And First Name field is displayed correctly
    And First Last Name field is displayed correctly
    And Second Last Name field is displayed correctly
    And birthday label is displayed correctly
    And Day field is displayed correctly
    And Month field is displayed correctly
    And Year field is displayed correctly
    And Continue button is displayed correctly
    And form footer image location is correct
    And casino offer image location is correct

  @double-offer-form-ui
  Scenario: Check that registration form elements are displayed correctly when casino offer registration form is open.
    When user clicks on the double deposit offer registration
    Then registration form should be displayed
    And correct form title is displayed
    And correct form subtitle is displayed
    And correct citizenship label is displayed
    And correct citizenship field is displayed correctly
    And DNI field is displayed correctly
    And female gender button is displayed
    And male gender button is displayed
    And male gender button is "" selected
    And female gender button is "not" selected
    And First Name field is displayed correctly
    And First Last Name field is displayed correctly
    And Second Last Name field is displayed correctly
    And birthday label is displayed correctly
    And Day field is displayed correctly
    And Month field is displayed correctly
    And Year field is displayed correctly
    And Continue button is displayed correctly
    And form footer image location is correct
    And double deposit offer image location is correct

  @10-euros-offer-form-
  Scenario: Check that registration form elements are displayed correctly.
    When user clicks on the 10 euros regsistration offer image
    Then registration form should be displayed
    And correct form title is displayed
    And correct form subtitle is displayed
    And correct citizenship label is displayed
    And DNI field is displayed correctly

