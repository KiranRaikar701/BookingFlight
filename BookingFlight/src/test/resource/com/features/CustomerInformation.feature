Feature: Customer Information Page







Background: Login to the application

When User selects paris as a Departure
Then User Select london as a arrival place
And User click on login button to book the flight
Then User click on chooseflight button to continue




Scenario: User Verifiles Airline and price text

Given User is on homepage screen

Then Airline name should be "Virgin America"
And Flight Number should be "43"
And Price should be "$472.56"
And Arbitrary Fees and Taxes should be "514.76"



Scenario: Customer Information details

Given Customer is on customer information page
Then Customer enters Firstname
And Customer enters Address
Then Customer enters City
Then Customer enters State
Then Customer enters Zipcode


Scenario: Customer enters card details and click on purchase flight

When user selects card type
And User selects Card Number
And User select month
Then user select year
And user select Name on Card
Then User click on Purchase Flight
Then user should be able to see text "Thank you for your purchase today!"
Then user should be able to see customer id





