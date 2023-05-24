package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Contact_US_PO;


public class Contact_Us_Steps extends Base_PO {
    private WebDriver driver = getDriver();
    private Contact_US_PO contactUsPo; //Class we intend to inject

    //Part of injection
    public Contact_Us_Steps(Contact_US_PO contactUsPo){
        this.contactUsPo = contactUsPo;
    }

    @Given("I access the contact us page")
    public void i_access_contact_us_page() {
        contactUsPo.navigateToWebDriverUniversityContactUsPage();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUsPo.setUniqueFirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUsPo.setUniqueLastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUsPo.setUniqueEmailAddress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUsPo.setUniqueComment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUsPo.setSpecificFirstName(firstName);
    }
    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUsPo.setSpecificLastName(lastName);
    }
    @And("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUsPo.setSpecificEmailAddress(email);
    }
    @And("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUsPo.setSpecificComment(comment);
    }

    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {

        contactUsPo.waitOnSubmitButtonAndClick();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUsPo.validateSubmissionMessage();
    }

}
