package com.marcapuestas.registration.stepdefs.marcapuestas;

import com.marcapuestas.registration.config.TestConfig;
import com.marcapuestas.registration.model.components.registration.CashierForm;
import com.marcapuestas.registration.model.components.registration.RegistrationStep3;
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
public class CashierFormSteps {
    private CashierForm cashierForm;

    @Autowired
    public CashierFormSteps(CashierForm cashierForm) {
        this.cashierForm = cashierForm;
        cashierForm.initializeElements();
    }

    @Then("^cashier form is displayed$")
        public void cashierFormIsDisplayed() throws Throwable {
        cashierForm.waitForIFrameToLoad(By.id("cashier-iframe"));
        Assert.assertTrue (cashierForm.waitElementToBePresent(cashierForm.getAcceptButton()).isDisplayed());
    }

    @When("^user clicks to accept promotion$")
    public void userClicksToAcceptPromotion() throws Throwable {
        cashierForm.getAcceptButton().click();


    }
}
