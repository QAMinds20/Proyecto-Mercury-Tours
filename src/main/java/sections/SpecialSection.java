package sections;

import org.openqa.selenium.WebDriver;
<<<<<<< HEAD

public class SpecialSection {
    public SpecialSection(WebDriver driver){

    }
=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SpecialSection extends BaseSection{


    @FindBy(how = How.XPATH, using = "//p/following-sibling::table/tbody/tr//tbody//td[1]")
    private List<WebElement> specialFlightsList;

    @FindBy(how = How.XPATH, using = "//p/following-sibling::table/tbody/tr//tbody//td[2]")
    private List<WebElement> specialPriceList;


    public SpecialSection(WebDriver driver) {
        super(driver);
    }

    public int getSpecialFlightListCount(){
        System.out.println(specialFlightsList.size());
        return specialFlightsList.size();
    }

    public List<String> getSpecialFlightList(){
        List<String> specialFlights = null;
        for (WebElement i : this.specialFlightsList){
            specialFlights.add(i.getText());
            System.out.println(i.getText());
        }
        return specialFlights;
    }

    public List<String> getSpecialPriceList(){
        List<String> specialPrices = null;
        for (WebElement i: this.specialPriceList){
            specialPrices.add(i.getText());
            System.out.println(i.getText());
        }
        return specialPrices;
    }



>>>>>>> dev
}
