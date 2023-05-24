package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Steps extends Base_PO {
    private Login_PO loginPo; //Class we intend to inject

    public Login_Steps(Login_PO loginPo){
        this.loginPo = loginPo;
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        loginPo.navigateToWebDriverUniversityLoginPage();
    }

    @When("I enter username {word}")
    public void i_enter_a_username(String username) {
        loginPo.setUsername(username);
    }

    @And("I enter password {}")
    public void i_enter_a_correct_password(String password) {
        loginPo.setPassword(password);
    }

    @And("I click the Login button")
    public void i_click_the_login_button() {
        loginPo.clickLoginButton();
    }

    @Then("I should see a successful popup message")
    public void i_should_see_a_successful_popup_message() {
        loginPo.validateSuccessfulPopupMessage();
    }

    @Then("I should see an unsuccessful popup message")
    public void i_should_see_an_unsuccessful_popup_message() {
        loginPo.validateUnsuccessfulPopupMessage();
    }

    @Then("I should be presented with {} popup message")
    public void i_should_see_a_validation_failed_popup_message(String expectedMessage) {
        loginPo.validatePopupMessage(expectedMessage);
    }


}
