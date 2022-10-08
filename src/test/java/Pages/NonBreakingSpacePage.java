package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NonBreakingSpacePage extends BasePageClass{


    public NonBreakingSpacePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//*[starts-with(text(), \"My\") and substring(text(), 4)=\"Button\"]")
    WebElement myButton;


    public void validateButtonTextWithUniqueXpath()
    {

        String buttonText=webActionHelperMethods.getWebElementText(myButton);
        myButton.isDisplayed();
        Assert.assertEquals(buttonText,"My Button");
    }




}
