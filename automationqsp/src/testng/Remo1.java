package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo1 {
  @Test
  public void demo123() {
	  Reporter.log("hi",true);
  }
  @Test
  public void  remo1()
  {
	  Reporter.log("bye",true);
  }
}
