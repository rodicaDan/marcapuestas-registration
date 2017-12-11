package com.marcapuestas.registration.stepdefs.marcapuestas;

import com.google.common.base.Verify;
import com.marcapuestas.registration.stepdefs.CommonSteps;
import com.marcapuestas.registration.stepdefs.expectedData.MarcaPuestasPageValues;
import com.marcapuestas.registration.stepdefs.expectedData.RegistrationFormValues;
import com.marcapuestas.registration.utils.StringUtils;
import com.marcapuestas.registration.config.TestConfig;
import com.marcapuestas.registration.model.components.registration.MakeDeposit;
import com.marcapuestas.registration.model.components.registration.RegistrationFormImpl;
import com.marcapuestas.registration.model.pages.MarcaPuestasPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Verifier;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;



import java.util.List;

@ContextConfiguration( classes = TestConfig.class )
public class RegistrationPageSteps {
    private static final int DEFAULT_STRING_LENGTH = 5;
    private boolean isCookieSet = false;
    private MarcaPuestasPage mainPage;
    private RegistrationFormImpl registrationForm;


    @Autowired
    public RegistrationPageSteps(MarcaPuestasPage mainPage, RegistrationFormImpl registrationForm) {
        this.mainPage= mainPage;
        this.registrationForm = registrationForm;
    }

    @Given( "^user opens MARCAPUESTAS website under test$" )
    public void openMarcaPuestasWebsite() throws Exception {
       mainPage.open();
       Thread.sleep(3000);

    }

    @Then( "^correct page url should be displayed$" )
    public void correctPageUrlShouldBeDisplayed() throws Throwable {
        Assert.assertEquals(MarcaPuestasPageValues.PAGE_TITLE, mainPage.getPageTitle());

    }



    @Then("^registration form should be open$")
    public void registrationFormShouldBeOpen() throws Throwable {
        Assert.assertTrue( mainPage.isRegistrationFormOpen() );
        registrationForm.initializeElements();
    }


    @When("^user registers with valid data$")
    public void userRegistersValidData(DataTable userInfo) throws Throwable {
        List<List<String>> data = userInfo.raw();
        String randomString = StringUtils.generateRandomString(DEFAULT_STRING_LENGTH);
        String randomNumber = StringUtils.generateRandomNumberAsString(DEFAULT_STRING_LENGTH);

        String firstName = data.get(0).get(0) + randomString;
        String lastName = data.get(0).get(1) + randomString;
        String randomUserName = data.get(0).get(10)+ randomString;
        String password = data.get(0).get(11)+ randomString;

        registrationForm.getFirstNameField().sendKeys(firstName);
        registrationForm.getFirstLastNameField().sendKeys(lastName);
        registrationForm.getDayOfBirthField().sendKeys(data.get(0).get(2));
        registrationForm.getMonthOfBirthField().sendKeys(data.get(0).get(3));
        registrationForm.getYearOfBirthField().sendKeys(data.get(0).get(4));


        if (isCookieSet) {
            String address = data.get(0).get(5) + randomString;
            String postCode = data.get(0).get(6) + randomNumber;
            String city = data.get(0).get(7) + randomString;
            String phone = data.get(0).get(9) + randomNumber;

        }

        registrationForm.getNextStepButton().click();

    }

//    @Then("^a deposit form should be displayed$")
//    public void aDepositFormShouldBeDisplayed() throws Throwable {
//        makeDepositForm.initializeElements();
//        Assert.assertEquals(RegistrationFormValues.DEPOSIT_FORM_TITLE, makeDepositForm.getTitle());
//    }
//
//    @When("^user fills in deposit form with valid data$")
//    public void userFillsInDepositFormWithValidData(DataTable cardDetails) throws Throwable {
//        List<List<String>> cardData = cardDetails.raw();
//        makeDepositForm.getCardNumberField().sendKeys(cardData.get(0).get(0));
//        makeDepositForm.getExpiryMonthField().sendKeys(cardData.get(0).get(1));
//        makeDepositForm.getExpiryYearField().sendKeys(cardData.get(0).get(2));
//        makeDepositForm.getCvvCodeField().sendKeys(cardData.get(0).get(3));
//        makeDepositForm.getContinueButton().click();
//    }

    @And("^cookie \"([^\"]*)\" is set$")
    public void cookieIsSet(String cookieInfo) throws Throwable {
        String[] cookieData = cookieInfo.split(",");
        mainPage.getWebDriver().manage().addCookie(new Cookie(cookieData[0], cookieData[1]));
        isCookieSet = true;

    }

