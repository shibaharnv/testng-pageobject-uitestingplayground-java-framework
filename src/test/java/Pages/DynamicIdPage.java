package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicIdPage extends BasePageClass {

    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Button with Dynamic ID')]")
    WebElement dynamicIdButton;

    public void verifydynamicIdButtonExists()
    {
        webActionHelperMethods.verifyObjectExists(dynamicIdButton);
    }


    public void dynamicIdButtonClick()
    {
        webActionHelperMethods.verifyObjectExists(dynamicIdButton);
        webActionHelperMethods.clickButton(dynamicIdButton);
    }

}
