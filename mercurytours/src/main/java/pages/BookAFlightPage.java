package pages;

import org.openqa.selenium.WebDriver;
import sections.PassengerSection;

public class BookAFlightPage extends BasePage {

	//All Sections inside the Page
	private SummarySection summarySection;


    private PassengerSection passengerSection;

	public BookAFlightPage(WebDriver driver) {
        super(driver,driver.getCurrentUrl());
        //All related sections will be here
        this.summarySection = new SummarySection(this.driver);
        this.passengerSection = new PassengerSection(this.driver);
    }

    //get SummarySection
    public SummarySection getSummarySection() {
    	
    	return this.summarySection;    	
    }

    //get PassengerSection
    public PassengerSection getPassengerSection() {    	
    	return this.passengerSection;
    }

}