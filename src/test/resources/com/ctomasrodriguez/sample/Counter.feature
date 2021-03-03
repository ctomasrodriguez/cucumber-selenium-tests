Feature: Counter

  Scenario: Basic example #1
    When counter is incremented
    Then counter equals 1

  Scenario: Basic example #2
    When counter is incremented
    When counter is incremented
    Then counter equals 3
     # This is 3 because we haven't reset the counter

  Scenario: Basic example #3
    Given counter has been reset
    When counter is incremented
    When counter is incremented by 5
    Then counter equals 6

  Scenario Outline: Using Scenario Outlines
    Given counter has been reset
    When counter is incremented by <provided number>
    When counter is incremented by <another provided number>
    Then counter equals <provided>

    Examples:
      | provided number | another provided number | provided |
      | 1               | 2                       | 3        |
      | 100             | 200                     | 300      |
