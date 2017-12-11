package com.marcapuestas.registration.config.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class BrowserDriverInit  {


    private WebDriverProperties webDriverProperties;

    @Autowired
    public BrowserDriverInit(WebDriverProperties webDriverProperties) {
        this.webDriverProperties = webDriverProperties;

    }

    @Bean
    public WebDriver webDriver(){
        WebDriver driver = null;
        if (webDriverProperties.getBrowserType().equals("chrome")) {
            driver = initChromeDriver();
        } else if (webDriverProperties.getBrowserType().equals("firefox")){
            driver = initFirefoxDriver();
        } else if (webDriverProperties.getBrowserType().equals("ie")){
            driver = initIEDriver();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(webDriverProperties.getBrowserResolution());

        return driver;
    }

    private WebDriver initChromeDriver() {
        webDriverProperties.setChromeBinaryProperty();
        return new ChromeDriver();
    }

    private WebDriver initIEDriver() {
        webDriverProperties.setIEBinaryProperty();
        InternetExplorerOptions ieOptions = new InternetExplorerOptions();
        ieOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ieOptions.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "www.google.com");

        return new InternetExplorerDriver(ieOptions);
    }

    private WebDriver initFirefoxDriver() {
        webDriverProperties.setFFBinaryProperty();
        return new FirefoxDriver();
    }



}
