Feature: The user shall be able to change the language in BudapestGo

  Rule: It is allowed to change the language

    Background:
      Given open main page
      And accept cookies

    Scenario: Change the language to hungarian
      Given language is set to "english"
      When change the language to "hungarian"
      Then it shows elements in "hungarian"