package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AmazonTest;

public class AmazonStepsDefination extends AmazonTest {
    @Given("I am in Amazon Homepage")
    public void i_am_in_Amazon_Homepage() {
        browserSetup();
        geTTitle();
        setUp();
        click("Samsung");


    }
    @Then("I will click on Today's Deal")
    public void i_will_click_on_Today_s_Deal() {
        todayDeal();
    }




}
