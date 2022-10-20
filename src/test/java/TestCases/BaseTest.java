package TestCases;

import Pages.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import util.utility;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {


    protected HomePage homePage;


    protected DynamicIdPage dynamicIdPage;

    protected DynamicWebTablePage dynamicWebTablePage;

    protected OverlappedElementPage overlappedElementPage;

    protected TextInputPage textInputPage;

    protected NonBreakingSpacePage nonBreakingSpacePage;

    protected MouseHoverPage mouseHoverPage;


    protected VisibiltyPage visibiltyPage;

    protected SampleAppPage sampleAppPage;

    protected AjaxDataPage ajaxDataPage;

    protected LoadDelayPage loadDelayPage;
    //WebDriver driver;

    protected static WebDriver driver;
    Properties properties;
    static String URL;
    ChromeOptions options;


    @BeforeSuite(alwaysRun=true)
    public void setUp() {

        String propertyPath = System.getProperty("user.dir") + "//src//test//resources//Env.properties";
        try {

            String executionModeValue =System.getProperty("executionMode");
            if(executionModeValue.equalsIgnoreCase("Local"))
            {
                //Driver Configuration
                 options = new ChromeOptions();
                options.setHeadless(false);
                driver = WebDriverManager.chromedriver().capabilities(options).create();
            }

            if(executionModeValue.equalsIgnoreCase("docker") || executionModeValue.equalsIgnoreCase("remote"))
            {
                //Driver Configuration
                 options = new ChromeOptions();
                options.setHeadless(true);

                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--headless");
                options.addArguments("--disable-extensions");
                options.addArguments("--no-sandbox");
                driver = WebDriverManager.chromedriver().capabilities(options).create();
            }




            //Loading global values

            properties = utility.loadProperties(propertyPath);
            URL = properties.getProperty("URL");

            //Object creation for pages

            homePage = new HomePage(driver);
            dynamicIdPage = new DynamicIdPage(driver);
            dynamicWebTablePage = new DynamicWebTablePage(driver);
            overlappedElementPage = new OverlappedElementPage(driver);
            textInputPage = new TextInputPage(driver);
            nonBreakingSpacePage = new NonBreakingSpacePage(driver);
            visibiltyPage = new VisibiltyPage(driver);
            mouseHoverPage = new MouseHoverPage(driver);
            sampleAppPage = new SampleAppPage(driver);
            ajaxDataPage = new AjaxDataPage(driver);
            loadDelayPage = new LoadDelayPage(driver);

            driver.get(URL.toString());
            driver.manage().window().maximize();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }




    @AfterMethod
    public void afterEveryTestCase(ITestResult result) throws InterruptedException, IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            driver.get(URL.toString());
        }
        driver.navigate().back();
        Thread.sleep(2000);


    }


    @BeforeTest
    public void BeforeAllTests() {
        System.out.println("Testcases execution started please wait ...");
    }

    @AfterTest
    public void AfterAllTests() {
        System.out.println("Testcases execution completed");
    }


    @AfterSuite
    public void destroyDriver() {
        driver.quit();
    }
}