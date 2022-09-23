package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.net.MalformedURLException;

public class StepDefinition1  extends BaseClass {


    @Given("User is on Login Page")
    public void user_is_on_Home_Page() throws MalformedURLException {
        setup();

    }
    @When("^user Enter the Username in \"([^\"]*)\" and enter the password \"([^\"]*)\"$")
    public void user_is_on(String userName, String password) throws IOException, InterruptedException {

    pageFactory.getLogin().logInUserName(userName,password);
    }

    @Then("should click on Login button")
    public void user_will_click_on_computers() throws InterruptedException {

        pageFactory.getLogin().logInSubmitButton();
    }
//    @And("^add any one product to cart$")
//    public void user_will_click_on_submitButton() throws InterruptedException {
//
//    }


//    @cucumber.api.java.en.When("user Enter the Username in {string} and enter the password {string}")
//    public void userEnterTheUsernameInAndEnterThePassword(String arg0, String arg1) {
//        System.out.println("I am here");
//    }
}
