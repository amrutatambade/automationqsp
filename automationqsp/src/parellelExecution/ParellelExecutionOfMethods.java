package parellelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParellelExecutionOfMethods {

	@Test
	public void a()
	{
		long idmethod1=Thread.currentThread().getId();
		Reporter.log("method1"+""+idmethod1,true);
	}
	@Test
	public void b()
	{
		long idmethod2=Thread.currentThread().getId();
		Reporter.log("method2"+""+idmethod2,true);
	}
	

}

