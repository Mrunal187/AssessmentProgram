import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.Users;

import java.io.IOException;

public class UserTest extends Base {
    LoginPage loginPage;
    //Users users;
    DashboardPage dashboardPage;

    public UserTest() throws IOException {
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
    public void userTest() throws IOException {
        Users users = new Users();
        users.addUser(prop.getProperty("firstname"), prop.getProperty("desc"));

    }
}
