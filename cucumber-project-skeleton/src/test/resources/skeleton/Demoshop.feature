Feature: Online Login
This is a test for demowebshop

Scenario: Valid OnlineLogin
Given Demowebshop is opened
When I provide valid Emailid and Password
Then The user can login
