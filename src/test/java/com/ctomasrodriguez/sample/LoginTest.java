package com.ctomasrodriguez.sample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ctomasrodriguez/sample/Login.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/Login.json",
        "html:target/Login-html"},
        glue = {"com.ctomasrodriguez.sample.infrastructure.driver", "com.ctomasrodriguez.sample.steps"})
public class LoginTest {
}
