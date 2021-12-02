package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
	@FindBy(xpath="//a[.='Logout']") private WebElement logOut;

	//initialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Utilization

	public WebElement getLogOut() {
		return logOut;
	}
	//Operational method to click on logout
	
	public void clickOnLogout()
	{
		logOut.click();
	}
	
	
}
