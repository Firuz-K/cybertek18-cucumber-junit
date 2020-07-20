


Feature: Login feature
  User Story: As a user, I should be able to login with correct
  credentials to different accounts. And dashboard should be displayed.


  Scenario: Librarian login scenario
    Given User is on the login page
    When User logs in as librarian
    Then User should see dashboard


    Scenario: Student login scenario
      Given User is on the login page
      When User logs in as a student
      Then User should see dashboard


      Scenario: Admin login scenario
        Given User is on the login page
        When User logs in as admin
        Then User should see dashboard

