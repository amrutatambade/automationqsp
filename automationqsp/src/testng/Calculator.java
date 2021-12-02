package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Calculator {
  WebDriver driver;
  
  @Parameters({"add","operand1","operand2"})
  @Test(priority= 0)
  public void addition(String add,int a,int b) throws InterruptedException 
  {
	  driver.findElement(By.xpath("//span[.='"+a+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+add+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+b+"']")).click();
	  String result = driver.findElement(By.id("sciOutPut")).getText();
	  Reporter.log("result is:"+result+" ",true);
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  
  }
  
  @Parameters({"sub","operand1","operand2"})
  @Test(priority= 1)
  public void substraction(String sub,int a,int b) throws InterruptedException
  {
	  driver.findElement(By.xpath("//span[.='"+a+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+sub+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+b+"']")).click();
	  String result = driver.findElement(By.id("sciOutPut")).getText();
	  Reporter.log("result is:"+result+" ",true);
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  
  }
  
  
  @Parameters({"mul","operand1","operand2"})
  @Test(priority= 2)
  public void multiplication(String mul,int a,int b) throws InterruptedException
  {
	  driver.findElement(By.xpath("//span[.='"+a+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+mul+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+b+"']")).click();
	  String result = driver.findElement(By.id("sciOutPut")).getText();
	  Reporter.log("result is:"+result+" ",true);
	  Thread.sleep(3000);
	  driver.navigate().refresh();
  }
  
 
  @Parameters({"division","operand1","operand2"})
  @Test(priority= 3)
  public void division(String division,int a,int b) throws InterruptedException
  {
	  driver.findElement(By.xpath("//span[.='"+a+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+division+"']")).click();
	  driver.findElement(By.xpath("//span[.='"+b+"']")).click();
	  String result = driver.findElement(By.id("sciOutPut")).getText();
	  Reporter.log("result is:"+result+" ",true);
	  Thread.sleep(3000);
	  driver.navigate().refresh();
	  
  }
  @Test(priority= -1)
  public void lunchBrowser()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.calculator.net");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }
  
  
}
