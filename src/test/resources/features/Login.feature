@login
Feature: Login

  @AZUL-735
  Scenario: the user should be able to login
    Given the user on the login page
    When the user enters the username and password
    And the user clicks on login button
    Then the user should be able to see the title as "Portal"