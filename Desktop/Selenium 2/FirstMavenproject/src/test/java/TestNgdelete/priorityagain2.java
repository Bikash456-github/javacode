package TestNgdelete;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class priorityagain2 {
	
@Test
public void testcase1()	
{
	
}
@BeforeSuite
public void bs()	
{
System.out.println("BeforeSuite");	
}	
@AfterSuite
public void as()	
{
	System.out.println("AfterSuite");
}	
@BeforeTest
public void bt()	
{
	System.out.println("BeforeTest");
}	
@AfterTest
public void at()	
{
	System.out.println("AfterTest");
}
@BeforeMethod
public void bm()	
{
	System.out.println("BeforeMethod");
}
@BeforeClass
public void a()	
{
	System.out.println("Beforeclass");
}
@AfterMethod
public void am()	
{
	System.out.println("AfterMethod");
	
}
@AfterClass
public void ac()	
{
	System.out.println("AfterClass");
}	
}
