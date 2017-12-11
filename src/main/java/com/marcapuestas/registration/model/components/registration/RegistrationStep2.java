package com.marcapuestas.registration.model.components.registration;

import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationStep2 extends AbstractPage {
    @FindBy(css = "#short_form_container div.step.step2")
    public static WebElement step2Form;

    @FindBy(css = "#short_form_container div.step.step2.active div[class=\"flag-container\"]")
    public static WebElement flagContainerField;

    @FindBy(id = "phone")
    public static WebElement phoneField;

    @FindBy(id = "email")
    public static WebElement emailField;

    @FindBy(id = "address")
    public static WebElement addressField;


    @FindBy(id = "taxResidenceRegion")
    public static WebElement taxResidenceRegionField;

    @FindBy(id = "form-city")
    public static WebElement cityField;

    @FindBy(id = "form-zip")
    public static WebElement postCodeField;

    @FindBy(id = "username")
    public static WebElement usernameField;

    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(css = "#short_form_container div.step.step2 button[class=\"submit-form\"]")
    public static WebElement continueButton;

    @Autowired
    public RegistrationStep2 (WebDriver webDriver) {
        super(webDriver);
    }
    public void initializeElements() {
        PageFactory.initElements(getWebDriver(), RegistrationStep2.class);
    }

    public boolean isDisplayed() {
        waitElementToBePresent(continueButton);
        return step2Form.getAttribute("class").contains("active");
    }

    public WebElement getAddressField() {
        return addressField;
    }

    public WebElement getCountryRegionField() {
        return taxResidenceRegionField;
    }

    public  WebElement getPostCodeField() {
        return postCodeField;
    }

    public  WebElement getCityField() {
        return cityField;
    }

    public  WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPhoneField() {
        return phoneField;
    }


    public WebElement getContinueButton() {
        return continueButton;
    }

    public String getContinueButtonLabel() {
        return continueButton.getText();
    }


}
