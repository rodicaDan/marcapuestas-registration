@registration-page-tests

Feature: Check that the elements of the registration page from marcapuestas.es are displayed correctly

  Background: User is on the marcapuestas page
    Given user opens MARCAPUESTAS website under test
    And correct page url should be displayed

  @page-elements-UI
  Scenario: Check that page elements are displayed correctly.
    Then username field is displayed
    And password field is displayed
    And Remember Me checkbox is displayed
    And Forgotten Password link is displayed
    And a Login button is displayed
    And registration offer with euros is displayed
    And registration offer for casino is displayed
    And registrqation offer for double first deposit is displayed

  @open-registration-form-offer1
  Scenario: Check that clicking on the 10 euros registration offer opens the registration form.
    When user clicks on the 10 euros regsistration offer image
    Then registration form should be displayed

  @open-registration-form-casino-offer
  Scenario: Check that page elements are displayed correctly.
    When user clicks on the casino offer registration
    Then registration form should be displayed

  @open-registration-form-double-deposit-offer
  Scenario: Check that page elements are displayed correctly.
    When user clicks on the double deposit offer registration
    Then registration form should be displayed


  #Chedk the header nav bar MARCAPUESTAS link??


  #Check regsitration form step 1 fields are displayed - header, fields, buttons, footer




#
#
#
# @registration_fields
#  Scenario: Print url
#    When I open MARCAPUESTAS website under test
#    Then correct page url should be displayed
#    When user clicks on registration button
#    Then registration form should be open
#    When user registers with valid data
#      | Ana | Dana | 01 | 01 | 1980 | strada Cepei | 11315 | Cluj | test@playtech.com | 645876555 | testAccount | testPssword |
#    Then a deposit form should be displayed
#    When user fills in deposit form with valid data
#      | 4265037583286897 | 03 | 2019 | 218 |
#    Then deposit should finish successfully
#
#
#
#  @register_with_no_cookie
#  Scenario: Print url
#    When I open website under test
#    Then correct page url should be displayed
#    And cookie "_flow2,1" is deleted
#    When user clicks on registration button
#    Then registration form should be open
#    When user registers with valid data
#      | Ana | Dana | 01 | 01 | 1980 | strada Cepei | 11315 | Cluj | test@playtech.com | 645876555 | testAccount | testPssword |
#    Then a deposit form should be displayed
#    When user fills in deposit form with valid data
#      | 4265032684276897 | 04 | 2019 | 338 |
#    Then deposit should finish successfully
#
#    #extra test 1
#
#
#
