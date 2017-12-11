package com.marcapuestas.registration.stepdefs.marcapuestas;

import com.marcapuestas.registration.config.TestConfig;
import com.marcapuestas.registration.model.components.registration.RegistrationStep2;
import com.marcapuestas.registration.model.components.registration.RegistrationStep3;
import com.marcapuestas.registration.utils.StringUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class RegistrationForm3Steps {
    private RegistrationStep3 registrationForm;



    @Autowired
    public RegistrationForm3Steps(RegistrationStep3 registrationForm) {
        this.registrationForm = registrationForm;
        registrationForm.initializeElements();
    }

    @Then("^third step form is displayed$")
    public void thirdStepFormIsDisplayed() throws Throwable {
        Assert.assertTrue(registrationForm.isDisplayed());

    }

    @When("^user fills in username field$")
    public void userFillsInUsernameField() throws Throwable {
        registrationForm.getUsernameField().sendKeys(StringUtils.generateRandomUsername());

    }

    @And("^user fills in password field$")
    public void userFillsInPasswordField() throws Throwable {
        registrationForm.getPasswordField().sendKeys(StringUtils.generateRandomPassword());

    }

    @And("^user checks terms checkbox$")
    public void userChecksTermsCheckbox() throws Throwable {
        registrationForm.getTermsCheckBox().click();

    }

    @And("^user clicks on Create Account button$")
    public void userClicksOnCreateAccountButton() throws Throwable {
        registrationForm.getContinueButton().click();
    }

}
