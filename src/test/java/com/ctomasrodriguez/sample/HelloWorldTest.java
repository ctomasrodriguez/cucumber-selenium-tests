package com.ctomasrodriguez.sample;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/ctomasrodriguez/sample/Hello_World.feature"},
        strict = true, plugin = {"pretty",
        "json:target/cucumber_json_reports/HelloWorld.json",
        "html:target/HelloWorld-html"},
        glue = {"com.ctomasrodriguez.sample.steps"})
public class HelloWorldTest {
}
