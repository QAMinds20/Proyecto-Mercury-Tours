package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserInfoSection extends BaseSection {

	private WebElement userNameLbl;

	private WebElement passwordLbl;

	private WebElement confirmPasswordLbl;

	private WebElement userNameTxt;

	private WebElement passwordTxt;

	private WebElement confirmPasswordTxt;

	public UserInfoSection(WebDriver driver) {
		super(driver);
	}

	public void setUserName(String user) {

	}

	public void setPassword(String pass, boolean confirm) {
		
	}


}