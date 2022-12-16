Feature: The user shall be able to search for categories in BudapestGo

  Rule: It is allowed to search for address

    Background:
      Given open main page
      And language is set to "hungarian"
      And accept cookies

    Scenario: Search for categories
      When search for an "address"
      Then it shows the data of selected "address"