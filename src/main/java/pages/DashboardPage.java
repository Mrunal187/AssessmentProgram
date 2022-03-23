package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    }
    public DashboardPage() throws IOException {
        PageFactory.initElements(webDriver,this);
    }
}
