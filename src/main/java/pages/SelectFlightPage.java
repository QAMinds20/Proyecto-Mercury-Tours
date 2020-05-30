package pages;

import common.DoubleRowElement;
import common.TableElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlightPage {

    private TableElement departTableElement;

    private TableElement returnTableElement;

    public SelectFlightPage(WebDriver driver) {
        this.departTableElement = new TableElement(driver.findElement(By.xpath("//form/table[1]")));
        this.returnTableElement = new TableElement(driver.findElement(By.xpath("//form/table[2]")));
    }

    public void selectAFlightByTime(String flightType, String time) {
        switch(flightType.toUpperCase()) {
            case "DEPART":
                DoubleRowElement departRow = this.departTableElement.getRowByValueInColumn("DEPART",time);
                departRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            case "RETURN":
                DoubleRowElement returnRow = this.returnTableElement.getRowByValueInColumn("DEPART",time);
                returnRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            default:
                System.out.println("Bad type");
        }
    }

    public void selectAFlightByPrice(String flightType, String price) {
        switch(flightType.toUpperCase()) {
            case "DEPART":
                DoubleRowElement departRow = this.departTableElement.getRowByValueInColumn("PRICE",price);
                departRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            case "RETURN":
                DoubleRowElement returnRow = this.returnTableElement.getRowByValueInColumn("PRICE",price);
                returnRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            default:
                System.out.println("Bad type");
        }
    }

    public void selectAFlightByAirline(String flightType, String airline) {
        switch(flightType.toUpperCase()) {
            case "DEPART":
                DoubleRowElement departRow = this.departTableElement.getRowByValueInColumn("FLIGHT",airline);
                departRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            case "RETURN":
                DoubleRowElement returnRow = this.returnTableElement.getRowByValueInColumn("FLIGHT",airline);
                returnRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            default:
                System.out.println("Bad type");
        }
    }

    public void selectAFlightByStops(String flightType, String stops) {
        switch(flightType.toUpperCase()) {
            case "DEPART":
                DoubleRowElement departRow = this.departTableElement.getRowByValueInColumn("STOPS",stops);
                departRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            case "RETURN":
                DoubleRowElement returnRow = this.returnTableElement.getRowByValueInColumn("STOPS",stops);
                returnRow.getCellByColumn("SELECT").getCellValue().click();
                break;
            default:
                System.out.println("Bad type");
        }
    }

    public void clickOnContinue(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
    }

    public boolean continueButtonIsAvailableAndEnable(WebDriver driver){
        driver.findElement(By.xpath("//input[@name='reserveFlights']")).isDisplayed();
        driver.findElement(By.xpath("//input[@name='reserveFlights']")).isEnabled();
        return true;
    }
}