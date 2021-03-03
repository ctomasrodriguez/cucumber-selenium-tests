package com.ctomasrodriguez.sample.steps.helloWorld;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HelloWorldSteps {
    @Given("Hello World")
    public void helloWorld() {
        System.out.println("Hello World! Everything is under control :)");
    }

    @Then("Everything will be fine")
    public void everythingWillBeFine() {
        System.out.println("Everything will be fine");
    }
}
