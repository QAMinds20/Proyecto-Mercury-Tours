package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TableElement extends BaseElement {

    private Hashtable<Integer, DoubleRowElement> table;
    //this will store the column headers **
    private List<String> columns;

    public TableElement(WebElement root) {
        super(root);
        this.table = new Hashtable<>();
        this.init();
    }

    private void init() {
        //Columnas
        this.columns = new ArrayList<>();
        List<WebElement> columnElements = this.rootElement.findElements(By.xpath(".//td[contains(@class, '_header_')]"));

        for(WebElement column : columnElements) {
            this.columns.add(column.getText());
        }

        //adding Price column to columns **
        this.columns.add("PRICE");

        //Rows
        List<WebElement> mainRowElements = this.rootElement.findElements(By.xpath(".//tr[child::td[@class = 'frame_action_xrows']]"));
        List<WebElement> priceRowElements = this.rootElement.findElements(By.xpath(".//tr[child::td[@class = 'data_verb_xcols']]"));

        for(int index = 0; index < mainRowElements.size(); index++) {
            this.table.put(index + 1, new DoubleRowElement(mainRowElements.get(index), priceRowElements.get(index), this.columns));
        }
    }

    public List<String> getColumnNames() {
        return this.columns;
    }

    public DoubleRowElement getRowByIndex(Integer index) {
        return this.table.get(index);
    }


    /*public DoubleRowElement getRowByTime(String time) {
        List<DoubleRowElement> rows = new ArrayList<>(this.table.values());

        for (DoubleRowElement row : rows) {
            if(row.getCellByColumnFromFirstRow("Depart").getCellValue().getText().equals(time)) {
                return row;
            }
        }

        for (DoubleRowElement row : rows) {
            if (row.getCellByColumn("DEPART").getCellValue().getText().equals(time)) {
                return row;
            }

        }

        return null;
    }*/

    public DoubleRowElement getRowByValueInColumn(String columnName, String value) {
        /*This method extracts a row based on the criteria entered as parameter.
        Possible values for columnName are = SELECT, FLIGHT, DEPART, STOPS, PRICE.
        */

        List<DoubleRowElement> rows = new ArrayList<>(this.table.values());


        for (DoubleRowElement row : rows) {
            if (row.getCellByColumn(columnName).getCellValue().getText().equals(value)) {
                return row;
            }

        }

        return null;
    }

    public List<String> getTopInformation() {
        //This shall return the column headers for the depart and return tables on select a flight page (depart/return, cities, date)

        List<WebElement> flightSummaryElements = this.rootElement.findElements(By.xpath(".//td[@class='title']"));

        List<String> flightInfo = new ArrayList<>();

        for(WebElement e : flightSummaryElements){
            if(!e.getText().equals(" ")){
                flightInfo.add(e.getText());
            }
        }

        return flightInfo;
    }
}