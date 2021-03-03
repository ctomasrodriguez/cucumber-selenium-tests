Feature: DuckDuckGo

  Scenario: Go DuckDuckGo
    When I visit DuckDuckGo
    Then I query "tiger"
    And "tiger" appears
