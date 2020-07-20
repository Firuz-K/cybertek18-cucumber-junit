


Feature: Login feature
  User Story: As a user, I should be able to login with correct
  credentials to different accounts. And dashboard should be displayed.

  Background: User is on the login page
    Given User is on the login page


  Scenario: Librarian login scenario
    When User logs in as librarian
    Then User should see dashboard

@apple
  Scenario: Student login scenario
    When User logs in as a student
    Then User should see dashboard

@peach
  Scenario: Admin login scenario
    When User logs in as admin
    Then User should see dashboard

