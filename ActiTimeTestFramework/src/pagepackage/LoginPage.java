package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	
	
	//Initialization
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	//generic reusable method
	public void actiTimeValidLogin(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginBtn.click();
	}
	public void actiTimeInValidLogin(String InvalidUsername,String InvalidPassword) throws InterruptedException
	{
		usn.sendKeys(InvalidUsername);
		pass.sendKeys(InvalidPassword);
		loginBtn.click();
		Thread.sleep(3000);
		usn.clear();
		
	}
	
	

}
