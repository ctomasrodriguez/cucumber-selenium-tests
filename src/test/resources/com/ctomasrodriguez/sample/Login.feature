Feature: Login

  Scenario: Valid login
    When I login with valid credentials
    Then App greets me

  Scenario: Invalid login
    When I login with invalid credentials
    Then I receive a login error message