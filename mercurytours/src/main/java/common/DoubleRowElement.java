package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DoubleRowElement extends BaseElement {

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

        List<WebElement> firstCellElements = this.rootElement.findElements(By.xpath("./td"));

        for (int index = 0; index < firstCellElements.size(); index++) {
            this.firstRowCellElements.add(new CellElement(this.columns.get(index), firstCellElements.get(0)));
        }

        List<WebElement> secondCellElements = this.secondaryElement.findElements(By.xpath("./td"));

        for (int index = 0; index < secondCellElements.size(); index++) {
            this.secondRowCellElements.add(new CellElement(this.columns.get(1), secondCellElements.get(0)));
        }
    }

    public CellElement getCellByColumnFromFirstRow(String column) {
        for(CellElement cellElement : this.firstRowCellElements) {
            if(cellElement.getColumnName().equals(column)) {
                return cellElement;
            }
        }

        return null;
    }

    public CellElement getCellByColumnFromSecondRow(String column) {
        for(CellElement cellElement : this.secondRowCellElements) {
            if(cellElement.getColumnName().equals(column)) {
                return cellElement;
            }
        }

        return null;
    }
}
