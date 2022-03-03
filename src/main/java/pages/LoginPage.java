package pages;

import base.Base;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends Base {
    public DashboardPage login;
    //Page Factory
    @FindBy(id="username")
    WebElement username;
    @FindBy(id="password")
    WebElement pass;
    @FindBy(xpath="//button[contains(text(),'Log in')]")
    WebElement button;


    public LoginPage() throws IOException {
        PageFactory.initElements(webDriver,this);
    }
    public DashboardPage login(String name, String password) throws IOException {
        try {
            username.sendKeys(name);
            pass.sendKeys(password);
            button.click();
        } catch (NoSuchElementException nee) {
            nee.printStackTrace();
        } catch (WebDriverException wde) {
            wde.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //DashboardPage DashboardPage = null;
        return new DashboardPage();
    }


}
