$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("marcapuestas/Step1Form.feature");
formatter.feature({
  "line": 3,
  "name": "Check that the elements of the first step in the registratin form are displayec properly",
  "description": "",
  "id": "check-that-the-elements-of-the-first-step-in-the-registratin-form-are-displayec-properly",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@registration-form-tests"
    }
  ]
});
formatter.before({
  "duration": 9149013,
  "status": "passed"
});
formatter.before({
  "duration": 177494,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User is on the marcapuestas page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "user opens MARCAPUESTAS website under test",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "correct page url should be displayed",
  "keyword": "And "
});
formatter.match({
  "location": "RegistrationPageSteps.openMarcaPuestasWebsite()"
});
formatter.result({
  "duration": 4593056426,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.correctPageUrlShouldBeDisplayed()"
});
formatter.result({
  "duration": 30150400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Check that registration form elements are displayed correctly.",
  "description": "",
  "id": "check-that-the-elements-of-the-first-step-in-the-registratin-form-are-displayec-properly;check-that-registration-form-elements-are-displayed-correctly.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@step1-invalid-data"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user clicks on the 10 euros regsistration offer image",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "registration form should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user selects DNI field",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user selects First Name field",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "DNI empty field message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user fills in DNI field with invalid format",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user selects First Name field",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "dni error message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user fills in DNI field with valid \"NIF\" format",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "dni error message is \"not\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user selects First Name field",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user selects First Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "first name empty field message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user fills in first name with invalid data",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user selects First Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "first name error message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "User fills in first name",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user selects First Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "first name error message is \"not\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user selects First Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user selects Second Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "first last name empty field message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "user fills in first last name with invalid value",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "user selects Second Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "first last name error message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "user fills in first last name",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "user selects Second Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "first last name error message is \"not\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "user selects Second Last Name field",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "user selects Birth Day field",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "second last name empty field message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 53,
  "name": "user fills in second last name with invalid value",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "user selects Birth Day field",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "second last name error message is \"\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user fills in second last name",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "user selects Birth Day field",
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "second last name error message is \"not\" displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "user clicks on Continue button",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "birthday missing info message is \"\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user selected birth day",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "user clicks on Continue button",
  "keyword": "When "
});
formatter.step({
  "line": 66,
  "name": "birthday missing info message is \"\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "user selects birth month",
  "keyword": "When "
});
formatter.step({
  "line": 69,
  "name": "user clicks on Continue button",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "birthday missing info message is \"\" displayed",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "user selects birth year",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "birthday missing info message is \"not\" displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationPageSteps.userClicksOnTheEurosRegsistrationOfferImage()"
});
formatter.result({
  "duration": 22145248427,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationPageSteps.registratioFormShouldBeDisplayed()"
});
formatter.result({
  "duration": 454050986,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsDNIField()"
});
formatter.result({
  "duration": 16720457386,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstNameField()"
});
formatter.result({
  "duration": 1095330987,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 28
    }
  ],
  "location": "RegistrationFormSteps.dniEmptyFieldMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 603147093,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInDNIFieldWithInvalidFormat()"
});
formatter.result({
  "duration": 30503743573,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstNameField()"
});
formatter.result({
  "duration": 1023813546,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 22
    }
  ],
  "location": "RegistrationFormSteps.dniErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 449550080,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NIF",
      "offset": 36
    }
  ],
  "location": "RegistrationFormSteps.userFillsInDNIFieldWithValidFormat(String)"
});
formatter.result({
  "duration": 45697965653,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "not",
      "offset": 22
    }
  ],
  "location": "RegistrationFormSteps.dniErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 434909440,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstNameField()"
});
formatter.result({
  "duration": 992739413,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstLastNameField()"
});
formatter.result({
  "duration": 1131791360,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 35
    }
  ],
  "location": "RegistrationFormSteps.firstNameEmptyFieldMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 594417920,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInFirstNameWithInvalidData()"
});
formatter.result({
  "duration": 5381413547,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstLastNameField()"
});
formatter.result({
  "duration": 997673386,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 29
    }
  ],
  "location": "RegistrationFormSteps.firstNameErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 451352320,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Por favor ingrese un nombre válido]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.marcapuestas.registration.stepdefs.marcapuestas.RegistrationFormSteps.firstNameErrorMessageIsDisplayed(RegistrationFormSteps.java:318)\r\n\tat ✽.Then first name error message is \"\" displayed(marcapuestas/Step1Form.feature:31)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInFirstName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstLastNameField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "not",
      "offset": 29
    }
  ],
  "location": "RegistrationFormSteps.firstNameErrorMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsFirstLastNameField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsSecondLastNameField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 40
    }
  ],
  "location": "RegistrationFormSteps.firstLastNameEmptyFieldMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInFirstLastNameWithInvalidValue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsSecondLastNameField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 34
    }
  ],
  "location": "RegistrationFormSteps.firstLastNameErrorMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInFirstLastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsSecondLastNameField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "not",
      "offset": 34
    }
  ],
  "location": "RegistrationFormSteps.firstLastNameErrorMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsSecondLastNameField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsBirthDayField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 41
    }
  ],
  "location": "RegistrationFormSteps.secondLastNameEmptyFieldMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInSecondLastNameWithInvalidValue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsBirthDayField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 35
    }
  ],
  "location": "RegistrationFormSteps.secondLastNameErrorMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userFillsInSecondLastName()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsBirthDayField()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "not",
      "offset": 35
    }
  ],
  "location": "RegistrationFormSteps.secondLastNameErrorMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userClicksOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 34
    }
  ],
  "location": "RegistrationFormSteps.birthdayMissingInfoMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectedBirthDay()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userClicksOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 34
    }
  ],
  "location": "RegistrationFormSteps.birthdayMissingInfoMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsBirthMonth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userClicksOnContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 34
    }
  ],
  "location": "RegistrationFormSteps.birthdayMissingInfoMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationFormSteps.userSelectsBirthYear()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "not",
      "offset": 34
    }
  ],
  "location": "RegistrationFormSteps.birthdayMissingInfoMessageIsDisplayed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("Check that registration form elements are displayed correctly.");
formatter.after({
  "duration": 852587520,
  "status": "passed"
});
});