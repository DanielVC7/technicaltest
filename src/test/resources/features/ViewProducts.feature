Feature: Enter the application
  As a user
  do not login

  Scenario: No login
    When Leaving empty fields
    Then Error message displayed