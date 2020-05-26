package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeftMenuSection extends BaseSection {

	private WebElement flightsLink;

	private WebElement cruisesLink;

	private WebElement homeLink;

	public LeftMenuSection(WebDriver driver) {
		super(driver);
	}

	public boolean isLoaded() {
		return true;
	}

	public void clickOnFlights() {

	}

	public void clickOnCruises() {

	}

	public void clickOnHome() {

	}

}