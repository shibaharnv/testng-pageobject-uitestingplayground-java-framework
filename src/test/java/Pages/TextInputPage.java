package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TextInputPage extends BasePageClass{


    public TextInputPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='newButtonName']")
    WebElement buttonTextBox;

    @FindBy(xpath = "//button[@id='updatingButton']")
    WebElement updateButton;



    public void validateButtonText(String text) throws Exception {

        webActionHelperMethods.verifyObjectExists(buttonTextBox);


        buttonTextBox.getAttribute("value");
        webActionHelperMethods.enterValueInTextBox(buttonTextBox,text);
        webActionHelperMethods.verifyObjectExists(updateButton);

        String attributeValue=  buttonTextBox.getAttribute("value");
        while (attributeValue.equals(""))
        {
            webActionHelperMethods.enterValueInTextBox(buttonTextBox,text);
            attributeValue=  buttonTextBox.getAttribute("value");
        }
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.elementToBeClickable(updateButton));

        String buttonText=webActionHelperMethods.getWebElementText(updateButton);

        while (buttonText.contains("Input"))
        {
            webActionHelperMethods.jsClick(updateButton);
            buttonText=webActionHelperMethods.getWebElementText(updateButton);
        }

        webActionHelperMethods.webDriverWaitMethodForElement(driver,15,updateButton);

        webActionHelperMethods.webDriverWaitMethodForElement(driver,10,updateButton);
        String buttonTextUpdated=webActionHelperMethods.getWebElementText(updateButton);
        Assert.assertEquals(buttonTextUpdated,text);
    }
}
