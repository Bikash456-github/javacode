package TestNgdelete;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class groupingyoutube
{
@Test (groups= {"smoke"})
public void grouping_01()
{
System.out.println("smoke test");	
}

@Test(groups= {"smoke","integration testing"})	
public void grouping_02()
{
System.out.println("integration testing,smoke");	
}
@Test (groups= {"system"})
public void grouping03()
{
System.out.println("system ");
}

@Test (groups= {"component testing"})
public void grouping04()
{
	System.out.println("component testing");
}

@Test (groups="sanity")
	public void grouping_05()
	{
		System.out.println("sanity testing");	
     }	
}	
	
	
	
	
	

