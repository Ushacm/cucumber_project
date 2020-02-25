Feature: Login scenrios
@Smoke @Sanity
Scenario: valid login
Given user is in the login page
When user provide valid credentials 
Then user will be logged in

@Sanity
Scenario: Invalid login
Given user is on the login page
When user provide invalid credentials
Then user will get error messege

@Sanity
Scenario: blank
Given user is on login page
When user click on login without any information
Then error messege will come 
