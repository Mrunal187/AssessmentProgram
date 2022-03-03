import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import testutil.TestUtil;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginTest extends Base {
    LoginPage login;
    DashboardPage dashboardPage;

    public LoginTest() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        login = new LoginPage();
    }

    @DataProvider
    public Object[][] getLoginData() throws FileNotFoundException {
        Object data[][]= TestUtil.getTestData("src/main/resources/Excel/LoginData1.xlsx","Sheet1");
        return data;
    }
    @Test(dataProvider = "getLoginData")
    public void LoginPageTest(String name,String password) throws IOException {
        dashboardPage = login.login(name,password);
    }
    /*@AfterMethod
    public void tearDown()
    {
        webDriver.close();
    }*/
}
