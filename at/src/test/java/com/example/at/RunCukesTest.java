package com.example.at;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "io.cucumber.pro.JsonReporter:all" }, features = "src/test/resources/features")
public class RunCukesTest {
}
