package com.ctomasrodriguez.sample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ctomasrodriguez/sample/Counter.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/Counter.json",
        "html:target/Counter-html"},
        glue = {"com.ctomasrodriguez.sample.steps"})
public class CounterTest {
}
