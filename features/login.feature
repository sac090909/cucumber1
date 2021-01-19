Feature: As a valid user of applicaiton 
I want to provide username and password
So that I can login to the homepage

Background: 

Given URL "url" is provided

Scenario: 

Given for application login username "techfiosdemo@gmail.com" and password "abc123" is supplied
When click on login button
Then I enter the login page
