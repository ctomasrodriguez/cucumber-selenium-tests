Feature: Hdiv Login

  Scenario: Valid login
    Given Hdiv url "http://localhost:8089"
    When I visit Hdiv console
    Then I login as "admin" with password "admin"
    And I get inside

  Scenario: Invalid login
    Given Hdiv url "http://localhost:8089"
    When I visit Hdiv console
    And I login as "admin1" with password "admin1"
    Then I receive a login error message in Hdiv
