package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;


public class DynamicWebTablePage extends BasePageClass {

    public DynamicWebTablePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@role='table']")
    WebElement tableId;

    @FindBy(xpath = "//div[@role='table']/div/div")
    WebElement tableRow;


    @FindBy(xpath = "//div[@role='table']/div/div/span[@role='columnheader']")
    List<WebElement> headings;

    @FindBy(xpath = "//div[@role='table']/div/div")
    List<WebElement> rows;




    public void verifydynamicTableExists()
    {
        webActionHelperMethods.verifyObjectExists(tableId);
    }



    public void compareChromeCpuValues() {
        webActionHelperMethods.verifyObjectExists(tableRow);

        //Capturing the cpu column index
        int cpuPostion = 0;
        for (int i = 0; i < headings.size(); i++) {
            if (headings.get(i).getText().equalsIgnoreCase("CPU")) {
                cpuPostion = i;
                break;
            }
        }


        //Finding out the row where we have chrome
        String finalValue="";
        for(int j=0;j< rows.size();j++)
        {
            System.out.println(rows.get(j).getText());

            if (rows.get(j).getText().contains("Chrome")) {


                finalValue= driver.findElement(By.xpath("//div[@role='table']/div/div["+j+"]/span[@role='cell']["+(cpuPostion+1)+"]")).getText();
                //xpath to fetch the chrome cpu value

                System.out.println(finalValue);
                finalValue=finalValue.replaceAll("[^0-9]", "");
                System.out.println(finalValue);
            }

        }

        String yellow_Text=driver.findElement(By.xpath("//p[@class='bg-warning']")).getText();

        yellow_Text=yellow_Text.replaceAll("[^0-9]", "");

        Assert.assertEquals(finalValue,yellow_Text);



    }
}
