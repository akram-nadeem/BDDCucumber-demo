Feature: log in page automation
Background:
 Given User is on login page
Scenario: check log in is successful with valid reds

  When user enters valid username and pass
  And Clicks on login btn
  Then user is redirected to home page



