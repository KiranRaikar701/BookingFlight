Feature: Blazedemo Home Page




Scenario: User verifies all the text in the homepage

Given User is on homepage
When user gets the header and other text
Then  Page header should be "Welcome to the Simple Travel Agency!"
And Page should contain "Choose your departure city:"
And  Page should contain "Choose your destination city:"

Scenario: User verifies dropdown text and select departure city

Given User is on homepage screen

When user click on departure city dropdown 

Then User should see list of departure cities in the dropdown


Scenario: User verifies dropdown text and select departure city

Given User is on homepage screen

When user click on departure city dropdown 

Then User should see list of departure cities in the dropdown


Scenario: User should be able to select departure city and Destination city

Given User is on homepage screen

When user click on departure city dropdown 

Then User should be able to select departure city

And user click on Destination city dropdown 

Then User should be able to select Destination City

And User able to login 















