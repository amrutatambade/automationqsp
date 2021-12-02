package actionClassMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");                                                                                            
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///F:/SeleniumSurajSir/dragdrop.html");
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable-2']"));
		Thread.sleep(3000);
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable-2']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dest).perform();
	}

}
