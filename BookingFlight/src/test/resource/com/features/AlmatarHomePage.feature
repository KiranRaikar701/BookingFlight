Feature: AlmatarHomePage



Scenario: Verifying error message when user doesnt pass from and to 

Given User is on AlmatarHomePage.
Then User Verifies Title of the page.
And User should see header text "Your new travel mate"
Then User clicks on Flights Tab.
And User verifies messages "please search and select from drop down" and "please select different location" in From textbox when user doesnt enter origin
And User verifies messages "please search and select from drop down" and "please select different location" in From textbox when user doesnt enter destination
Then User clicks on search button.

Scenario: Customer searchs for the flight

Given User is on Homepage
Then User enters TO city and User enters FROM city
Then User enters departure date
And User enters number of Travellers
Then User click on search icon






















