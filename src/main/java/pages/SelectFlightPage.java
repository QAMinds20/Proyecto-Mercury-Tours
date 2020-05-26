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
                DoubleRowElement departRow = this.departTableElement.getRowByTime(time);
                departRow.getCellByColumnFromFirstRow("SELECT").getCellValue().click();
                break;
            case "RETURN":
                DoubleRowElement returnRow = this.returnTableElement.getRowByTime(time);
                returnRow.getCellByColumnFromFirstRow("SELECT").getCellValue().click();
                break;
            default:
                System.out.println("Bad type");
        }
    }
}