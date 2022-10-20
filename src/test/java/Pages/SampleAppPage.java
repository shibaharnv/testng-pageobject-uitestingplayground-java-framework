package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SampleAppPage extends BasePageClass {
    public SampleAppPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='loginstatus']")
    WebElement loginstatus;

    @FindBy(xpath = "//input[@name='UserName']")
    WebElement UserName;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement Password;

    @FindBy(xpath = "//button[@id='login']")
    WebElement loginbtn;


    public void logInValidation(String userNameValue, String passwordValue) {

        loginstatus.isDisplayed();
        webActionHelperMethods.enterValueInTextBox(UserName, userNameValue);
        webActionHelperMethods.enterValueInTextBox(Password, passwordValue);
        webActionHelperMethods.jsClick(loginbtn);
        String welcomeMessage = webActionHelperMethods.getWebElementText(loginstatus);
        Assert.assertTrue(welcomeMessage.contains(userNameValue));
    }


    public void logOutValidation() {
        loginstatus.isDisplayed();
        webActionHelperMethods.clickButton(loginbtn);

        String logOutMessage = webActionHelperMethods.getWebElementText(loginstatus);
        Assert.assertTrue(logOutMessage.contains("User logged out."));

    }

    public void logInErrorValidation(String userNameValue, String passwordValue) {

        loginstatus.isDisplayed();
        webActionHelperMethods.enterValueInTextBox(UserName, userNameValue);
        webActionHelperMethods.enterValueInTextBox(Password, passwordValue);
        webActionHelperMethods.clickButton(loginbtn);
        String errorMessage = webActionHelperMethods.getWebElementText(loginstatus);
        Assert.assertTrue(errorMessage.contains("Invalid username/password"));


    }
}
