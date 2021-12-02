package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameEx2 {
	

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");                                                                                            
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("C:\\Users\\Admin\\Desktop\\SeleniumSurajSir\\checkbox.html");
		driver.findElement(By.tagName("input")).click();

}
}