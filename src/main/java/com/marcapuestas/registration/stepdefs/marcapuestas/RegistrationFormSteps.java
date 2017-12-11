package com.marcapuestas.registration.stepdefs.marcapuestas;

import com.marcapuestas.registration.config.TestConfig;
import com.marcapuestas.registration.config.driver.WebDriverProperties;
import com.marcapuestas.registration.model.components.registration.RegistrationFormImpl;
import com.marcapuestas.registration.stepdefs.expectedData.ExpectedErrors;
import com.marcapuestas.registration.stepdefs.expectedData.RegistrationFormValues;
import com.marcapuestas.registration.utils.StringUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.fail;

@ContextConfiguration(classes = TestConfig.class)
@Slf4j
public class RegistrationFormSteps {
    private static final Logger LOG = LoggerFactory.getLogger( WebDriverProperties.class );

    private RegistrationFormImpl registrationForm;
    private static final String INVALID_DNI_VALUE = "123000";
    private static final String ONE_CHAR_NAME_VALUE = "A";


    @Autowired
    public RegistrationFormSteps(RegistrationFormImpl registrationForm) {
        this.registrationForm = registrationForm;
        registrationForm.initializeElements();
    }


    @And("^correct form title is displayed$")
    public void correctFormTitleIsDisplayed() {
        Assert.assertEquals(RegistrationFormValues.TITLE, registrationForm.getTitle());
    }

    @And("^correct form subtitle is displayed$")
    public void correctFormSubtitleIsDisplayed() {
        Assert.assertEquals(RegistrationFormValues.SUBTITLE, registrationForm.getSubTitle());

    }

    @And("^correct citizenship label is displayed$")
    public void correctCitizenshipLabelIsDisplayed() {
        Assert.assertEquals(RegistrationFormValues.CITIZENSHIP_LABEL, registrationForm.getCitizenshipLabel());
    }

