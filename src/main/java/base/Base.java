package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public static Properties prop;
    public static WebDriver webDriver;
    public Base() throws IOException
    {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void initialization()
    {
        String brouserName = prop.getProperty("brouser");
        if(brouserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().window().maximize();
            webDriver.manage().deleteAllCookies();
            // webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            webDriver.get(prop.getProperty("url"));
        }
        System.out.println("updated");
        System.out.println("updated1");

    }
    }
