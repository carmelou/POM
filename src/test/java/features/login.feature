Feature: Login functionality

  Scenario: Successful login
    Given the user is on the login page
    When the user enters "admin" and "admin123"
    Then the user should be redirected to the homepage
    