    @And("^cookie \"([^\"]*)\" is deleted$")
    public void cookieIsDeleted(String cookieInfo) throws Throwable {
        String[] cookieData = cookieInfo.split(",");
        mainPage.getWebDriver().manage().deleteCookie(new Cookie(cookieData[0], cookieData[1]));
        isCookieSet = false;
    }

//    @Then("^deposit should finish successfully$")
//    public void depositShouldFinishSuccessfully() throws Throwable {
//        Assert.assertEquals(RegistrationFormValues.SUCCESFULL_DEPOSIT_LABEL,  makeDepositForm.waitElementToBePresent(makeDepositForm.getDepositResponse(),20).getText());
//        makeDepositForm.waitElementToBePresentByLocator(
//                By.cssSelector(
//                        "#application > div.page.fn-page.page--menu-children-contains > div.header.fn-header > div.fn-navigation-container.navigation-container.common-head > div.page-header.fn-header-container > div > div.main-header__common.main-header__common--desktop.common-top > div.col-md-9.common-top-controls > a.main-header__icon.main-header__icon--balance.common-icon-balance > span.main-header__balance-icon.micon-header-user-balance.common-icon"),50);
//    }

    @And("^username field is displayed$")
    public void usernameFieldIsDisplayed() {
        Assert.assertTrue (mainPage.getUsername().isDisplayed());
    }

    @And("^password field is displayed$")
    public void passwordFieldIsDisplayed() {
        Assert.assertTrue (mainPage.getPassword().isDisplayed());
    }

    @And("^Remember Me checkbox is displayed$")
    public void rememberMeCheckboxIsDisplayed() {

        Assert.assertTrue (mainPage.getRememberMeCheckbox().isDisplayed());
        Assert.assertEquals(MarcaPuestasPageValues.REMEMBER_ME_LABEL, mainPage.getRememberMeLabel());
    }

    @And("^Forgotten Password link is displayed$")
    public void forgottenPasswordLinkIsDisplayed() {
        Assert.assertTrue (mainPage.getForgottenPasswordLink().isDisplayed());
        Assert.assertEquals(MarcaPuestasPageValues.FORGOTTEN_PWD_LABEL, mainPage.getForgottenPasswordLabel());
    }

    @And("^a Login button is displayed$")
    public void aLoginButtonIsDisplayed()  {
        Assert.assertTrue (mainPage.getLoginButton().isDisplayed());
        Assert.assertEquals(MarcaPuestasPageValues.LOGIN_BUTTON_LABEL, mainPage.getLoginButtonLabel());
    }

    @And("^registration offer with euros is displayed$")
    public void registrationOfferWithEurosIsDisplayed()  {
        Assert.assertTrue (mainPage.getRegistrationOfferWith10Euros().isDisplayed());
    }

    @And("^registration offer for casino is displayed$")
    public void registrationOfferForCasinoIsDisplayed()  {
        Assert.assertTrue (mainPage.getRegistrationOfferForCasinoButton().isDisplayed());
        Assert.assertEquals (MarcaPuestasPageValues.CASINO_OFFER_LABEL, mainPage.getRegistrationOfferForCasinoLabel());
    }

    @And("^registrqation offer for double first deposit is displayed$")
    public void registrqationOfferForDoubleFirstDepositIsDisplayed() throws Throwable {
        Assert.assertTrue (mainPage.getRegistrationOfferForDoubleDeposit().isDisplayed());

    }

    @When("^user clicks on the 10 euros regsistration offer image$")
    public void userClicksOnTheEurosRegsistrationOfferImage() throws Throwable {
        mainPage.getRegistrationOfferWith10Euros().click();
        Thread.sleep(2000);
    }

    @Then("^registration form should be displayed$")
    public void registratioFormShouldBeDisplayed() throws Throwable {
        Assert.assertTrue (mainPage.isRegistrationFormOpen());

    }

    @When("^user clicks on the casino offer registration$")
    public void userClicksOnTheCasinoOfferRegistration() throws Throwable {
        mainPage.getRegistrationOfferForCasinoButton().click();

    }

    @When("^user clicks on the double deposit offer registration$")
    public void userClicksOnTheDoubleDepositOfferRegistration() throws Throwable {
        mainPage.getRegistrationOfferForDoubleDeposit().click();
    }


}
