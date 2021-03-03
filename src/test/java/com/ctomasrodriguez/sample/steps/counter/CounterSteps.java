package com.ctomasrodriguez.sample.steps.counter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CounterSteps {
    private static int counter = 0;

    @Given("counter has been reset")
    public void resetCounter() {
        counter = 0;
    }

    @When("counter is incremented")
    public void incrementCounter() {
        counter += 1;
    }

    @When("counter is incremented by {int}")
    public void counterIncrementedBy(int value) {
        counter += value;
    }

    @Then("counter equals {int}")
    public void counterEquals(int value) {
        Assert.assertEquals(value, counter);
    }
}
