package com.marcapuestas.registration.model.components.registration;

import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationStep3 extends AbstractPage {
    @FindBy(css = "#short_form_container div.step.step3")
    public static WebElement step3Form;

    @FindBy(id = "username")
    public static WebElement usernameField;

    @FindBy(id = "email")
    public static WebElement emailField;

    @FindBy(id = "password")
    public static WebElement passwordField;

    @FindBy(id = "terms")
    public static WebElement termsCheckBox;

    @FindBy(css = "#short_form_container div.step.step3 button[class=\"submit-form\"]")
    public static WebElement continueButton;

    @Autowired
    public RegistrationStep3(WebDriver webDriver) {
        super(webDriver);
    }
    public void initializeElements() {
        PageFactory.initElements(getWebDriver(), RegistrationStep3.class);
    }

    public boolean isDisplayed() {
        waitElementToBePresent(continueButton);
        return step3Form.getAttribute("class").contains("active");
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getTermsCheckBox() {
        return termsCheckBox;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
