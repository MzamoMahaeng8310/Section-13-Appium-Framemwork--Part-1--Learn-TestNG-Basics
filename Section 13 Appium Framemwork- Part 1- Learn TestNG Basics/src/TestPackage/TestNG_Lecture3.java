package TestPackage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;


public class TestNG_Lecture3 {

	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass()");
	}

	@Test (groups= {"Smoke"})
	public void bathroom()
	{

		System.out.println("bathroom");
		String bath = "Our Bathroom Will Look Amazing";
		String renovatedbath = "Our Bathroom Will Look Amazing";
		Assert.assertEquals(bath, renovatedbath);
	}

	@AfterSuite
	public void AfterSuiteOperatons()
	{
		System.out.println("AfterSuiteOperatons");

	}

	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod()");

	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod for eact @test");

	}
	@AfterClass

	public void AfterClass()
	{
		System.out.println("AfterClass()");
	}
	@Parameters({"Quickloc8"})
	//@Test
	public void KidzRoom(String AppPack )
	{
		System.out.println("TKidzRoom");
		System.out.println(AppPack);
	}


}

