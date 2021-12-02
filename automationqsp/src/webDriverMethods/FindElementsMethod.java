package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("bike");
		Thread.sleep(5000);
	    List<WebElement> suggetions = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
	    		
	    for(int i=0;i<suggetions.size();i++)
	    {
	    	WebElement suggestion=suggetions.get(i);
	    	String textOfSuggetion=suggestion.getText();
	    	System.out.println(textOfSuggetion);
	    }

	}

}
