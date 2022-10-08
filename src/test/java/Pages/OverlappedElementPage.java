package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class OverlappedElementPage extends BasePageClass {

    public OverlappedElementPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@style='position: relative;']")
    WebElement playGroundScrollPane;

    @FindBy(xpath = "//div[@style='position: relative;']//input[@id='name']")
    WebElement playGroundNameField;


    String expectedName="";


    public void scrollPlayGroundPane()
    {
        //First click on the scroll-able pane of your page:
        webActionHelperMethods.scrollClickElement(playGroundScrollPane);
        // performing scroll action in the target element
        webActionHelperMethods.scrollAction();


    }


    public void enterTextInNameField(String name)
    {
        expectedName=name;
        JavascriptExecutor jse = ((JavascriptExecutor)driver);

        jse.executeScript("arguments[0].value='"+name+"';", playGroundNameField);
    }


    public void validateTextInField()
    {
        String actualName=playGroundNameField.getAttribute("value");
        Assert.assertEquals(expectedName,actualName);

    }

}
