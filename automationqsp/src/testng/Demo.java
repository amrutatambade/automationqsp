package testng;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void login() {
	  int i=10;
	int  result=i/0;
	  System.out.println(result);
	  Reporter.log("login",true);
  }
}
