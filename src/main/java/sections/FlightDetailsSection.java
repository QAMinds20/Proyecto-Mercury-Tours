package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightDetailsSection extends BaseSection{

    private WebElement tripType;

    private WebElement passengersCount;

    private WebElement departingFrom;

    private WebElement monthOn;

    private WebElement dayOn;

    private WebElement arrivingIn;

    private WebElement monthReturn;

    private WebElement dayReturn;

    public FlightDetailsSection(WebDriver driver){
        super(driver);
    }

    public void clickOnType(){

    }

    public void selectPassenger(){

    }

    public void selectDepartureFrom(){

    }

    public void selectMonthOn(){

    }

    public void selectDayOn(){

    }

    public void selectArriving(){

    }

    public void selectMonthReturn(){

    }

    public void selectDayReturn(){

    }

    public WebElement getTripType() {
        return tripType;
    }

    public WebElement getPassengersCount() {
        return passengersCount;
    }

    public WebElement getDepartingFrom() {
        return departingFrom;
    }

    public WebElement getMonthOn() {
        return monthOn;
    }

    public WebElement getDayOn() {
        return dayOn;
    }

    public WebElement getArrivingIn() {
        return arrivingIn;
    }

    public WebElement getMonthReturn() {
        return monthReturn;
    }

    public WebElement getDayReturn() {
        return dayReturn;
    }

    public String getFirstPassengerSelectedOption () {

        Select selectDropdown = new Select(this.passengersCount);

        return selectDropdown.getFirstSelectedOption().getText();
    }

    public String getLastPassengerSelectedOption () {


        Select selectDropdown = new Select(this.passengersCount);

        return selectDropdown.getOptions().get(3).getText();
    }

    public String getdepartingFromSelectedOption () {

        Select selectDropdown = new Select(this.departingFrom);

        return selectDropdown.getFirstSelectedOption().getText();
    }

    public String getmonthOnSelectedOption () {

        Select selectDropdown = new Select(this.monthOn);

        return selectDropdown.getOptions().get(5).getText();
    }

    public String getdayOnSelectedOption () {

        Select selectDropdown = new Select(this.dayOn);

        return selectDropdown.getOptions().get(30).getText();
    }

    public String getarrivingInSelectedOption () {

        Select selectDropdown = new Select(this.arrivingIn);

        return selectDropdown.getOptions().get(1).getText();
    }

    public String getmonthReturnSelectedOption () {

        Select selectDropdown = new Select(this.monthReturn);

        return selectDropdown.getOptions().get(5).getText();
    }

    public String getdayReturnSelectedOption () {

        Select selectDropdown = new Select(this.dayReturn);

        return selectDropdown.getOptions().get(30).getText();
    }

}
