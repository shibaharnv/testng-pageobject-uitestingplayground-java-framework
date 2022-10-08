package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadDelayPage extends BasePageClass{

    public LoadDelayPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Button Appearing After Delay')]")
    WebElement buttonAfterDelay;


    public void waitForButtonLoad() throws Exception {

        webActionHelperMethods.webDriverWaitMethodForElement(driver,15,buttonAfterDelay);
        String currentUrl=driver.getCurrentUrl();
        if(currentUrl.contains("loaddelay"))
        {
            webActionHelperMethods.webDriverWaitMethodForElement(driver,15,buttonAfterDelay);
        }


    }


}
