package pagepackageforactitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUser {
	@FindBy(name="username") private WebElement user;
	@FindBy(name="passwordText") private WebElement password;
	@FindBy(name="passwordTextRetype") private WebElement pwdRetype;
	@FindBy(name="firstName") private WebElement fname;
	@FindBy(name="lastName") private WebElement lastname;
	@FindBy(xpath="//input[@type='submit']")private WebElement submit;
	
	public CreateUser(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPwdRetype() {
		return pwdRetype;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getSubmit()
	{
		return submit;
	}
	
	public void send()
	{
		user.sendKeys("kartikey");
		password.sendKeys("kartikey");
		pwdRetype.sendKeys("kartikey");
		fname.sendKeys("kartikey");
		lastname.sendKeys("tambade");
		submit.click();
		
	}
}
