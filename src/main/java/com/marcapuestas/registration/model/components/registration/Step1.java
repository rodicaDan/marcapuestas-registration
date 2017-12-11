package com.marcapuestas.registration.model.components.registration;

import com.marcapuestas.registration.model.pages.abstracts.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;


public class Step1 extends AbstractPage {
    @FindBy(css = "#short_form_container  form[data-step=\"1\"] label[for=\"citizenship\"]")
    public static WebElement nationalityLabel;

    @FindBy(id="#citizenship")
    public static WebElement citizenship;

    @FindBy(id="#dni")
    public static WebElement dni;

    @FindBy(id="#firstname")
    public static WebElement firstName;

    @FindBy(css="#short_form_container span.gender-btn.gender-female")
    public static WebElement femaleGenderButton;

    @FindBy(css="#short_form_container span.gender-btn.gender-male")
    public static WebElement maleGenderButton;

    @FindBy(id="#firstlastname")
    public static WebElement firstLastName;

    @FindBy(id="#secondlastname")
    public static WebElement secondLastName;

    @FindBy(css = "#short_form_container  form[data-step=\"1\"]  label:nth-child(7)")
    public static WebElement birthdayLabel;


    @FindBy(how = How.CSS, using = "#short_form_container form[data-step=\"1\"] button[class=\"submit-form\"]")
    public static WebElement nextStepButton;

    @FindBy(id= "#offer-image")
    public static WebElement offerImage;

    @FindBy(id="popover-footer")
    public static WebElement popoverFooter;

    @Autowired
    public Step1( WebDriver webDriver ) {
        super (webDriver );
    }
}
