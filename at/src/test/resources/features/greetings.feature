Feature: Greeting 

Scenario: Saying hello 
	Given I have 1 robot name "Staff" 
	When I say hello 
	Then the robot should say "hello from greeter!"