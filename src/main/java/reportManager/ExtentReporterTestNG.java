package reportManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import util.utility;

import java.io.File;

public class ExtentReporterTestNG {

    public static ExtentReports getReportObject()
    {
        ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/UiTestingPlayGroundReport+" + utility.dateAndTime() + ".html"));

        ExtentReports extreport = new ExtentReports();
        extreport.attachReporter(htmlreporter);
        extreport.setSystemInfo("Tester","Shibahar");
        return extreport;
    }
}
