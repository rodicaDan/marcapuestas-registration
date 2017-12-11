package com.marcapuestas.registration.stepdefs;

import com.marcapuestas.registration.model.pages.MaxebtMainPage;
import com.marcapuestas.registration.config.Log;
import com.marcapuestas.registration.model.pages.MarcaPuestasPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.java.StepDefAnnotation;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class CommonSteps {
    private static final Logger LOG = LoggerFactory.getLogger(Log.class);
    private WebDriver webDriver;
    private static boolean dunit = false;

    @Autowired
    public CommonSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }



    @Before
    public void beforeAll() {
        if(!dunit) {
            Runtime.getRuntime().addShutdownHook(new Thread() {
                public void run() {
                }
            });
            dunit = true;
        }
    }


    @Before
    public void startTestCase(Scenario scenario) {
        LOG.info("Starting test case: {}", scenario.getName());
    }

    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }


    @After
    public void embedScreenshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);

                String testName = scenario.getName();
                scenario.embed(screenshot, "image/png");
                scenario.write(testName);
            } catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            } catch (ClassCastException cce) {
                cce.printStackTrace();}
        }
        tearDown();

    }


}
