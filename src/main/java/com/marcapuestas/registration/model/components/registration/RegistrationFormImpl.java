package com.marcapuestas.registration.model.components.registration;

import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Rodicad on 24/09/2017.
 */

@Component
public class RegistrationFormImpl extends AbstractPage {

    @FindBy(id = "fb-reg-title")
    public static WebElement title;

    @FindBy(id = "fb-reg-subtitle")
    public static WebElement subtitle;

    @FindBy(css = "#popover-footer > img")
    public static WebElement footerImage;

    @FindBy(id = "offer-image")
    public static WebElement promotionImage;

    @FindBy(how = How.CSS, using = "#short_form_container div.step.step1.active label[for=\"citizenship\"]")
    public static WebElement citizenshipLabel;

    @FindBy(id = "citizenship")
    public static WebElement citizenshipField;
    private static final String CITIZENSHIP_VALUE_SCRIPT = "return document.querySelector('#citizenship').value";

    @FindBy(id = "dni")
    public static WebElement dniField;
    private static final String DNI_VALUE_SCRIPT = "return document.querySelector('#dni').value";

    @FindBy(id = "firstname")
    public static WebElement firstNameField;
    private static final String FIRST_NAME_VALUE_SCRIPT = "return document.querySelector('#firstname').value";

    @FindBy(how = How.CSS, using = " #short_form_container  div.step.step1.active span.gender-btn.gender-male")
    public static WebElement maleGenderButton;

    @FindBy(how = How.CSS, using = " #short_form_container  div.step.step1.active span.gender-btn.gender-female")
    public static WebElement femaleGenderButton;

    @FindBy(id = "firstlastname")
    public static WebElement firstLastNameField;
    private static final String FIRST_LAST_NAME_VALUE_SCRIPT = "return document.querySelector('#firstlastname').value";

    @FindBy(id = "secondlastName")
    public static WebElement secondLastNameField;
    private static final String SECOND_LAST_NAME_VALUE_SCRIPT = "return document.querySelector('#secondlastName').value";

    @FindBy(how = How.CSS, using = "  #short_form_container div.step.step1.active > form > label:nth-child(7)")
    public static WebElement birthdayLabel;

    @FindBy(id = "day")
    public static WebElement dayOfBirthField;
    private Map<String,WebElement> dayOptions;
    private static final String DAY_VALUE_SCRIPT = "return document.querySelector('#day').value";

    @FindBy(id = "month")
    public static WebElement monthOfBirthField;
    private Map<String,WebElement> monthOptions;
    private static final String MONTH_VALUE_SCRIPT = "return document.querySelector('#month').value";

    @FindBy(id = "year")
    public static WebElement yearOfBirthField;
    private Map<String,WebElement> yearOptions;
    private static final String YEAR_VALUE_SCRIPT = "return document.querySelector('#year').value";

    @FindBy(how = How.CSS, using = "#short_form_container button[type=\"submit\"]")
    public static WebElement continueButton;

    public String getTitle() {
        return title.getText();
    }

    public String getSubTitle() {
        return subtitle.getText();
    }

    public String getCitizenshipLabel() {
        return citizenshipLabel.getText();
    }

    public String getCitizenshipValue() {
        String countryCode = (String) ((JavascriptExecutor) getWebDriver()).executeScript(CITIZENSHIP_VALUE_SCRIPT);
        return citizenshipField.findElement(By.cssSelector("option[value="+countryCode+"]")).getText();
    }

    public WebElement getDNIField() {
        return dniField;
    }

    public String getDNIErrorMessage() {
        return getErrorMessageForField(dniField);
    }

    public String getFirstNameError() {
        return getErrorMessageForField(firstNameField);
    }

    public String getFirstNameInfoMessage() {
        return getInfoMessageForField(firstNameField);
    }
    public String getFirstLastNameError() {
        return getErrorMessageForField(firstLastNameField);
    }

    public String getSecondLastNameError() {
        return getErrorMessageForField(secondLastNameField);
    }

    public String getSecondLastNameInfoMessage() {
        return getInfoMessageForField(secondLastNameField);
    }

    public String getBirthdayError() {
        return getErrorMessageForField(getDayOfBirthField());
    }

    public String getBirthdayInfoMessage() {
        return getInfoMessageForField(dayOfBirthField);
    }

    private String getErrorMessageForField(WebElement field) {
        WebElement parentField =  field.findElement(By.xpath("./.."));
        return parentField.findElement(By.cssSelector("span.info")).getText();
    }

    public String getDNIInfoMessage() {
        return getInfoMessageForField ( dniField );
    }

