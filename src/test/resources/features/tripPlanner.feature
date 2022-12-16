Feature: The user shall be able to plan a trip somewhere

  Rule: it is allowed to plan a trip

      Background:
        Given open main page
        And accept cookies
        And language is set to "hungarian"

      Scenario: Single trip plan
        When user provides the trip data
        Then it will be calculated the suggested trip plan

      Scenario: Plan a trip in more details
        When user provides the trip data
        And user provides planning options
        Then it will be calculated the suggested trip plan with options

      Scenario: Plan a trip for a future date
        When user provides the trip data
        And user provides a future date
        Then it will be calculated the suggested trip plan for the preferred future date