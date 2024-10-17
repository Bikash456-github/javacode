package testcases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class firstclass {
	@BeforeSuite
	public void firstTest() {
	System.out.println("inside the first test");
	}
    @AfterSuite
     public void afterSuite() {
	System.out.println("inside the after suite");
    }
    
	@BeforeTest
	public void beforetest() {
		System.out.println("inside the Before test");
	}
	
	
		
	          
	    }
   