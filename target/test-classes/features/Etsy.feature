
  Feature:  Etsy Title Verification

    User Story  Etsy Title Verification

    Background:
      Given User is on Etsy Page


    Scenario:  Etsy Title Verification
      Then User sees title is as expected


    Scenario: Etsy Search Functionality Title Verification(without parameterization)
      Then User types Wooden Spoon in the search box
      Then User clicks search button
      And User sees Wooden Spoon is in the title

    @etsy
      Scenario:  Etsy Search Functionality Title Verification (with parameterization)
        Then User types "Wooden Spoon" in the search box
        Then User clicks search button
        And User sees "Wooden spoon" is in the title







