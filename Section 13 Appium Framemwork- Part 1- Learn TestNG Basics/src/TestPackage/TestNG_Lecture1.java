package TestPackage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG_Lecture1 {


	// TODO Auto-generated method stub
	@Test	(dependsOnMethods= {"Pavement","Landscape"})
	public void House() // @Test for this method will be defined as a test case. @Test will always execure in aphaberical order. So in the this class
	//public void House() will be executed first. But you want another test to run first. Pavement
	{
		System.out.println("House");//automation code

	}
	
	@AfterMethod (timeOut=3000) // at times the test case needs a time out in miliseconds per method
	public void AfterMethodExecution() //this will execute after every method with the @test block.  So @test 4 blocks so this will be seen 4times.
	{
		System.out.println("AfterMethodExecution");
	}
	@Test (groups = {"Connection"}) // this is a different group tag 
	public void Landscape()
	{
		
		
		System.out.println("Landscape");

	}

	@Test (groups = {"Connection"}) // this is a different group tag 
	public void Pavement()
	{
		System.out.println("Pavement");

	}
	
	@Test (groups= {"Smoke"}) // so you create a group when the client wants certain test for different classes.Create tags.This must be infront of @Test
	public void LampPost()
	{
		System.out.println("LampPost");

	}
	
	@BeforeTest (enabled=false)
	public void PreConditionsOfTest() // example could be the appium capabilities and starting appium server 
	{
		System.out.println("This is a pre-requisite operation e.g. clean database ");
	}

}






