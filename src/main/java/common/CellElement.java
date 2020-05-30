package common;

import org.openqa.selenium.WebElement;

public class CellElement {

    //private String columnName;
    private WebElement cellValue;

    public CellElement(/*String columnName,*/ WebElement cellValue) {
        //this.columnName = columnName;
        this.cellValue = cellValue;
    }

    /*public String getColumnName() {
        return columnName;
    }*/

    public WebElement getCellValue() {
        return cellValue;
    }
}
