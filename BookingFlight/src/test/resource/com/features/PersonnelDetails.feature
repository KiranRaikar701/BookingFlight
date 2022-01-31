Feature: Entering Passanger information and Subnmit




Scenario Outline: Passenger information

When User is on home page

Then User Selects from and to city and enter departure time and Enter traveller count and hit search icon

And User Clicks on Choose button

Then User enters "<FirstName>" and "<LastName>"
Then user passes "<Email>"
Then User selects Date of Birth
And User selects Gender
And  User selects Doccument Type

Then User selects Nationality

And User selects Issuing Country

Then User Enters the passport details

Then User selects passport issuing country

And User selects Passport expiry date

Then User Selects "<PhoneNumber>"
Then User clicks on Submit button

Examples:

        |FirstName    | LastName | Email   |  PhoneNumber |
        |Kiran      | Raikar  | kiranraikar7@gmail.com| 00000000 |
        





