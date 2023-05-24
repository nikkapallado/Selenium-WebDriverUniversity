@login @regression

Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page

  @smoke
  Scenario: Validate Successful Login
    When I enter username webdriver
    And I enter password webdriver123
    And I click the Login button
    Then I should see a successful popup message

  @smoke
  Scenario: Validate Unsuccessful Login
    When I enter username webdriver111
    And I enter password password21123
    And I click the Login button
    Then I should see an unsuccessful popup message

  Scenario Outline: Validate <validateType> Login
    When I enter username <username>
    And I enter password <password>
    And I click the Login button
    Then I should be presented with <loginValidationText> popup message

  Examples:
    | validateType | username | password | loginValidationText |
    | Successful | webdriver | webdriver123 | validation succeeded      |
    | Unsuccessful | webdriver | password123  | validation failed         |
    | Unsuccessful | incorrectUsername | password123 | validation failed  |
