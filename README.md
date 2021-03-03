# Summary

This project consist on some gherkin Selenium based tests written in Java

# IntelliJ Plugins

I have installed _Cucumber for java_ and _Gherkin_ plugins, both from Jetbrains.

# Folder and files structure

- drivers: chromedriver needed to run Selenium test with Chrome
- src/test/java/.../infrastructure/driver/Setup.java : class for test initialization and take screenshots if test fails
- src/test/java/.../steps : steps folder
- src/test/java/.../*Test.java: Test for running the features
- src/test/resources/.../*.feature: the Gherkin features 

# Defined Features

In case you don't know about Gherkin keywords you can read about them [here](https://cucumber.io/docs/gherkin/reference/)

## Hello World

In this basic example, we have this _Hello\_World.feature_ where we have defined a very basic feature consisting in only two basic steps that assert nothing. 

## Counter

A basic example with Given - When - Then and showing how to pass data to the steps

## DuckDuckGo

A basic example querying DuckDuckGo search engine

# How to run this tests

Execute:

- mvn clean package

# How to write more tests

Easy, create whatever steps you need inside the steps folder and create you feature with Gherkin format.
After that create the test file and make sure you put the right names for features, reports and glues.
