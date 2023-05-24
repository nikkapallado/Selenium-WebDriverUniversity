package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_vars;

public class Contact_US_PO extends Base_PO{
    private @FindBy(xpath = "//input[@name='first_name']")
//    private @FindBy(how= How.XPATH, using="//input[@name='first_name']") //this works too
    WebElement first_Name_TextField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement last_Name_TextField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement email_TextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comment_TextArea;

    private @FindBy(xpath = "//input[@type='submit']")
    WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement submission_Message;

    public Contact_US_PO(){
        super();
    }

    public void navigateToWebDriverUniversityContactUsPage(){
        navigateTo_URL(Global_vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "Contact-Us/contactus.html");
    }

    public void setUniqueFirstName(){
        sendKeys(first_Name_TextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUniqueLastName(){
        sendKeys(last_Name_TextField, "AutoLN" + generateRandomNumber(5));
    }

    public void setUniqueEmailAddress(){
        sendKeys(email_TextField, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }

    public void setUniqueComment(){
        sendKeys(comment_TextArea, "Hello world " + generateRandomString(20));
    }

    public void setSpecificFirstName(String firstName){
        sendKeys(first_Name_TextField, firstName);
    }

    public void setSpecificLastName(String lastName){
        sendKeys(last_Name_TextField, lastName);
    }

    public void setSpecificEmailAddress(String emailAddress){
        sendKeys(email_TextField, emailAddress);
    }

    public void setSpecificComment(String comment){
        sendKeys(comment_TextArea, comment);
    }

    public void waitOnSubmitButtonAndClick(){
        waitForWebElementAndClick(submit_Button);
    }

    public void validateSubmissionMessage(){
        waitFor(submission_Message);
        Assert.assertEquals(submission_Message.getText(), "Thank You for your Message!");
    }
}
