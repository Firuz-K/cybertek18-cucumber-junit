package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryLoginStepDefinitions {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on login page");
    }

    @When("User logs in as librarian")
    public void user_logs_in_as_librarian() {
        System.out.println("User logs in as librarian");
    }
    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User should see a dashboard");
    }

    @When("User logs in as a student")
    public void user_logs_in_as_a_student() {
        System.out.println("User logs in as Student");
    }




    @When("User logs in as admin")
    public void user_logs_in_as_admin() {
        System.out.println("User logs in as Admin");
    }


    @Then("User should see About link")
    public void userShouldSeeAboutLink() {

    }
}