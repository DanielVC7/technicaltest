Feature: Enter the application
  As a user
  do not make a purchase

  Background:
    Given We enter to application
    And user login

  Scenario: Log in to the application
    When We not purchase the product
    Then The purchase is not successful
