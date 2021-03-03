package com.ctomasrodriguez.sample.infrastructure.driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Setup {
    public static WebDriver driver;

    @Before
    public void init() {
        // I'm using Chrome driver by default
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("['start-maximized']");
        driver = new ChromeDriver(chromeOptions);
    }

    @After
    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            takeScreenshot(scenario);
        }

        driver.quit();
    }

    private void takeScreenshot(final Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot, "image/png", scenario.getName());
    }
}
