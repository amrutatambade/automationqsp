package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;


public class ActitimeLogin extends BaseTest {
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		bt.setUp();
		String username = flib.readProperty(PROP_PATH, "username");
		String password = flib.readProperty(PROP_PATH,"password");
		
		
			
			driver.findElement(By.name("username")).sendKeys(username);
		 	driver.findElement(By.name("pwd")).sendKeys(password);
		 	driver.findElement(By.id("loginButton")).click();
		 	bt.tearDown();
	}

	
	

	}

