package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

	protected WebDriver driver;
    protected String baseURL;

	protected	HomePage homePage;
	protected	SignonPage signonPage;
	protected	RegisterPage registerPage;
	protected	SignonSuccessPage signonSuccessPage;
	protected	BookAFlightPage bookAFlightPage;
	protected	FlightFinderPage flightFinderPage;
	protected	SelectFlightPage selectFlightPage;

    public BasePage(WebDriver driver,String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
        initSections();
        PageFactory.initElements(driver,this);
    }

    private void initSections() {
        if(this.isLoaded()) {
            homePage = new HomePage(driver);
            signonPage = new SignonPage(driver);
			registerPage = new RegisterPage(driver);
			signonSuccessPage = new SignonSuccessPage(driver);
			bookAFlightPage = new BookAFlightPage(driver);
			flightFinderPage = new FlightFinderPage(driver);
			selectFlightPage = new SelectFlightPage(driver);

        }
    }

    public boolean isLoaded() {
        return true;
    }

}
