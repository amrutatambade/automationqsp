package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAs4 {
	public static void main(String[] args) throws InterruptedException {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the name of laptop");
		//String laptopName = sc.nextLine();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shirt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Brand']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox'])[3]")).click();
		Thread.sleep(3000);
		String txt = driver.findElement(By.xpath("(//span[.='(50% OFF)'])[2]")).getText();
		System.out.println(txt);

}
}
