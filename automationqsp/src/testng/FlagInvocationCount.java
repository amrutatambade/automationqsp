package testng;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagInvocationCount {


	@Test(invocationCount = 100)
	public void a()
	{
		Reporter.log("hi I am inconsistent bug",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("hi",true);
	}

}