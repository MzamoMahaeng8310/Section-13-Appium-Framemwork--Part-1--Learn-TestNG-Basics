package TestPackage;



import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerParalell {

	@Test
	public void Login()
	{

		//System.out.println("This Test Passed");
		Assert.assertEquals("yes", "yes");
	}
  @Test
  public void HelpMenu()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
  @Test
  public void AboutMenu()
  {
	  Assert.assertEquals("pass", "pass");
	  
	  
  }
  @Test
  public void Subscriptions()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
  @Test
  public void Users()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
}
