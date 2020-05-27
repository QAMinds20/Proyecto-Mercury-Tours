package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftMenuSection extends BaseSection {

	private WebElement flightsLink;

	private WebElement cruisesLink;

	private WebElement homeLink;

	public LeftMenuSection(WebDriver driver) {
		super(driver);
	}

	public boolean isLoaded() {
		try{
			WebDriverWait wait = new WebDriverWait(this.driver, 5);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table")));
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

	public void clickOnFlights() {
		flightsLink.findElement(By.xpath("//a[text()='Flights']"));
		flightsLink.click();
	}

	public void clickOnCruises() {
		cruisesLink.findElement(By.xpath("//a[text()='Cruises']"));
		cruisesLink.click();
	}

	public void clickOnHome() {
		homeLink.findElement(By.xpath("//a[text()='Home']"));
		homeLink.click();
	}

}

