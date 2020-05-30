package testCasesMercury;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignonPage;

import java.util.List;

public class PreferencesTestCases extends BaseTest {

    HomePage homePage = new HomePage(driver);

    @Test(alwaysRun = true, priority = 0)
    @Story("TC27_Home Page - Preferences_Only one option is allowed to select on Service Class section")
    @Description("Validate that only one option is allowed to be selected, the radio button option is highlighted when the option is selected and the other options are not")
    public void validateOneOptionIsAllowedToSelectOnServiceClassSection(){

        //WebElement radio_economy = driver.findElement(By.xpath("//input[@value='Coach']"));
        //WebElement radio_business = driver.findElement(By.xpath("//input[@value='Business']"));
        //WebElement radio_first = driver.findElement(By.xpath("//input[@value='First']"));

        //Recorrer la lista de los radio button de preferences
        List<WebElement> radio_serviceClass = driver.findElements(By.name("servClass"));
        radio_serviceClass.get(0).isSelected();

        //Si el primer radio button está seleccionado por default, no debería haber más de una opción elegida.
        if (radio_serviceClass.get(0).isSelected()) {
            System.out.println("Economy Class está seleccionado por default");
        } else {
            System.out.println("Error!! No puede haber más de una opción seleccionada en esta sección.");
        }

        //Assert para saber que la opción del index 0 está seleccionada
        Assert.assertEquals(radio_serviceClass.get(0).isSelected(),true);

        //Assert para saber que la opción del index 1 NO está seleccionada
        Assert.assertEquals(radio_serviceClass.get(1).isSelected(),false);

        //Assert para saber que la opción del index 2 NO está seleccionada
        Assert.assertEquals(radio_serviceClass.get(2).isSelected(),false);

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC28_Home Page - Preferences_Only one option is allowed to select on Airline dropdown")
    @Description("Validate that only one option is allowed to be selected on the dropdown field, and the option selected is displayed on the field")
    public void validateArlineDropdownOptionIsAllowed(){

        //Create dropdown element
        WebElement airlineDropdown = driver.findElement(By.name("airline"));
        Select dropdown = new Select(airlineDropdown);

        //Get first selection that appears by default and get the name
        String no_preferenceOption = dropdown.getFirstSelectedOption().getText();
        System.out.println(no_preferenceOption);

        //Verify if dropdown is not multiple
        if (!dropdown.isMultiple()) {
            System.out.println("El dropdown no acepta múltiples valores");
        } else {
            System.out.println("ERROR! No se debería poder elegir dos opciones a la vez");
        }

        //Assert to verify No Preference exist as default in the dropdown
        Assert.assertEquals(no_preferenceOption, "No Preference");

        //Assert to verify that dropdown is nos multiple
        Assert.assertEquals(!dropdown.isMultiple(), true);

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC29_Home Page - Preferences_Preferences default options")
    @Description("Validate that the Preferences has default options selected")
    public void validatePreferencesOptions() {

        //Recorrer la lista de los radio button de preferences para obtenr el valor que aparece por default
        List<WebElement> radio_serviceClass = driver.findElements(By.name("servClass"));
        radio_serviceClass.get(0).isSelected();
        System.out.println("El vaslor por default de Service Class es: " + " " + radio_serviceClass.get(0).getText());

        //Create dropdown element to verify the default option
        WebElement airlineDropdown = driver.findElement(By.name("airline"));
        Select dropdown = new Select(airlineDropdown);

        //Get first selection that appears by default and get the name
        String no_preferenceOption = dropdown.getFirstSelectedOption().getText();
        System.out.println(no_preferenceOption);

        //Assert to verify No Preference exist as default in the dropdown
        Assert.assertEquals(no_preferenceOption, "No Preference");


    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC30_Home Page - Preferences_Select Continue button")
    @Description("Validate by selecting 'Continue' button, 'Select flight' page is displayed")
    public void validateSelectFlightPageIsDisplayed(){

        //Hacer click en el botón de "Continue"
        WebElement continueBtn = driver.findElement(By.name("findFlights"));
        continueBtn.click();

        //Cade de texto para corroborar que pasamos a la siguiente página de seleccionar vuelos
        String expectedSelectFlightPAge = "Select your departure and return flight from the selections below. Your total price will "
                +"be higher than quoted if you elect to fly on a different airline for both legs of your "
                +"travel ";

        //Assert para verificar que el mensaje que esperamos sea el correcto
        Assert.assertEquals(homePage.getFlightMessage(), expectedSelectFlightPAge);

    }
}
