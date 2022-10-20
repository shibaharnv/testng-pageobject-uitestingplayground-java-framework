package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class AjaxDataPage extends BasePageClass{

    public AjaxDataPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[contains(text(),'Button Triggering AJAX Request')]")
    WebElement ajaxRequestButton;

    @FindBy(xpath = "//*[contains(text(),'Data loaded with AJAX get request.')]")
    WebElement ajaxText;




    public void clickAjaxRequestButtonAndValidate() throws Exception {



        webActionHelperMethods.jsClick(ajaxRequestButton);
        webActionHelperMethods.waitForAjax();

        String expectedText="Data loaded with AJAX get request.";

        webActionHelperMethods.webDriverWaitMethodForText(driver,15,ajaxText,expectedText);

        String actualText=webActionHelperMethods.getWebElementText(ajaxText);
        Assert.assertEquals(actualText,"Data loaded with AJAX get request.");

    }

}
