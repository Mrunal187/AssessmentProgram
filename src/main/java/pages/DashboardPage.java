package pages;

import base.Base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class DashboardPage extends Base {
    //Page Factory
    @FindBy(xpath="//span[contains(text(),'Insights')]")
    WebElement insights;
    @FindBy(xpath = "//body/div[2]/aside[1]/section[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]/i[1]")
    WebElement timeAttendance;
    public void clickInsight()
    {
        insights.click();
        timeAttendance.click();
        takeScreenshot();

    }
    public static void takeScreenshot() {

        File screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
        //Copy the file
        try {
            FileUtils.copyFile(screenshot, new File("C:src/main/resources/screenshot/sc.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public DashboardPage() throws IOException {
        PageFactory.initElements(webDriver,this);
    }
}
