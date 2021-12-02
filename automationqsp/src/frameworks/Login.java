package frameworks;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://msi/login.do");
		
		WebElement user = driver.findElement(By.name("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.id("loginButton"));
		
		FlibEx flib = new FlibEx();
		String username = flib.readExcelData("./data/Testdata.xlsx", "validcreds", 1, 0);
		String password = flib.readExcelData("./data/Testdata.xlsx", "validcreds", 1, 1);
		
		user.sendKeys(username);
		Thread.sleep(1000);
		pass.sendKeys(password);
		Thread.sleep(1000);
		login.click();
	}

}
