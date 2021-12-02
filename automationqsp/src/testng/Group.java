package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
  @Test(groups="Functional")
  public void fT1() {
	  Reporter.log("im in FT1",true);
  }
  @Test(groups="smoke")
  public void sT1() {
	  Reporter.log("im in sT1",true);
  }
  @Test(groups="Integration")
  public void iT1() {
	  Reporter.log("im in iT1",true);
  }
  @Test(groups="Functional")
  public void fT2() {
	  Reporter.log("im in FT2",true);
  }
  @Test(groups="smoke")
  public void sT2() {
	  Reporter.log("im in sT2",true);
  }
  @Test(groups="Integration")
  public void iT2() {
	  Reporter.log("im in iT2",true);
  }
  @Test(groups="Functional")
  public void fT3() {
	  Reporter.log("im in fT3",true);
  }
  @Test(groups="Integration")
  public void iT3() {
	  Reporter.log("im in iT3",true);
  }
  @Test(groups="Functional")
  public void fT4() {
	  Reporter.log("im in FT4",true);
  }
  @Test(groups="smoke")
  public void sT4() {
	  Reporter.log("im in sT4",true);
  }
  @Test(groups="Integration")
  public void iT4() {
	  Reporter.log("im in iT4",true);
  }
  @Test(groups="Functional")
  public void fT5() {
	  Reporter.log("im in FT5",true);
  }
  @Test(groups="Integration")
  public void iT5() {
	  Reporter.log("im in iT5",true);
  }
  @Test(groups="smoke")
  public void sT5() {
	  Reporter.log("im in sT5",true);
  }
  @Test(groups="Functional")
  public void fT6() {
	  Reporter.log("im in fT6",true);
  }
  @Test(groups="Integration")
  public void iT6() {
	  Reporter.log("im in iT6",true);
  }
  @Test(groups="smoke")
  public void sT6() {
	  Reporter.log("im in sT6",true);
  }
 
  
}
