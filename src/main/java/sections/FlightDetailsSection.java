package sections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class FlightDetailsSection extends BaseSection{

    private List<WebElement> tripType;

    private Select passengersCount;

    private Select departingFrom;

    private Select monthOn;

    private Select dayOn;

    private Select arrivingIn;

    private Select monthReturn;

    private Select dayReturn;

    public FlightDetailsSection(WebDriver driver){
        super(driver);
        tripType=driver.findElements(By.cssSelector("input[name='tripType']"));
        passengersCount= (Select) driver.findElement(By.cssSelector("select[name='passCount']"));
        departingFrom= (Select) driver.findElement(By.cssSelector("select[name='fromPort']"));
        monthOn= (Select) driver.findElement(By.cssSelector("select[name='fromMonth']"));
        dayOn= (Select) driver.findElement(By.cssSelector("select[name='fromDay']"));
        arrivingIn= (Select) driver.findElement(By.cssSelector("select[name='toPort']"));
        monthReturn= (Select) driver.findElement(By.cssSelector("select[name='toMonth']"));
        dayReturn= (Select) driver.findElement(By.cssSelector("select[name='toDay']"));

    }

    public void clickOnType(int index){
        this.tripType.get(index).click();
    }

    public void selectPassenger(int index){
        this.passengersCount.selectByIndex(index);
    }

    public void selectDepartureFrom(String departure){
        this.departingFrom.selectByVisibleText(departure);
    }

    public void selectDepartureFrom(int index){
        this.departingFrom.selectByIndex(index);
    }

    public void selectMonthOn(int index){
        this.monthOn.selectByIndex(index);
    }

    public void selectDayOn(
            int index){this.dayOn.selectByIndex(index);
    }

    public void selectArriving(int index){
        this.arrivingIn.selectByIndex(index);
    }

    public void selectArriving(String arrivingIn){
        this.arrivingIn.selectByVisibleText(arrivingIn);
    }

    public void selectMonthReturn(int index){
        this.monthReturn.selectByIndex(index);
    }

    public void selectDayReturn(int index){
        this.dayReturn.selectByIndex(index);
    }

    public List<WebElement> getTripType() {
        return tripType;

    }

    public Select getPassengersCount() {
        return passengersCount;

    }

    public Select getDepartingFrom() {
        return departingFrom;

    }

    public Select getMonthOn() {
        return monthOn;

    }

    public Select getDayOn() {
        return dayOn;

    }

    public Select getArrivingIn() {
        return arrivingIn;

    }

    public Select getMonthReturn() {
        return monthReturn;

    }

    public Select getDayReturn() {
        return dayReturn;

    }

    public String getFirstPassengerSelectedOption () {
        return this.passengersCount.getFirstSelectedOption().getText();
    }

    public String getLastPassengerSelectedOption () {
        return this.passengersCount.getOptions().get(3).getText();
    }

    public String getdepartingFromSelectedOption () {

        return this.departingFrom.getFirstSelectedOption().getText();
    }

    public String getmonthOnSelectedOption () {

        return this.monthOn.getOptions().get(5).getText();
    }

    public String getdayOnSelectedOption () {

        return this.dayOn.getOptions().get(30).getText();
    }

    public String getarrivingInSelectedOption () {

        return this.arrivingIn.getOptions().get(1).getText();
    }

    public String getmonthReturnSelectedOption () {

        return this.monthReturn.getOptions().get(5).getText();
    }

    public String getdayReturnSelectedOption () {

        return this.dayReturn.getOptions().get(30).getText();
    }

}
