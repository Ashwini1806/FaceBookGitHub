Feature: Facebook Functionality

  Scenario: Validate Facebook RegistrationPage
    Given User should open "chrome" browser
    When User should enter valid firstname
    And User should enter valid Lastname
    And User should enter valid BDate
    And User should enter valid BMonth
    And User should enter valid BYear
