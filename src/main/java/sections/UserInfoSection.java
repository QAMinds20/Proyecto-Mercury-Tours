package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserInfoSection extends BaseSection {

	//Add @FindBy(how = How.XPATH, using = "") for each element

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
		userNameTxt.sendKeys(user);
	}

	public void setPassword(String pass) {
		passwordTxt.sendKeys(pass);
	}

	public void setConfirmPassword(String confirmPassword) {
		confirmPasswordTxt.sendKeys(confirmPassword);
	}

	public String getUserNameLblFontColor() {
		return this.userNameLbl.getAttribute("color");
	}

	public String getPasswordLblFontColor() {
		return this.passwordLbl.getAttribute("color");
	}

	public String getConfirmPasswordFontColor() {
		return this.confirmPasswordLbl.getAttribute("color");
	}

}