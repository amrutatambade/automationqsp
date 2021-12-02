package testPackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.SettingsPage;

public class TestActiTimeOptionOfDropdown  extends BaseTest{
	
	
	@Test
	public void testDropdowns() throws InterruptedException, IOException
	{
		
		Flib flib = new Flib();	
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(flib.readProperty(PROP_PATH, "username"), flib.readProperty(PROP_PATH, "password"));
	
		SettingsPage sp = new SettingsPage(driver);
		sp.clickOnSettings();
		WebElement drop1 = sp.getDropdown1();
		WebElement drop2 = sp.getDropdown2();
		WebElement drop3 = sp.getDropdown3();
		
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		wb.getAllTheOptionsOfDropdown(drop1);
		wb.getAllTheOptionsOfDropdown(drop2);
		wb.getAllTheOptionsOfDropdown(drop3);
		
		
	}

}