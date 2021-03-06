package com.marcapuestas.registration.model.pages.abstracts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by rodicad on 21/09/2017.
 */
@Component
public abstract class AbstractPage {
    private static final long DEFAULT_TIMEWAIT = 10;
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }


    @Autowired
    public AbstractPage( WebDriver webDriver ) {
        this.webDriver = webDriver;
    }

    public void open (String url, Class instance) {
        webDriver.get( url );
        initElements(instance);
    }

    protected void waitForPageToLoad() {
        new WebDriverWait(webDriver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }

    public void initElements(Class instance) {
        PageFactory.initElements( webDriver, instance );
    }

    public String getPageTitle() {
        return webDriver.getTitle();
    }

    public WebElement waitForElementClickable(WebElement element) {
            return new WebDriverWait(webDriver, DEFAULT_TIMEWAIT)
                    .until( ExpectedConditions.elementToBeClickable(element));
        }

    public WebElement waitElementToBePresent(WebElement element) {
        return new WebDriverWait(webDriver, DEFAULT_TIMEWAIT).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitElementToBePresent(WebElement element, long timeout) {
        return new WebDriverWait(webDriver, timeout).until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitElementToBePresentByLocator(By locator) {
        return new WebDriverWait(webDriver, DEFAULT_TIMEWAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public WebElement waitElementToBePresentByLocator(By locator, long timeWait) {
        return new WebDriverWait(webDriver, timeWait).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public boolean isElementDisplayed(By locator) {
        return ExpectedConditions.invisibilityOfElementLocated(locator ).apply( webDriver );
    }

    public Object waitForIFrameToLoad(By locator) {
        return new WebDriverWait(webDriver, DEFAULT_TIMEWAIT).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
    }




}
