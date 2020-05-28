package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpecialSection extends BaseSection{

    private List<WebElement> topDestinations;

    public SpecialSection(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded() {
        return true;
    }

    public void checkDestinations() {


    }


}
