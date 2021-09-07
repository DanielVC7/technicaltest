Feature: Enter the application
  As a user
  view product

  Background:
    Given We enter to application
    And user login

  Scenario: Log in to the application
    When We view details product
    Then The product detail is shown