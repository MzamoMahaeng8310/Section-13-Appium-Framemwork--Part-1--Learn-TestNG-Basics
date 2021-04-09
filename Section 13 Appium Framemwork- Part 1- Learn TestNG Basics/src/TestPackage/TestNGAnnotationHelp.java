package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnotationHelp {


	@Test(dependsOnMethods= {"MethodC"})
	public void MethodA()
	{
		System.out.println("MethodA");
	}

	@Test (enabled=false)
	public void MethodB()
	{

		System.out.println("MethodB");
	}

	@Test(dataProvider ="getData" ) // data provider and pass in the dataprovider method name
	public void  GrassCombinationData(String grassType, String soilType) // this will run 3 times and 2 values are passed in from left to right.

	{
		System.out.println(grassType);
		System.out.println(soilType);

	}

	@Test
	public void MethodC()
	{

		System.out.println("MethodC");

	}
	@Parameters({"Quickloc8","DBConnect"}) // the parameter only applies to this method. the
	//the xml file defines the name and value
	@Test (enabled = false)
	public void MethodD(String AppPack, String DBConnectionString)
	{

		System.out.println("MethodD");
		System.out.println(AppPack);
		System.out.println(DBConnectionString);
	}

	@DataProvider
	public Object[][] getData()
	{
		//This is where you want to test with multiple combination of data
		// on the same test case 
		//e.g 1st combination - kikuku grass and soil
		//2nd  Buffalo grass and soil
		// 3rd Evergreen grass and soul 
		//so in this case we read from left to right.
		//define a multi dimentional array
		Object[][] data = new Object[3][2];
		//in the Object[3][2] we create 3 rows with 2 columns
		//column1 //Column 2
		//row 1   [0][0]   [0][1] read one line at a time 
		//row 2   [1][0]   [1][1]
		//row 3   [2][0]   [2][1] 

		//First set of data red from left to right e.g. username password 
		data[0][0] = "KikutyGrass";
		data[0][1] = "Compost Soil";
		// second set of data
		data [1][0] = "BuffaloGrass";
		data[1][1] = "SufphurCompounds";
		//third combination 
		data [2][0] = "EverGreenGrass";
		data[2][1] = "VolcanicAsh";
		return data; // then method return type to OBJECT [][]

	}
	

}
