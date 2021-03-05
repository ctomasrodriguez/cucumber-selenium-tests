package com.ctomasrodriguez.sample.steps.hdiv;

import com.ctomasrodriguez.sample.infrastructure.driver.Setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HdivSteps {
    private final WebDriver driver = Setup.driver;

    private static String url = "";

    @Given("Hdiv url {string}")
    public void setUrl(String input) {
        url = input;
    }

    @When("I visit Hdiv console")
    public void visit() {
        driver.navigate().to(url + "/hdiv-console-web");
    }

    @Then("I login as {string} with password {string}")
    public void login(String user, String password) {
        driver.findElement(By.id("id_username")).sendKeys(user);
        driver.findElement(By.id("id_password")).sendKeys(password);
        driver.findElement(By.id("id_password")).sendKeys(Keys.ENTER);
    }

    @Then("I receive a login error message in Hdiv")
    public void errorMessage() {
        Assert.assertTrue(driver.findElements(By.id("changeApplication")).isEmpty());
    }

    @And("I get inside")
    public void successfulLogin() {
        WebElement element = driver.findElement(By.id("changeApplication"));

        Assert.assertEquals(element.getDomProperty("action"), url + "/hdiv-console-web/a/0/dashboard");
    }
}
