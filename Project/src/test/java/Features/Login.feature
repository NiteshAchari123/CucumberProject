Feature: Checking the log in functionality

  Scenario: Test log in page
    Given User is on the log in page
    When User enters user name and password
    And click on the log in button 
    Then User should land on Home page