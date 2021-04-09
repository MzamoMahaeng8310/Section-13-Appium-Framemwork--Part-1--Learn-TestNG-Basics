package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Lecture2 {
	
	@Test
	public void Maxidoor()
	{
		System.out.println("Maxidoor");
		String MaxodoorMessage = "MaxidoorUltra Instllation";
		Assert.assertEquals("MaxidoorUltra Instllation",MaxodoorMessage);
	}
	
	@BeforeMethod //this beforemethod will execute before each @test block. so this class has 3 method blocks so it will run 3 times
	public void BeforeMethodAnnotation()
	{
		System.out.println("BeforeMethodAnnotation");
		
	}
	@Test(enabled = false) // TestNG will skip this method execution. 
	public void Markdoor()
	{
		
		System.out.println("Markdoor");
		
	}
	@BeforeSuite
	public void BeforeSuiteGlobal()
	{
		System.out.println("BeforeSuiteGlobal");
		
	}
	@Test (groups= {"Smoke"})
	public void Marcodoor()
	{
		
		System.out.println("Marcodoor");
		
	}
	
	@AfterTest
	public void AfterExecution()  //the aftertest only belongs to the test folder not entire test package e.g. close cookies, read reports etc.
	{
		System.out.println("AfterExecution");
	}
}



