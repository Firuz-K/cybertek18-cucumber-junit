package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario() {
        System.out.println("----> Before annotation : Setting up browser");
    }

    @Before(order = 1)
    public void setUpDataBaseConnection() {
        System.out.println("----> BEFORE ANNOTATION : Database connection created <-----");
    }


    @After
    public void tearDownScenario(Scenario scenario) {
        // System.out.println("---->After annotation : Closing browser");

        //System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
       // System.out.println("scenario.isFailed() = " + scenario.isFailed());

        // we are going to take a screenshot using Selenium

        if (scenario.isFailed()) {
            // we have to cast our driver to TakeScreenshot
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            // we are going to attach our screenshot to our report
            // attach method accepts 3 arguments Screenshot, Image type, current scenario
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
    }

    @After
    public void teardownDataBaseConnection() {
        System.out.println("---------->After annotation: DB connection is closed<------------");
    }

    @BeforeStep
    public void setUpStep() {
        System.out.println("------->Taking screenshot before action<------------");
    }


    @AfterStep
    public void tearDownStep() {
        System.out.println("------->Taking screenshot after action <------------");
    }

}