    private String getInfoMessageForField(WebElement field) {
        WebElement parent = field.findElement(By.xpath("./.."));
        if (parent.findElements(By.cssSelector("p.personal-info")).size() == 0) {
            return "";
        }
        return parent.findElement(By.cssSelector("p.personal-info")).getText();
    }

    public String getDNIHolder() {
        return dniField.getAttribute("placeholder");
    }

    public String getDNIValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(DNI_VALUE_SCRIPT);
    }


    public WebElement getFirstNameField() {
        return firstNameField;
    }

    public String getFirstNameHolder() {
        return firstNameField.getAttribute("placeholder");
    }

    public String getFirstnameValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(FIRST_NAME_VALUE_SCRIPT);
    }

    public String getFirstLastNameInfoMessage() {
        return getInfoMessageForField(firstLastNameField);
    }

    public WebElement getMaleGenderButton() {
        return femaleGenderButton;
    }

    public boolean isMaleButtonSelected() {
        return maleGenderButton.getAttribute("class").contains("active");
    }

    public void clickOnMaleButton() {
        maleGenderButton.click();
    }

    public WebElement getFemaleGenderButton() {
        return femaleGenderButton;
    }

    public boolean isFemaleButtonSelected() {
        return femaleGenderButton.getAttribute("class").contains("active");
    }

    public void clickOnFemaleButton() {
        femaleGenderButton.click();
    }

    public WebElement getFirstLastNameField() {
        return firstLastNameField;
    }

    public String getFirstLastNamePlaceHolder() {
        return firstLastNameField.getAttribute("placeholder");
    }

    public String getFirstLastNameValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(FIRST_LAST_NAME_VALUE_SCRIPT);
    }

    public WebElement getSecondLastNameField() {
        return secondLastNameField;
    }

    public String getSecondlastNamePlaceHolder() {
        return secondLastNameField.getAttribute("placeholder");
    }

    public String getSecondLastNameValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(SECOND_LAST_NAME_VALUE_SCRIPT);
    }

    public String getBirthdayLabel() {
        return birthdayLabel.getText();
    }

    public WebElement getDayOfBirthField() {
        return dayOfBirthField;
    }

    public Map<String, WebElement> getDaySelectionOptions() {
        return dayOptions;
    }

    public String getSelectedDayValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(DAY_VALUE_SCRIPT);
    }

    public Map<String, WebElement> getMonthOptions() {
        return monthOptions;
    }

    public String getSelectedMonthValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(MONTH_VALUE_SCRIPT);
    }

    public Map<String, WebElement> getYearOptions() {
        return yearOptions;
    }

    public String getSelectedYearValue() {
        return (String) ((JavascriptExecutor) getWebDriver()).executeScript(YEAR_VALUE_SCRIPT);
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public String getContinueButtonLabel() {
        return continueButton.getText();
    }

    public WebElement getFooterImage() {
        return footerImage;
    }

    public String getFooterImageLocation() {
        return footerImage.getAttribute("src");
    }

    public WebElement getPromotionImage() {
        return promotionImage;
    }

    public String getPromotionImageLocation() {
        return promotionImage.getAttribute("src");
    }



    @Autowired
    public RegistrationFormImpl(WebDriver webDriver) {
        super(webDriver);
    }

    public void initializeElements() {
        PageFactory.initElements(getWebDriver(), RegistrationFormImpl.class);
        buildDaySelectionOptions();
        buidMonthSelectionOptions();
        buildYearSelectionOptions();
    }

    private void buildDaySelectionOptions() {
        dayOptions = new LinkedHashMap<>();
        List<WebElement> days = dayOfBirthField.findElements(By.tagName("option"));
        for (WebElement day: days) {
            dayOptions.put(day.getText(), day);
        }
    }

    private void buidMonthSelectionOptions() {
        monthOptions = new LinkedHashMap<>();
        List<WebElement> months = monthOfBirthField.findElements(By.tagName("option"));
        for (WebElement month: months) {
            monthOptions.put(month.getText(), month);
        }
    }

    private void buildYearSelectionOptions() {
        yearOptions = new LinkedHashMap<>();
        List<WebElement> years = yearOfBirthField.findElements(By.tagName("option"));
        for (WebElement year: years) {
            yearOptions.put(year.getText(), year);
        }
    }


    public WebElement getMonthOfBirthField() {
        return monthOfBirthField;
    }
    public WebElement getYearOfBirthField() {
        return yearOfBirthField;
    }
    public WebElement getNextStepButton() {
        return continueButton;
    }







}