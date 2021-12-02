package takesScreenShotDynamically;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListner.class)
public class TestScript extends BaseTest {
	@Test
	public void testFlipkarts()
	{
		Assert.fail();
		
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
