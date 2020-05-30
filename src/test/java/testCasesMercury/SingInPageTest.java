package testCasesMercury;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import io.qameta.allure.*;
import pages.SignonPage;
import pages.HomePage;

public class SingInPageTest extends BaseTest {

	SignonPage sp = new SignonPage(myDriver);

	SoftAssert softAssertion = new SoftAssert();

	String expectedWelcomeMessage;
	String registerPageUrl;
	String homePageUrl;
	String singOnPageUrl;
	String validCopyright;
	
    @Test(alwaysRun = true, priority = 0)
    @Story("TC06_SingIn_Validate_WelcomeMessage")
    @Description("Validate the 'Welcome Message' from sing-on Page")
    public void validateWelcomeMessage(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(myDriver);

    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();

    	//Step 3 - Validate 'Welcome Message'
    	expectedWelcomeMessage = "Welcome back to Mercury Tours! "
    	+"Enter your user information to access the member-only areas of "
    	+"this site. If you don't have a log-in, please fill out the "
    	+"registration form.";

    	softAssertion.assertEquals(sp.getWelcomeMessage(), expectedWelcomeMessage);

    	//Step 4 - Close the browser
    	tearDown();
    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC07_SingIn_Validate_RegistrationFormLink")
    @Description("Validate that clicking on 'registration form' The user should be redirected to the 'Registration Page'")
    public void validateRegistrationFormLink(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(this.myDriver);

    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();


    	//Step 3 - Click on 'registration form link'
    	sp.clickOnRegistrationLink();

    	//Validate current URL is Register Page
    	registerPageUrl = "http://newtours.demoaut.com/mercuryregister.php";
    	softAssertion.assertEquals(this.myDriver.getCurrentUrl(), registerPageUrl);

    	//Step 4 - Close the browser
    	tearDown();

    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC07_Validate_Login_Valid_User_Password")
    @Description("Validate the log-in functionality")
    public void validateLoginFunctionality(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(this.myDriver);

    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();

    	//Step 3 - Insert <User Name> on 'User Name' field
    	sp.enterUser("validUser");

    	//Step 4 - Insert <Password> on 'Password' field
    	sp.enterPassword("validPassword");

    	//Step 5 - Click on 'SUBMIT' button
    	sp.clickOnSubmit();

    	//Validate that user is redirected to the Main Page
    	homePageUrl = "http://newtours.demoaut.com/mercurywelcome.php";
    	softAssertion.assertEquals(this.myDriver.getCurrentUrl(), homePageUrl);

    	//Step 6 - Close the browser
    	tearDown();

    }

    @Test(alwaysRun = true, priority = 0)
    //@Story("TC08_Validate_User_Cant_Login")
    //@Description("Validate that a User can't log-in with invalid username and password")
    public void validateUserCantLogin(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(this.myDriver);


    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();

    	//Step 3 - Insert invalid <User Name> on 'User Name' field
    	sp.enterUser("invalidUser");

    	//Step 4 - Insert invalid <Password> on 'Password' field
    	sp.enterPassword("invalidPassword");

    	//Step 5 - Click on 'SUBMIT' button
    	sp.clickOnSubmit();

    	//Validate that the User is still on the SingOnPage
    	singOnPageUrl = "http://newtours.demoaut.com/mercurysignon.php";
    	softAssertion.assertEquals(this.myDriver.getCurrentUrl(), singOnPageUrl);

    	//Step 6 - Close the browser
    	tearDown();
    	
    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC09_Validate_UserName_Is_Mandatory")
    @Description("Validate that a user can't login if the mandatory field 'User Name' is empty")
    public void validateUserNameFieldIsMandatory(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(this.myDriver);


    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();

    	//Step 3 - Let the "User Name" field empty
    	sp.enterUser("");

    	//Step 4 - Insert an valid <Password> on "Password" field
    	sp.enterPassword("validPassword");

    	//Step 5 - Click on 'SUBMIT' button
    	sp.clickOnSubmit();

    	//Validate that user remains in the SingOnPage
    	singOnPageUrl = "http://newtours.demoaut.com/mercurysignon.php";
    	softAssertion.assertEquals(this.myDriver.getCurrentUrl(), singOnPageUrl);

    	//Step 6 - Close the browser
    	tearDown();
    	
    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC10_Validate_Password_Field_Is_Mandatory")
    @Description("Validate that a user can't login if the mandatory field 'Password' is empty")
    public void validatePasswordFieldIsMandatory(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(this.myDriver);


    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();

    	//Step 3 - Insert an valid <UserName> on "UserName" field
    	sp.enterUser("validUser");

    	//Step 4 -  Let the "Password" field empty
    	sp.enterPassword("");

    	//Step 5 - Click on 'SUBMIT' button
    	sp.clickOnSubmit();

    	//Validate that user remains in the SingOnPage
    	singOnPageUrl = "http://newtours.demoaut.com/mercurysignon.php";
    	softAssertion.assertEquals(this.myDriver.getCurrentUrl(), singOnPageUrl);

    	//Step 6 - Close the browser
    	tearDown();
    	
    }

    @Test(alwaysRun = true, priority = 0)
    @Story("TC11_Validate_Copyright_Message")
    @Description("Validate that the copyright message is '© 2020, Mercury Interactive'")
    public void validateCopyrightMessage(){

    	// setup myDriver properties
    	setUp();

    	//Step 1 - go to Go to 'http://newtours.demoaut.com/'
    	HomePage.open(this.myDriver);


    	//Step 2 - Click on 'SING-ON' Link
    	sp.clickOnSingOn();

    	//Step 3 - Validate Copyright message
    	validCopyright = "2020, Mercury Interactive";
    	softAssertion.assertTrue( sp.getCopyRight().contains(validCopyright), "copyright message is not valid");

    	//Step 4 - Close the browser
    	tearDown();
    	
    }

}