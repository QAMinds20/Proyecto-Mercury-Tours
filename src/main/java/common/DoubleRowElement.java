package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoubleRowElement extends BaseElement {

    //HashMap declaration **
    private HashMap<String, CellElement> row;

    //Esto puede ser un Map para facilitar la busqueda de celdas por columna
    private List<CellElement> firstRowCellElements;
    //Esto puede ser un Map para facilitar la busqueda de celdas por columna
    private List<CellElement> secondRowCellElements;
    private List<String> columns;
    private WebElement secondaryElement;

    public DoubleRowElement(WebElement rootElement, WebElement secondaryElement, List<String> columns) {
        super(rootElement);
        this.secondaryElement = secondaryElement;
        this.columns = columns;
        this.init();
    }

    private void init() {
        this.firstRowCellElements = new ArrayList<>();
        this.secondRowCellElements = new ArrayList<>();

        //Hash Map**
        this.row = new HashMap<String, CellElement>();

        List<WebElement> firstCellElements = this.rootElement.findElements(By.xpath("./td"));


        /*
        for (int index = 0; index < firstCellElements.size(); index++) {
            this.firstRowCellElements.add(new CellElement(this.columns.get(index), firstCellElements.get(0)));
        }*/

        for (int index = 0; index < firstCellElements.size(); index++) {
            this.row.put(this.columns.get(index),new CellElement(firstCellElements.get(0)));
        }

        List<WebElement> secondCellElements = this.secondaryElement.findElements(By.xpath("./td"));

        /*
        for (int index = 0; index < secondCellElements.size(); index++) {
            this.secondRowCellElements.add(new CellElement(this.columns.get(1), secondCellElements.get(0)));
        }*/

        for (int index = 0; index < secondCellElements.size(); index++) {
            this.row.put(this.columns.get(columns.size()-1),new CellElement(firstCellElements.get(0)));
        }

    }

    public CellElement getCellByColumn/*FromFirstRow*/(String column) {
        //Possible values for "column" value = SELECT, FLIGHT, DEPART, STOPS, PRICE
        CellElement c = null;
        /*for(CellElement cellElement : this.firstRowCellElements) {
            if(cellElement.getColumnName().equals(column)) {
                return cellElement;
            }
        }*/

        if(this.row.containsKey(column)){
                c = this.row.get(column);
            }

        return c;
    }



    /*public CellElement getCellByColumnFromSecondRow(String column) {
        for(CellElement cellElement : this.secondRowCellElements) {
            if(cellElement.getColumnName().equals(column)) {
                return cellElement;
            }
        }

        return null;
    }*/
}
