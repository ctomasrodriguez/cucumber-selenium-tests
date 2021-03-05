package com.ctomasrodriguez.sample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ctomasrodriguez/sample/Hdiv.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/Hdiv.json",
        "html:target/Hdiv-html"},
        glue = {"com.ctomasrodriguez.sample.infrastructure.driver",
                "com.ctomasrodriguez.sample.steps"})
public class HdivTest {
}
