package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import reportManager.ExtentReporterTestNG;


public class Listeners implements ITestListener {

          public   ExtentReports extreport= ExtentReporterTestNG.getReportObject();
          public ExtentTest extTest;

    public void onStart(ITestContext context) {


    }

    public void onFinish(ITestContext context) {

        extreport.flush();

    }

    public void onTestStart(ITestResult result) {


        extTest=extreport.createTest(result.getMethod().getMethodName());
        extTest.info("Starting the testcase execution for "+result.getMethod().getMethodName()+"");
        System.out.println("Starting the testcase execution for "+result.getMethod().getMethodName()+"");

    }



    public void onTestSuccess(ITestResult result) {

        extTest.log(Status.PASS,"Test Passed for "+result.getMethod().getMethodName()+"");


    }

    public void onTestFailure(ITestResult result) {
        extTest.log(Status.FAIL,"Test Failed");
        extTest.fail(result.getThrowable());
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

}
