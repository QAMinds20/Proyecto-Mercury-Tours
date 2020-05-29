package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BookAFlightSection extends BaseSection {
    public BookAFlightSection(WebDriver driver) {
        super(driver);
    }

    //BAF means Book A Flight
    @FindBy(how = How.NAME, using = "passFirst0")
    private WebElement firstNameBAF;

    @FindBy(how = How.NAME, using = "passLast0")
    private WebElement lastNameBAF;

    @FindBy(how = How.NAME, using = "pass.0.meal")
    private WebElement mealSelectBAF;


    public void setFirstName(String firstname) {
        firstNameBAF.sendKeys(firstname);
    }

    public void setLastName(String lastname) {
        lastNameBAF.sendKeys(lastname);
    }

    public void selectMeal(String mealname) {
        Select select = new Select(mealSelectBAF);
        select.selectByVisibleText(mealname);
    }
}
