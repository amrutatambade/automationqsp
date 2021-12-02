package xpathLocator;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAs3 {
public static void main(String[] args) throws InterruptedException {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the name of laptop");
		//String laptopName = sc.nextLine();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
		Thread.sleep(3000);
		String txt = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/ancestor::div[@class='sg-col-inner']/descendant::div[@class='a-row a-size-small'])[1]")).getText();
		System.out.println(txt);

}
}
