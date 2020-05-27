package testCasesMercury;

import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.WebDriverFactory;

public class BaseTest {

    protected WebDriver driver;

    private static final String MERCURY_TOURS_MAIN_PAGE = "http://newtours.demoaut.com/";

    public static void open(WebDriver driver) {
        driver.get(MERCURY_TOURS_MAIN_PAGE);
    }

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        //Defines browser to be utilized
        String browser = "chrome";
        //Generate driver for selected browser
        driver = WebDriverFactory.getDriver(browser);
        //Setting up Page Load and Implicit wait values for the browser
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        //Closing driver
        driver.close();
        driver.quit();
    }

}
