package testCasesMercury;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverFactory;

public class BaseTest {


    private WebDriver myDriver;

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        //Defines browser to be utilized
        String browser = "chrome";

        //Generate driver for selected browser
        myDriver = WebDriverFactory.getDriver(browser);

        //Setting up Page Load and Implicit wait values for the browser
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        myDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        //Closing driver
        myDriver.close();
        myDriver.quit();

    }

}
