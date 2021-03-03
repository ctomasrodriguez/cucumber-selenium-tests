package com.ctomasrodriguez.sample.steps.login;

import com.ctomasrodriguez.sample.infrastructure.driver.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginSteps {
    private final WebDriver driver = Setup.driver;
    private final WebDriverWait waitDriver = new WebDriverWait(Setup.driver, Duration.ofSeconds(10));

    @Given("I login with invalid credentials")
    public void invalidCredentials(){
        login("notvalid@email.com", "someweirdpassword");
    }

    @Given("I login with valid credentials")
    public void validCredentials(){
        // I'm using this env variables because I did the same tests in cypress
        login(System.getenv("CYPRESS_EMAIL"), System.getenv("CYPRESS_PASSWORD"));
    }

    @Then("I receive a login error message")
    public void errorMessage(){
        final String expectedMessage = "Tus datos introducidos no son correctos";
        final By errorBubble = By.className("error-bubble");
        waitDriver.until(ExpectedConditions.textToBePresentInElementLocated(errorBubble, expectedMessage));
    }

    @Then("App greets me")
    public void greetsMe(){
        final String expectedMessage = "Hola Guillermo";
        final By dashboardTitle = By.className("dashboard-title");
        waitDriver.until(ExpectedConditions.textToBePresentInElementLocated(dashboardTitle, expectedMessage));
    }

    private void login(String email, String password) {
        driver.navigate().to("https://app.chameleon.vision");

        List<WebElement> inputElements = driver.findElements(By.cssSelector("input"));
        inputElements.get(0).sendKeys(email);

        WebElement passwordInput = inputElements.get(1);
        passwordInput.sendKeys(password);
        passwordInput.sendKeys(Keys.ENTER);
    }
}
