@All
Feature: Uber booking feature 	

@Smoke @qa-ready @Epic-1001
Scenario: Booking cab Sedan
Given User wants to select a car type "Sedan" from uber app 
When User selects car "Sedan" and pick up point "Banglore" and drop location "Pune"
Then Driver satrts the journey 
And Driver ends the journey 
Then User pays 100 USD

@Smoke @Regression
Scenario: Booking cab SUV
Given User wants to select a car type "SUV" from uber app 
When User selects car "SUV" and pick up point "Bangalore" and drop location "Hyd"
Then Driver satrts the journey 
And Driver ends the journey 
Then User pays 200 USD

@Prod
Scenario: Booking cab Mini
Given User wants to select a car type "Mini" from uber app 
When User selects car "Mini" and pick up point "Pune" and drop location "Mumbai"
Then Driver satrts the journey 
And Driver ends the journey 
Then User pays 150 USD
