Feature: The user shall be able to change the language in BudapestGo

  Rule: It is allowed to change the language

    Background:
      Given open main page
      And accept cookies

    Scenario: change the language to hungarian
      Given language is set to "english"
      When change the language to "hungarian"
      Then it shows elements in "hungarian"

    Scenario: change the language to english
      Given language is set to "hungarian"
      When change the language to "english"
      Then it shows elements in "english"

    Scenario Outline: Change language
      Given language is set to "<language>"
      When change the language to "<new_language>"
      Then it shows elements in "<new_language>"

      Examples:
        | language  | new_language |
        | hungarian | english      |
        | english   | hungarian    |