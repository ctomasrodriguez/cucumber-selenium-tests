package com.ctomasrodriguez.sample.steps.duckduckgo;

import com.ctomasrodriguez.sample.infrastructure.driver.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DuckDuckGoSteps {
    private final WebDriver driver = Setup.driver;

    @When("I visit DuckDuckGo")
    public void visit() {
        driver.navigate().to("https://www.duckduckgo.com");
    }

    @Then("I query {string}")
    public void query(String value) {
        WebElement input = driver.findElement(By.id("search_form_input_homepage"));

        input.sendKeys(value);
        input.sendKeys(Keys.ENTER);
    }

    @And("{string} appears")
    public void check(String value) {
        Assert.assertTrue(driver.getPageSource().contains("value"));
    }
}
