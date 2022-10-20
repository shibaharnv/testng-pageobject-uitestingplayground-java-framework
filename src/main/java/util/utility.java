package util;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

public class utility {

    static Properties properties;
    static InputStream input;






    public static Properties loadProperties(String path) {
        try {
            input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            return properties;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


    public static String dateAndTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy:MM:dd_HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dateAndTimeString=dtf.format(now).toString();
        return dateAndTimeString;
    }



//    public static String takeScreenshotMethod(WebDriver driver) throws IOException {
//
//
//        TakesScreenshot ts= (TakesScreenshot) driver;
//
//        String screenshoPath=System.getProperty("user.dir")+"/ScreenShots/UiTestingScreenshot+"+dateAndTime()+".jpeg";
//
//        File src=ts.getScreenshotAs(OutputType.FILE);
//
//        File tar = new File(screenshoPath);
//
//        FileUtils.copyFile(src,tar);
//
//        return screenshoPath;
//
//
//
//
//    }


}
