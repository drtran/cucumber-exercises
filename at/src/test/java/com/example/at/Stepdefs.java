package com.example.at;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {
	private Greeter greeter;

	@Given("I have {int} robot name {string}")
	public void i_have_robot_name(Integer numRobots, String greeterName) {
		greeter = new Greeter(greeterName);
	}

	@When("I say (\\w+)")
	public void i_say(String greetings) {
		greeter.greets(greetings);
	}

	@Then("the robot should say {string}")
	public void the_robot_should_say(String expectedGreetings) {
		String actualGreetings = greeter.responses();
		assertThat(expectedGreetings, equalTo(actualGreetings));
	}

}
