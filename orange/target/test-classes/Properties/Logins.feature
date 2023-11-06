Feature: Checking Login action of the Orange hrm Web Application

Scenario: Login using correct credentials

Given User is on Login Page 
When User enters valid username and password
When User Clicks login button in login page
Then User should be able to login successfully and navigates to the dashboard page