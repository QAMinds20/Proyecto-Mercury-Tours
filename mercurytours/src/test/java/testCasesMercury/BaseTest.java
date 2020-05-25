package testCasesMercury;

import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;

    public void setUp() {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
