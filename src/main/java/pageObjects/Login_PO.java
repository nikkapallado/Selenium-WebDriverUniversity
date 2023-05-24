//Login page object super class
package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_vars;

public class Login_PO extends Base_PO{
    private @FindBy(id = "text")
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_Button;

    public Login_PO() {
        super(); //use the logic of base page's constructor
    }

    public void navigateToWebDriverUniversityLoginPage(){
        navigateTo_URL(Global_vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "Login-Portal/index.html?");
    }

    public void setUsername(String username){
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickLoginButton(){
        waitForWebElementAndClick(login_Button);
    }

    public void validateSuccessfulPopupMessage(){
        waitForAlertAndValidateText("validation succeeded");
    }

    public void validateUnsuccessfulPopupMessage(){
        waitForAlertAndValidateText("validation failed");
    }

    public void validatePopupMessage(String expectedMessage){
        waitForAlertAndValidateText(expectedMessage);
    }

}
