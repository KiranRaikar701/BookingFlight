Feature: Select flight and Booking 





Background: Login to the application

When User selects paris
Then User Select london as arrival place
And User click on login button


Scenario: Text verification on Booking page

Given user is on Booking page

Then User should be able to see the text "Flights from Paris to London:"

And User should be able to see Flight number '43' 

And User should be able to see Airline "Virgin America" 

And User should be able to see Depart Time '1:43 AM'

And User should be able to see Arrive Time '9:45 PM'

And user should be able to see Price '$472.56'


Scenario: Click on choose flight Button

Given user is on Booking page

And User should be able to click on Choose This Flight Button






