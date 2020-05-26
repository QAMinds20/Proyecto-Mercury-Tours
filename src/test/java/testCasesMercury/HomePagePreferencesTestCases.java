package testCasesMercury;

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HomePagePreferencesTestCases {

    @Test(alwaysRun = true, priority = 0)
    @Story("TC27_Home Page - Preferences_Only one option is allowed to select on Service Class section")
    @Description("Validate that only one option is allowed to be selected, the radio button option is highlighted when the option is selected and the other options are not")
    public void validateOneOptionIsAllowedToSelectOnServiceClassSection(){

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC28_Home Page - Preferences_Only one option is allowed to select on Airline dropdown")
    @Description("Validate that only one option is allowed to be selected on the dropdown field, and the option selected is displayed on the field")
    public void validateArlineDropdownOptionIsAllowed(){


    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC29_Home Page - Preferences_Preferences default options")
    @Description("Validate that the Preferences has default options selected")
    public void validatePreferencesOptions(){


    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC30_Home Page - Preferences_Select Continue button")
    @Description("Validate by selecting 'Continue' button, 'Select flight' page is displayed")
    public void validateSelectFlightPageIsDisplayed(){

    }
}
