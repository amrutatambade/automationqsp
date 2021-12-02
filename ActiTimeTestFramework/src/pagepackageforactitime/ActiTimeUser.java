package pagepackageforactitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class ActiTimeUser extends BaseTest{
	@FindBy(xpath="//div[.='Users']")private WebElement users;
	@FindBy(xpath="//input[@type='button' and @value='Create New User']")private WebElement create;

	public ActiTimeUser(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
	 
		
	}
	public WebElement getUsers()
	{
		return users;
				
	}

	public WebElement getCreate() {
		return create;
	}
	public void clickOnUsers()
	{
		users.click();
	}
	public void clickOnCreateNewCustomer()
	{
		create.click();
	}
	
	

}
