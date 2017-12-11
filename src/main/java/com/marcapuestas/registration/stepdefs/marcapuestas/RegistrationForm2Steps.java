package com.marcapuestas.registration.stepdefs.marcapuestas;

import com.marcapuestas.registration.config.TestConfig;
import com.marcapuestas.registration.model.components.registration.RegistrationFormImpl;
import com.marcapuestas.registration.model.components.registration.RegistrationStep2;
import com.marcapuestas.registration.stepdefs.expectedData.RegistrationFormValues;
import com.marcapuestas.registration.utils.StringUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.fail;

@ContextConfiguration(classes = TestConfig.class)
public class RegistrationForm2Steps {
    private RegistrationStep2 registrationForm;
    private static final String DEFAULT_EMAIL_ADDRESS = "test@playtech.com";
    private static final String DEFAULT_ADDRESS = "Calle Alcanada";
    private static final String DEFAULT_COUNRTY_REGION = "Andalucía";
    private static final String DEFAULT_CITY = "La Línea de la Concepcíon";
    private static final String DEFAULT_POST_CODE = "11300";





    @Autowired
    public RegistrationForm2Steps(RegistrationStep2 registrationForm) {
        this.registrationForm = registrationForm;
        registrationForm.initializeElements();
    }

    @Then("^second step form is displayed$")
    public void secondStepFormIsDisplayed() throws Throwable {
        Assert.assertTrue(registrationForm.waitElementToBePresent(registrationForm.getContinueButton()).isDisplayed());

    }


    @When("^user fills in phone number$")
    public void userFillsInPhoneNumber() throws Throwable {
        registrationForm.getPhoneField().sendKeys(StringUtils.generateRandomNumberAsString(9));
    }

    @And("^user fills in email address$")
    public void userFillsInEmailAddress() throws Throwable {
        registrationForm.getEmailField().sendKeys(DEFAULT_EMAIL_ADDRESS);

    }

    @And("^user fills in physical address$")
    public void userFillsInPhysicalAddress() throws Throwable {
        registrationForm.getAddressField().sendKeys(DEFAULT_ADDRESS);

    }

    @And("^user clicks on Continue button in second step$")
    public void userClicksOnContinueButtonInSecondStep() throws Throwable {
        registrationForm.getContinueButton().click();
    }

    @And("^user fills in country region field$")
    public void userFillsInCountryRegionField() throws Throwable {
        registrationForm.getCountryRegionField().sendKeys(DEFAULT_COUNRTY_REGION);

    }

    @And("^user fills in city field$")
    public void userFillsInCityField() throws Throwable {
        registrationForm.getCityField().sendKeys(DEFAULT_CITY);
    }

    @And("^user fills in post code field$")
    public void userFillsInPostCodeField() throws Throwable {
        registrationForm.getPostCodeField().sendKeys(DEFAULT_POST_CODE);

    }
}
