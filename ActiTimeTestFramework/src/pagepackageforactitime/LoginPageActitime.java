package pagepackageforactitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class LoginPageActitime extends BaseTest {
	@FindBy(name="username") private WebElement usr;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbtn;
	
	
	public LoginPageActitime(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}


	public WebElement getUsr() {
		return usr;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void validLogin(String username,String password)
	{
		usr.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
	}
	
	
	

}
