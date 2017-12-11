package com.marcapuestas.registration.model.components.registration;


import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentDetails extends AbstractPage {
    @FindBy(id="p_p_id_56_INSTANCE_vPA3yfzjGg1x_")
    public static WebElement selectPaymentMethod;

    @FindBy(id="cc_name_on_card")
    public static WebElement nameOnCardField;

    @FindBy(id="cc_card_number")
    public static WebElement cardNumber;

    @FindBy(id="cc_exp_month")
    public static WebElement expiryMonth;

    @FindBy(id="cc_exp_year")
    public static WebElement expiryYear;

    @FindBy(id="cc_cvv2")
    public static WebElement cvvCode;

    public  WebElement getSelectPaymentMethod() {
        return selectPaymentMethod;
    }

    public  WebElement getNameOnCardField() {
        return nameOnCardField;
    }

    public  WebElement getCardNumber() {
        return cardNumber;
    }

    public  WebElement getExpiryMonth() {
        return expiryMonth;
    }

    public  WebElement getExpiryYear() {
        return expiryYear;
    }

    public  WebElement getCvvCode() {
        return cvvCode;
    }

    public  WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy(id="continueButton")
    public static WebElement continueButton;

    @Autowired
    public PaymentDetails (WebDriver webDriver) {
        super(webDriver);
    }

    public void initializeElements() {
        PageFactory.initElements(getWebDriver(), PaymentDetails.class);
    }
}
