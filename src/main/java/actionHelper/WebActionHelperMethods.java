package actionHelper;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class WebActionHelperMethods {

    private WebDriver driver;

    Actions actions;

    public WebActionHelperMethods(WebDriver driver) {
        this.driver = driver;
    }


    public boolean clickButton(WebElement element) {
        element.click();
        return true;
    }


    public void clickLink(String data) {
        driver.findElement(By.linkText(data)).click();
    }

    public void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }



    public String getWebElementText(WebElement element) {
        return element.getText();
    }



    public boolean verifyObjectExists(WebElement ele) {

        if ((ele).isDisplayed()) {
            return true;

        } else {
            return false;
        }

    }





    public void webDriverWaitMethodForText(WebDriver driver,long time,WebElement element,String text) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.textToBePresentInElement(element,text));
    }


    public void webDriverWaitMethodForInvisiblity(WebDriver driver,long time,WebElement element) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void webDriverWaitMethodForElement(WebDriver driver,long time,WebElement element) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOf(element));
    }






    public boolean waitForAjax() {

        //need to wait for Javascript and jQuery to finish loading. Execute Javascript to check if jQuery.
        // active is 0 and document.readyState is complete,
        // which means the JS and jQuery load is complete.

        WebDriverWait wait = new WebDriverWait(driver, 30);

        // wait for jQuery to load
        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                try {
                    return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
                }
                catch (Exception e) {
                    // no jQuery present
                    return true;
                }
            }
        };

        // wait for Javascript to load
        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState")
                        .toString().equals("complete");
            }
        };

        return wait.until(jQueryLoad) && wait.until(jsLoad);
    }

    /**
     * This keyword closes all the open browser sessions started by Selenium. It
     * does not take any input argument.
     *
     * @return
     */
    public boolean CloseAllBrowsers() {
        try {
            driver.quit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean CloseBrowser() {
        try {
            driver.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }




    public boolean actionsMouseHover(WebElement element)
    {
        try {
            actions=new Actions(driver);
            actions.moveToElement(element);
            actions.build().perform();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean actionsMouseHoverAndClick(WebElement element)
    {
        try {
            actions= new Actions(driver);
            actions.moveToElement(element).click();
            actions.build().perform();
            return true;
        } catch (Exception e) {
            return false;
        }


    }


    public boolean scrollClickElement(WebElement element)
    {
        try {
            actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean scrollAction()
    {
        try {
            actions = new Actions(driver);
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean enterValueInTextBox(WebElement element,String value) {
        try {
            element.sendKeys(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }



}