Feature: Search
  Agile Story: As a user i should be able to search when i am on Google search page.

  @scenarioOutline
  Scenario Outline: Google title verification after the search
    Given  User is on the google search page
    When User searches "<searchValue>"
    Then User should see "<expectedTitle>" in the title


    Examples: Search values I want to search in Google
      | searchValue | expectedTitle |
      | apple       | apple         |
      | kiwi        | kiwi          |
      | orange      | orange        |
      | milk        | milk          |

