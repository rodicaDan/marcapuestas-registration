package com.marcapuestas.registration.model.pages;

import com.marcapuestas.registration.model.components.registration.RegistrationContainer;
import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import com.marcapuestas.registration.model.pages.abstracts.WebButton;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@lombok.Getter
@PropertySource( "classpath:application.properties" )
public class MarcaPuestasPage extends AbstractPage {

    private RegistrationContainer registrationContainer;


    @Value( "${marcapuestas.main.page.url}" )
    public String marcapuestasrUrl;

    public RegistrationContainer getRegistrationContainer() {
        return registrationContainer;
    }

    public String getMarcapuestasrUrl() {
        return marcapuestasrUrl;
    }

    public WebElement getUsername() {
        return username;
    }

    public  WebElement getPassword() {
        return password;
    }

    public  WebElement getLoginButton() {
        return loginButton;
    }
    public  String getLoginButtonLabel() {
        return loginButton.getAttribute("value");
    }

    public  WebElement getRememberMeCheckbox() {
        return rememberMeCheckbox;
    }

    public  String getRememberMeLabel() {
        return rememberMeCheckbox.getText();
    }

    public  WebElement getForgottenPasswordLink() {
        return forgottenPasswordLink;
    }

    public  String getForgottenPasswordLabel() {
        return forgottenPasswordLink.getText();
    }

    public  WebElement getRegistrationOfferWith10Euros() {
        return registrationOfferWith10Euros;
    }

    public  String getRegistrationOfferForCasinoLabel() {
        return registrationOfferForCasinoLabel.getText().replace("\n", " ");
    }

    public  WebElement getRegistrationOfferForCasinoButton() {
        return registrationOfferForCasinoButton;
    }

    public  WebElement getRegistrationOfferForDoubleDeposit() {
        return registrationOfferForDoubleDeposit;
    }

    public  WebElement getOpenFormLocator() {
        return openFormLocator;
    }

    @FindBy(css = "body div.login > input[name=\"login\"]")
    public static WebElement username;

    @FindBy(css = "body div.login > input[name=\"password\"]")
    public static WebElement password;

    @FindBy(css = "body div.login > input[name=\"commit\"]")
    public static WebElement loginButton;

    @FindBy(css = "body > header > nav > div.login > div.recordar_checkbox")
    public static WebElement rememberMeCheckbox;

    @FindBy(css = " body div.login-help > a")
    public static WebElement forgottenPasswordLink;

    @FindBy(css="#container-step3 > div.slide-content > div > div > img")
    public static WebElement registrationOfferWith10Euros;

    @FindBy(css = "#container-step2 > div > div > div > h1")
    public static WebElement registrationOfferForCasinoLabel;

    @FindBy(css = "#container-step2 > div > div > div > h1 > a")
    public static WebElement registrationOfferForCasinoButton;

    @FindBy(css = "#container-sports > div.slide-content > div")
    public static WebElement registrationOfferForDoubleDeposit;

    @FindBy(id="fb-register-popup-content")
    public static WebElement openFormLocator;

    @Autowired
    public MarcaPuestasPage( WebDriver webDriver ) {
        super( webDriver );
    }

    public void open() throws Exception {
        System.out.println("url to open: "+marcapuestasrUrl);
        super.open( marcapuestasrUrl, MarcaPuestasPage.class );
        //waitElementToBePresentByLocator(By.cssSelector("body > header a[title=\"Bienvenido a Marca Casino\"]"));
    }


    public void openRegistrationForOffer10Euros()  {
        waitForElementClickable( registrationOfferWith10Euros ).click();
    }

    public void openRegistrationForCasino()  {
        waitForElementClickable( registrationOfferForCasinoButton ).click();
    }

    public void openRegistrationForDoubleDepositOffer()  {
        waitForElementClickable( registrationOfferForDoubleDeposit ).click();
    }

    public boolean isRegistrationFormOpen() {
        return waitElementToBePresent(openFormLocator).isDisplayed();
    }


}
