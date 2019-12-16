package org.automation.core;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;

/**
 * Created by Jyoti on 03/05/17.
 * Base file for cucumber steps
 */
public abstract class StepBase {

    protected WebDriver driver;

    public StepBase(){

    }

}
