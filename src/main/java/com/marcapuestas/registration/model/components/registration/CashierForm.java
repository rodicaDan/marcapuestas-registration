package com.marcapuestas.registration.model.components.registration;

import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CashierForm extends AbstractPage {

    private boolean isFrameSelected = false;

    @FindBy(css = "#regForm > div")
    public static WebElement cashierHeader;

    @FindBy(id="closeCashier")
    public static WebElement closeButton;

    @FindBy(css = " #popover-footer > img")
    public static WebElement footer;


    @FindBy(id="cashier-iframe")
    public static WebElement cashierFrame;

    @FindBy(css = "#view166 div.popup-modal__title.fn-popup-title")
    public static WebElement popupTitle;

    @FindBy(css = "#view166 div.fn-popup-loader.common-popup-loader > p")
    public static WebElement popupText;

    @FindBy(css = "#view166 div.fn-popup-loader.common-popup-loader > p > a")
    public static WebElement termsLink;

    @FindBy(css = "  #application span.popup-modal__button.fn-decline")
    public static WebElement rejectButton;

    @FindBy(css = "  #application span.popup-modal__button.fn-accept")
    public static WebElement acceptButton;

    @Autowired
    public CashierForm (WebDriver webDriver) {
        super(webDriver);
    }

    public void initializeElements() {
        PageFactory.initElements(getWebDriver(), CashierForm.class);
    }

    public  WebElement getCashierHeader() {
        return cashierHeader;
    }

    public  WebElement getCloseButton() {
        return closeButton;
    }

    public  WebElement getFooter() {
        return footer;
    }

    public  WebElement getCashierFrame() {
        return cashierFrame;
    }

    public  WebElement getPopupTitle() {
        return popupTitle;
    }

    public  WebElement getPopupText() {
        return popupText;
    }

    public static WebElement getTermsLink() {
        return termsLink;
    }

    public  WebElement getRejectButton() {
        return rejectButton;
    }

    public  WebElement getAcceptButton() {
        return acceptButton;
    }

    public boolean isDisplayed() {
        return cashierHeader.isDisplayed();
    }

    public void selectCashierFrame() {
        if (!isFrameSelected) {
            getWebDriver().switchTo().frame(cashierFrame);
            isFrameSelected = true;
        }
    }


}
