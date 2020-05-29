package sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UserInfoSection extends BaseSection {


	@FindBy(how = How.XPATH, using = "//form//tbody//tr[14]//td//font/b")
	private WebElement userNameLbl;

	@FindBy(how = How.XPATH, using = "//form//tbody//tr[15]//td//font/b")
	private WebElement passwordLbl;

	@FindBy(how = How.XPATH, using = "//form//tbody//tr[16]//td//font/b")
	private WebElement confirmPasswordLbl;

	@FindBy(how = How.XPATH, using = "//form//tbody//tr[16]//td[2]/input")
	private WebElement userNameTxt;

	@FindBy(how = How.XPATH, using = "//form//tbody//tr[16]//td[2]/input")
	private WebElement passwordTxt;

	@FindBy(how = How.XPATH, using = "//form//tbody//tr[16]//td[2]/input")
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