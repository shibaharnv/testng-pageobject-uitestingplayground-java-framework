package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibiltyPage  extends BasePageClass{
    public VisibiltyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@id='transparentButton']")
    WebElement transparentButton;

    @FindBy(xpath = "//button[@id='invisibleButton']")
    WebElement invisibleButton;

    @FindBy(xpath = "//button[@id='notdisplayedButton']")
    WebElement notdisplayedButton;

    @FindBy(xpath = "//button[@id='offscreenButton']")
    WebElement offscreenButton;

    @FindBy(xpath = "//button[@id='hideButton']")
    WebElement hideButton;

    public void verifyButtonsDisplay()
    {
        transparentButton.isDisplayed();
        invisibleButton.isDisplayed();
        notdisplayedButton.isDisplayed();
        offscreenButton.isDisplayed();
        hideButton.isDisplayed();
    }



    public void verifyButtonsInvisiblity()
    {
        webActionHelperMethods.jsClick(hideButton);

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.invisibilityOf(transparentButton));
        wait.until(ExpectedConditions.invisibilityOf(invisibleButton));
        wait.until(ExpectedConditions.invisibilityOf(notdisplayedButton));
        wait.until(ExpectedConditions.invisibilityOf(offscreenButton));
    }


}
