package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RowElement extends BaseElement {

    private List<CellElement> cells;
    private List<String> columns;

    public RowElement(WebElement rootElement,List<String>columns)
    {
        super(rootElement);
        this.columns = columns;
        this.init();

    }

    private void init(){
        this.cells = new ArrayList<>();
        List<WebElement> cellElements = this.rootElement.findElements(By.xpath("./td"));

        for (int index = 0; index < cellElements.size(); index++){
            this.cells.add(new CellElement(this.columns.get(index), cellElements.get(0)));
        }
    }

    public CellElement getCellbyColumn(String column){
        for(CellElement cell : this.cells){
            if(cell.getColumnName().equals(column)){
                return cell;
            }
        }
        return null;
    }

}
