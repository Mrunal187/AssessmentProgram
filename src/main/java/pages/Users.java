package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Users extends Base {
   // Select system = new Select(webDriver.findElement(By.xpath("//span[normalize-space()='Admin']")));
    @FindBy(xpath="//span[normalize-space()='Admin']")
    WebElement users;
    @FindBy(xpath="//a[normalize-space()='Qualifications Setup']")
    WebElement qualification;
    @FindBy(xpath="//span[normalize-space()='Add New']")
    WebElement addnewbutton;
    @FindBy(id="name")
    WebElement firstname;
    @FindBy(id="description")
    WebElement desc;
    @FindBy(xpath="//span[normalize-space()='Save']")
    WebElement button;
    public void addUser(String name,String description) throws IOException{
        try {
            System.out.println("Im in this block");
           // system.deselectByValue("5");
            users.click();
            qualification.click();
            addnewbutton.click();
            firstname.sendKeys(name);
            desc.sendKeys(description);
            button.click();


            /*email.sendKeys(name);
            pass.sendKeys(password);
            buttonlogin.click();*/
        }
        catch (NoSuchElementException nee)
        {
            nee.printStackTrace();
        }
        catch (WebDriverException wde)
        {
            wde.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public Users() throws IOException {
        PageFactory.initElements(webDriver,this);

    }
}
