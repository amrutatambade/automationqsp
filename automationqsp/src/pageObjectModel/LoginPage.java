package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	public LoginPage() {
		super();
	}

	
	//Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
		//Utilization


	public WebElement getUsn() {
		return usn;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebElement getCheckBox() {
		return checkBox;
	}
	
	//operational method
	public void sendUsername()
	{
		usn.sendKeys("admin");
	}
	public void sendPassword()
	{
		pass.sendKeys("manager");
	}
	public void clickOnLogin()
	{
		loginButton.click();
	}
	public void clickOnCheckbox()
	{
		checkBox.click();
	}
	//generic reusable method/buisness method to login with valid creads
	public void validLoginActiTime(String validUsername,String validpassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validpassword);
		loginButton.click();
	}
	public void invalidLoginActiTime(String invalidUsername,String invalidpassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidpassword);
		loginButton.click();
		Thread.sleep(3000);
		usn.clear();
	}
	public void delayOfFiveSeconds() throws InterruptedException
	{
		Thread.sleep(5000);
	}
}
