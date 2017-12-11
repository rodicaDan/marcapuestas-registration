package com.marcapuestas.registration.stepdefs.marcapuestas;

import com.marcapuestas.registration.config.TestConfig;
import com.marcapuestas.registration.model.components.registration.PaymentDetails;
import com.marcapuestas.registration.utils.CreditCardNumberGenerator;
import com.marcapuestas.registration.utils.StringUtils;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = TestConfig.class)
public class PaymentDetailsSteps {

    private PaymentDetails paymentDetails;

    @Autowired
    public PaymentDetailsSteps(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
        paymentDetails.initializeElements();
    }

    @Then("^payment details form is displayed$")
    public void paymentDetailsFormIsDisplayed() throws Throwable {
        paymentDetails.waitForIFrameToLoad(By.name("addCardScIframe"));
        Assert.assertTrue(paymentDetails.waitElementToBePresent(paymentDetails.getContinueButton()).isDisplayed());
    }

    @When("^user fills in credit card number$")
    public void userFillsInCreditCardNumber() throws Throwable {
        paymentDetails.getCardNumber().sendKeys(CreditCardNumberGenerator.generateMasterCardNumber());
    }

    @When("^user fills in expriry month field$")
    public void userFillsInExpriryMonthField() throws Throwable {
        paymentDetails.getExpiryMonth().sendKeys(StringUtils.generateRandomMonth());

    }

    @And("^user fills in expiry year field$")
    public void userFillsInExpiryYearField() throws Throwable {
        paymentDetails.getExpiryYear().sendKeys("2020");

    }
}
