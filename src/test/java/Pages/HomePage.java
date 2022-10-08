package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePageClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }



    @FindBy(xpath = "//a[contains(text(),'Non-Breaking Space')]")
    WebElement nonBreakingspace;

    @FindBy(xpath = "//a[contains(text(),'Visibility')]")
    WebElement Visibility;

    @FindBy(xpath = "//a[contains(text(),'Text Input')]")
    WebElement textInput;

    @FindBy(xpath = "//a[contains(text(),'Mouse Over')]")
    WebElement mouseHover;


    @FindBy(xpath = "//a[contains(text(),'Sample App')]")
    WebElement sampleApp;

    @FindBy(xpath = "//a[contains(text(),'AJAX Data')]")
    WebElement ajaxData;

    @FindBy(xpath = "//a[contains(text(),'Load Delay')]")
    WebElement loadDelayElement;












    public void dynamicIdClick()
    {


        webActionHelperMethods.clickLink("Dynamic ID");
    }

    public void dynamicWebTableClick()
    {

        webActionHelperMethods.clickLink("Dynamic Table");
    }

    public void overLappedElementClick()
    {
        webActionHelperMethods.clickLink("Overlapped Element");
    }

    public void textInputLinkClick()
    {

        webActionHelperMethods.jsClick(textInput);

    }

    public void nonBreakingSpaceClick()
    {

        webActionHelperMethods.jsClick(nonBreakingspace);
    }

    public void visiblityLinkClick()
    {
        webActionHelperMethods.jsClick(Visibility);

    }

    public void mouseHoverClick()
    {
        webActionHelperMethods.jsClick(mouseHover);
    }

    public void sampleAppClick()
    {
        webActionHelperMethods.jsClick(sampleApp);

    }

    public void ajaxDataClick() throws InterruptedException {
        webActionHelperMethods.jsClick(ajaxData);

    }

    public void loadDelayClick() throws Exception {
        webActionHelperMethods.jsClick(loadDelayElement);

    }

}

