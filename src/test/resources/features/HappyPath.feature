Feature: Enter the application
  As a user
  Make a purchase of a product

  Background:
    Given We enter to application
    And user login

  Scenario: Log in to the application
    When We purchase the product
    Then The purchase is successful

  Scenario: Log in to the application
    When We cancel the purchase of product
    Then The home page is displayed
