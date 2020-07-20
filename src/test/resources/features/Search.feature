

Feature: Search
  Agile Story: As a user i should be able to search when i am on Google search page.

  Background:
    Given  User is on the google search page




  Scenario: Google default title verification
    Then User should see title is Google


Scenario: Google title verification after the search
  When User searches apple
  And User should see apple in the title




  Scenario: Google title verification after the search
    When User searches "peach"
    Then User should see "peach" in the title

  @para
   Scenario: Google - About - link page title verification
     Then Uer should verify About link is displayed
     And User clicks to About link
     Then User should see title


    @googleTable
  Scenario: Google search page footer links verification
    Then User should see six links in the footer
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |
      | Settings         |


