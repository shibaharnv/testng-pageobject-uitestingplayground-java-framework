package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MouseHoverPage extends BasePageClass{
    public MouseHoverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Click me']")
    WebElement clickmeLink;

    @FindBy(xpath = "//h4[contains(text(),'Playground')]")
    WebElement playGroundText;

    @FindBy(xpath = "//span[@id='clickCount']")
    WebElement countText;


    Actions actions;

    public void clickmeMouseHoverAndClick() throws Exception {

        webActionHelperMethods.webDriverWaitMethodForElement(driver,10,clickmeLink);
        webActionHelperMethods.actionsMouseHoverAndClick(clickmeLink);

    }

    public void mousehoverPlayGround()
    {
        webActionHelperMethods.actionsMouseHover(playGroundText);
    }

    public void validateCount()
    {
        String count= webActionHelperMethods.getWebElementText(countText);
        Assert.assertEquals("2",count);
    }


}
