import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import java.io.IOException;
import java.rmi.Remote;

public class DashboardTest extends Base {
    LoginPage loginPage;
   // TestUtil testUtil;
    DashboardPage dashboardPage;
    public DashboardTest() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
     //   testUtil = new TestUtil();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("name"), prop.getProperty("password"));
    }
    @Test
    public void insightTest()
    {
        dashboardPage.clickInsight();
    }
}
