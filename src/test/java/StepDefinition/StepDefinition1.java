package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;

public class StepDefinition1  extends BaseClass {


    @Given("^User is on Login Page$")
    public void user_is_on_Home_Page() throws MalformedURLException {
        setup("chrome");
        pageFactory.getLogin().logInUserName();

    }

    @When("^user Enter the Username in \"<userName>\" and enter the password \"<password>\"$")
    public void user_is_on() throws IOException, InterruptedException {
    pageFactory.getLogin().logInUserPassword();
    }

    @Then("^user will click on computers$")
    public void user_will_click_on_computers() throws InterruptedException {
        pageFactory.getLogin().logInSubmitButton();
    }

}
