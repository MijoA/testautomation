Feature: The user shall be able to deactivate the indication of map elements in BudapestGo

  Rule: it is allowed deactivate map elements

    Background:
      Given open main page
      And language is set to "hungarian"
      And accept cookies

      Scenario: Deactivate to show stops on the map
        Given all map elements are active
        When deactivate the stops elements on the map
        Then it does not show stops on the map

      Scenario: Activate to show stops on the map
        Given stops are inactive on the map
        When activate to show the stops on the map
        Then it shows stops on the map

    Scenario: Deactivate to show lines on the map
      Given all map elements are active
      When deactivate the lines on the map
      Then it does not show lines on the map

    Scenario: Activate to show lines on the map
      Given lines are inactive on the map
      When activate to show the lines on the map
      Then it shows lines on the map

    Scenario: Deactivate to show addresses on the map
      Given all map elements are active
      When deactivate to show addresses on the map
      Then it does not show addresses on the map

    Scenario: Activate to show addresses on the map
      Given addresses are inactive on the map
      When activate to show addresses on the map
      Then it shows addresses on the map


