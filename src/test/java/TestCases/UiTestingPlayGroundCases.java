package TestCases;


import com.aventstack.extentreports.ExtentTest;
import listeners.Log;
import org.testng.annotations.Test;


public class UiTestingPlayGroundCases extends BaseTest {


    @Test(priority=1)
    public void TC_01_DYNAMIC_LINK_VALIDATION() throws InterruptedException {

        //{Scenario
        // Record button click.
        //Then execute your test to make sure that ID is not used for button identification.}



        Log.info("Clicking on the dynamic web table in home page");
        homePage.dynamicIdClick();
        
        Log.info("verify if dynamicId Button Exists");
        dynamicIdPage.verifydynamicIdButtonExists();

        dynamicIdPage.dynamicIdButtonClick();
        Log.info("TC_01_DYNAMIC_LINK_VALIDATION Passed");


    }

    @Test(priority=2)
    public void TC_02_DYNAMIC_WEB_TABLE_VALIDATION() {

        //{Scenario
        //For Chrome process get value of CPU load.
        //Compare it with value in the yellow label.}

        Log.info("Clicking on the dynamic web table in home page");
        homePage.dynamicWebTableClick();

        Log.info("verify if dynamic Table Exists");
        dynamicWebTablePage.verifydynamicTableExists();

        Log.info("Comparing the cpu Values");
        dynamicWebTablePage.compareChromeCpuValues();

        Log.info("TC_02_DYNAMIC_WEB_TABLE_VALIDATION Passed");

    }


    @Test(priority=3)
    public void TC_03_ENTERING_TEXT_IN_OVERLAPPED_ELEMENT_VALIDATION() {

        //{Scenario
        //Record setting text into the Name input field (scroll element before entering the text).
        //Then execute your test to make sure that the text was entered correctly.}



        Log.info("Clicking on over lapped element link in home page");
        homePage.overLappedElementClick();

        Log.info("scroll PlayGround Pane");
        overlappedElementPage.scrollPlayGroundPane();

        Log.info("enter the Text In Name Field");
        overlappedElementPage.enterTextInNameField("Shibahar");

        Log.info("Finally Validate the Text In Name Field");
        overlappedElementPage.validateTextInField();

        Log.info("TC_03_ENTERING_TEXT_IN_OVERLAPPED_ELEMENT_VALIDATION Passed");

    }





    @Test(priority=4)
    public void TC04_Non_Breaking_Space() {



        Log.info("Non Breaking Space Click");
        homePage.nonBreakingSpaceClick();

        Log.info("Validate button text");
        nonBreakingSpacePage.validateButtonTextWithUniqueXpath();

        Log.info("TC05_Non_Breaking_Space Passed");

    }


    @Test(priority=5)
    public void TC05_VISIBILITY_TEST() {

        //{Scenario
        //Learn locators of all buttons.
        //In your testing scenario press Hide button.
        //Determine if other buttons visible or not.
        //}



        Log.info("Clicking on ajax data link in home page");
        homePage.visiblityLinkClick();

        Log.info("Clicking on ajax data link in home page");
        visibiltyPage.verifyButtonsDisplay();


        visibiltyPage.verifyButtonsInvisiblity();

        Log.info("TC06_VISIBILITY_TEST Passed");

    }




    @Test(priority=6)
    public void TC06_AJAX_DATA_TEST() throws Exception {

        //{Record the following steps. Press the button below and wait for data to appear (15 seconds), click on text of the loaded label.
        //Then execute your test to make sure it waits for label text to appear.}



        Log.info("Clicking on ajax data link in home page");
        homePage.ajaxDataClick();

        Log.info("click on Ajax RequestButton And validate the text");
        ajaxDataPage.clickAjaxRequestButtonAndValidate();

        Log.info("TC09_AJAX_DATA_TEST Passed");

    }


    @Test(priority=7)
    public void TC7_LOAD_DELAY_TEST() throws Exception {

        //{Scenario
        //Navigate to Home page and record Load Delays link click and button click on this page.
        //Then play the test. It should wait until page is loaded.}


        Log.info("Clicking on load delay link in home page");
        homePage.loadDelayClick();

        Log.info("Waiting for the button to load");
        loadDelayPage.waitForButtonLoad();

        Log.info("TC10_LOAD_DELAY_TEST PASSED");

    }



//    @Test(priority=7)
//    public void TC07_MOUSE_HOVER_TEST() throws Exception {
//
//        //{Record 2 consecutive link clicks.
//        //Execute the test and make sure that click count is increasing by 2.}
//
//        homePage.mouseHoverClick();
//        mouseHoverPage.clickmeMouseHoverAndClick();
//        mouseHoverPage.mousehoverPlayGround();
//        mouseHoverPage.clickmeMouseHoverAndClick();
//        mouseHoverPage.validateCount();
//
//    }
//
//
//    @Test(priority=8)
//    public void TC08_SAMPLE_APP_TEST() {
//
//        //{Fill in and submit the form. For successfull login use any non-empty user name and `pwd` as password.}
//
//        homePage.sampleAppClick();
//        sampleAppPage.logInValidation("testuser", "pwd");
//        sampleAppPage.logOutValidation();
//        sampleAppPage.logInErrorValidation("testuser", "pwd123");
//
//    }

//    @Test(priority=4)
//    public void TC04_TEXT_INPUT_VALIDATION() throws Exception {
//
//        //{Record setting text into the input field and pressing the button.
//        //Then execute your test to make sure that the button name is changing.}
//
//        homePage.textInputLinkClick();
//        textInputPage.validateButtonText("nametest");

//    }


}
