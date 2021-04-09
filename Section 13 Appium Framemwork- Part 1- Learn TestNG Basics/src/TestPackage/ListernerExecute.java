package TestPackage;



import org.testng.Assert;
import org.testng.annotations.Test;

public class ListernerExecute {

	@Test
	public void SucessCodeSucess()
	{

		//System.out.println("This Test Passed");
		Assert.assertEquals("yes", "yes");
	}
  @Test
  public void SourceCodeFalure()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
  @Test
  public void SourceCodeFalureB()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
  @Test
  public void SourceCodeFalureC()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
  @Test
  public void SourceCodeFalureE()
  {
	  Assert.assertEquals("fail", "F@!l");
	  
	  
  }
}