    @And("^DNI field is displayed correctly$")
    public void dniFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getDNIField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.DNI_HOLDER, registrationForm.getDNIHolder());
        Assert.assertTrue(registrationForm.getDNIValue().equals(""));
    }

    @And("^female gender button is displayed$")
    public void femaleGenderButtonIsDisplayed() {
        Assert.assertTrue(registrationForm.getFemaleGenderButton().isDisplayed());

    }

    @And("^male gender button is displayed$")
    public void maleGenderButtonIsDisplayed() {
        Assert.assertTrue(registrationForm.getMaleGenderButton().isDisplayed());
    }


    @And("^female gender button is \"([^\"]*)\" selected$")
    public void femaleGenderButtonIsSelected(String selected) {
        if (selected.equals("not")) {
            Assert.assertFalse(registrationForm.isFemaleButtonSelected());
        } else {
            Assert.assertTrue(registrationForm.isFemaleButtonSelected());
        }
    }

    @And("^male gender button is \"([^\"]*)\" selected$")
    public void maleGenderButtonIsSelected(String selected) {
        if (selected.equals("not")) {
            Assert.assertFalse(registrationForm.isMaleButtonSelected());
        } else {
            Assert.assertTrue(registrationForm.isMaleButtonSelected());
        }
    }

    @And("^First Name field is displayed correctly$")
    public void firstNameFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getFirstNameField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.FIRST_NAME_HOLDER, registrationForm.getFirstNameHolder());
        Assert.assertTrue(registrationForm.getFirstnameValue().equals(""));
    }

    @And("^First Last Name field is displayed correctly$")
    public void firstLastNameFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getFirstLastNameField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.FIRST_LAST_NAME_HOLDER, registrationForm.getFirstLastNamePlaceHolder());
        Assert.assertTrue(registrationForm.getFirstLastNameValue().equals(""));
    }

    @And("^Second Last Name field is displayed correctly$")
    public void secondLastNameFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getSecondLastNameField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.SECOND_LAST_NAME_HOLDER, registrationForm.getSecondlastNamePlaceHolder());
        Assert.assertTrue(registrationForm.getSecondLastNameValue().equals(""));
    }

    @And("^birthday label is displayed correctly$")
    public void birthdayLabelIsDisplayedCorrectly() {
        Assert.assertEquals(RegistrationFormValues.DATE_OF_BIRTH_LABEL, registrationForm.getBirthdayLabel());
    }

    @And("^Day field is displayed correctly$")
    public void dayFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getDayOfBirthField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.DAY_HOLDER, registrationForm.getDaySelectionOptions().get("Día").getText());
        Assert.assertEquals(RegistrationFormValues.DAYS_OPTIONS, registrationForm.getDaySelectionOptions().keySet());
    }

    @And("^Year field is displayed correctly$")
    public void yearFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getYearOfBirthField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.YEAR_HOLDER, registrationForm.getYearOptions().get("AÑO").getText());
        Assert.assertEquals(RegistrationFormValues.YEAR_OPTIONS, registrationForm.getYearOptions().keySet());
    }

    @And("^Month field is displayed correctly$")
    public void monthFieldIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getMonthOfBirthField().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.MONTH_HOLDER, registrationForm.getMonthOptions().get("Mes").getText());
        Assert.assertEquals(RegistrationFormValues.MONTH_OPTIONS, registrationForm.getMonthOptions().keySet());
    }

    @And("^Continue button is displayed correctly$")
    public void continueButtonIsDisplayedCorrectly() {
        Assert.assertTrue(registrationForm.getContinueButton().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.CONTINUE_BUTTON_LABEL, registrationForm.getContinueButtonLabel());

    }

    @And("^form footer image location is correct$")
    public void formFooterImageLocationIsCorrect() {
        Assert.assertTrue(registrationForm.getFooterImage().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.FOOTER_IMG_LOCATION, registrationForm.getFooterImageLocation());
    }

    @And("^ten euros offer image location is correct$")
    public void tenEurosOfferImageLocationIsCorrect() {
        Assert.assertTrue(registrationForm.getPromotionImage().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.TEN_EUROS_OFFER_IMG_LOCATION, registrationForm.getPromotionImageLocation());
    }

    @And("^casino offer image location is correct$")
    public void casinoOfferImageLocationIsCorrect() {
        Assert.assertTrue(registrationForm.getPromotionImage().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.CASINO_OFFER_IMG_LOCATION, registrationForm.getPromotionImageLocation());
    }

    @And("^double deposit offer image location is correct$")
    public void doubleDepositOfferImageLocationIsCorrect() {
        Assert.assertTrue(registrationForm.getPromotionImage().isDisplayed());
        Assert.assertEquals(RegistrationFormValues.DOUBLE_DEPOSIT_OFFER_IMG_LOCATION, registrationForm.getPromotionImageLocation());
    }

    @And("^correct citizenship field is displayed correctly$")
    public void correctCitizenshipFieldIsDisplayedCorrectly() {
        Assert.assertEquals(RegistrationFormValues.CITIZENSHIP_PLACEHOLDER, registrationForm.getCitizenshipValue());
    }

    @When("^user fills in DNI field with valid \"([^\"]*)\" format$")
    public void userFillsInDNIFieldWithValidFormat(String dniType) throws Throwable {
        String dni = "";

        if (dniType.equals("NIE")) {
            dni = StringUtils.generateRandomNIENumber();
        } else if (dniType.equals("CIF")) {
            dni = StringUtils.generateRandomCIFNumber();
        } else if (dniType.equals("NIF")) {
            dni = StringUtils.generateRandomNIFNumber();
        } else {
            fail("DNI of type " + dniType + " not available!");
        }

        LOG.info("{} generated: {}",dniType,dni);
        registrationForm.getDNIField().clear();
        registrationForm.getDNIField().sendKeys(dni);

    }

    @And("^User fills in first name$")
    public void userFillsInFirstName() throws Throwable {
        registrationForm.getFirstNameField().sendKeys(StringUtils.generateRandomName());

    }

    @And("^user fills in first last name$")
    public void userFillsInFirstLastName() throws Throwable {
        registrationForm.getFirstLastNameField().sendKeys(StringUtils.generateRandomName());
    }

    @And("^user fills in second last name$")
    public void userFillsInSecondLastName() throws Throwable {
        registrationForm.getSecondLastNameField().sendKeys(StringUtils.generateRandomName());
    }

    @And("^user selected birth day$")
    public void userSelectedBirthDay() {
        registrationForm.getDayOfBirthField().sendKeys(StringUtils.generateRandomDayOfMonth());
    }

    @And("^user selects birth month$")
    public void userSelectsBirthMonth() throws Throwable {
        registrationForm.getMonthOfBirthField().sendKeys(StringUtils.generateRandomMonth());

    }

    @And("^user selects birth year$")
    public void userSelectsBirthYear() throws Throwable {
        registrationForm.getYearOfBirthField().sendKeys(StringUtils.generateRandomBirthYear());
    }

    @And("^user selects female gender$")
    public void userSelectsFemaleGender() {
        registrationForm.getFemaleGenderButton().click();
    }

    @And("^user clicks on Continue button$")
    public void userClicksOnContinueButton() throws Throwable {
        registrationForm.getContinueButton().click();

    }


    @And("^user clicks on Continue button in first step$")
    public void userClicksOnContinueButtonInFirstStep() throws Throwable {
        registrationForm.getContinueButton().click();

    }

    @Then("^dni error message is \"([^\"]*)\" displayed$")
    public void dniErrorMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("",registrationForm.getDNIErrorMessage());
        } else {
            Assert.assertEquals(ExpectedErrors.DNI_ERROR_MESSAGE,registrationForm.getDNIErrorMessage());
        }
    }

    @When("^user fills in DNI field with invalid format$")
    public void userFillsInDNIFieldWithInvalidFormat() throws Throwable {
        registrationForm.getDNIField().sendKeys(INVALID_DNI_VALUE);

    }

    @When("^user selects DNI field$")
    public void userSelectsDNIField() throws Throwable {
        registrationForm.getDNIField().click();

    }

    @When("^user selects First Name field$")
    public void userSelectsFirstNameField() throws Throwable {
        registrationForm.getFirstNameField().click();
    }

    @When("^user selects First Last Name field$")
    public void userSelectsFirstLastNameField() throws Throwable {
        registrationForm.getFirstLastNameField().click();

    }

    @Then("^first name empty field message is \"([^\"]*)\" displayed$")
    public void firstNameEmptyFieldMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("" , registrationForm.getFirstNameInfoMessage());
        } else {
            Assert.assertEquals(ExpectedErrors.EMPTY_FIELD_MESSAGE, registrationForm.getFirstNameInfoMessage());
        }
    }

    @Then("^first last name empty field message is \"([^\"]*)\" displayed$")
    public void firstLastNameEmptyFieldMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getFirstLastNameInfoMessage());
        } else {
            Assert.assertEquals(ExpectedErrors.EMPTY_FIELD_MESSAGE, registrationForm.getFirstLastNameInfoMessage());
        }
    }

    @Then("^DNI empty field message is \"([^\"]*)\" displayed$")
    public void dniEmptyFieldMessageIsDisplayed(String displayed)  {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getDNIInfoMessage());
        } else {
            Assert.assertEquals(ExpectedErrors.EMPTY_FIELD_MESSAGE, registrationForm.getDNIInfoMessage());

        }


    }

    @When("^user fills in first name with invalid data$")
    public void userFillsInFirstNameWithInvalidData() throws Throwable {
        registrationForm.getFirstNameField().sendKeys(ONE_CHAR_NAME_VALUE);

    }

    @Then("^first name error message is \"([^\"]*)\" displayed$")
    public void firstNameErrorMessageIsDisplayed(String displayed)  {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getFirstNameError());
        } else {
            Assert.assertEquals(ExpectedErrors.FIRST_NAME_ERROR_MESSAGE, registrationForm.getFirstNameError());
        }
    }

    @When("^user selects Second Last Name field$")
    public void userSelectsSecondLastNameField() throws Throwable {
        registrationForm.getSecondLastNameField().click();

    }

    @When("^user selects Birth Day field$")
    public void userSelectsBirthDayField() throws Throwable {
        registrationForm.getDayOfBirthField().click();

    }

    @When("^user fills in first last name with invalid value$")
    public void userFillsInFirstLastNameWithInvalidValue() throws Throwable {
        registrationForm.getFirstLastNameField().sendKeys(ONE_CHAR_NAME_VALUE);

    }

    @Then("^first last name error message is \"([^\"]*)\" displayed$")
    public void firstLastNameErrorMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getFirstLastNameError());
        } else {
            Assert.assertEquals(ExpectedErrors.LAST_NAMES_ERROR_MESSAGE, registrationForm.getFirstLastNameError());
        }

    }

    @And("^second last name empty field message is \"([^\"]*)\" displayed$")
    public void secondLastNameEmptyFieldMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getSecondLastNameInfoMessage());
        } else {
            Assert.assertEquals(ExpectedErrors.EMPTY_FIELD_MESSAGE, registrationForm.getSecondLastNameInfoMessage());
        }
    }

    @And("^birthday missing info message is \"([^\"]*)\" displayed$")
    public void birthdayMissingInfoMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getBirthdayInfoMessage());
        } else {
            Assert.assertEquals(ExpectedErrors.EMPTY_FIELD_MESSAGE, registrationForm.getBirthdayInfoMessage());
        }
    }


    @When("^user fills in second last name with invalid value$")
    public void userFillsInSecondLastNameWithInvalidValue() throws Throwable {
        registrationForm.getSecondLastNameField().clear();
        registrationForm.getSecondLastNameField().sendKeys(ONE_CHAR_NAME_VALUE);

    }

    @Then("^second last name error message is \"([^\"]*)\" displayed$")
    public void secondLastNameErrorMessageIsDisplayed(String displayed) throws Throwable {
        if (displayed.equals("not")) {
            Assert.assertEquals("", registrationForm.getSecondLastNameError());
        } else {
            Assert.assertEquals(ExpectedErrors.LAST_NAMES_ERROR_MESSAGE, registrationForm.getSecondLastNameError());
        }
    }
}
