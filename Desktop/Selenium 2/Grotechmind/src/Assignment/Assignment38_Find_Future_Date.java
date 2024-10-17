package Assignment;

import java.util.Date;

public class Assignment38_Find_Future_Date {

//finding future time 
	public static void main(String[] args) {
		
		Date epchDate=new Date();
		Date presentDate=new Date(epchDate.getTime());
		Date FutureDate=new Date(epchDate.getTime()+(1000*60*60*24*2));
		System.out.println("present Date is "+presentDate);
	   System.out.println("future Date is "+FutureDate);
	
	
	
	
	
	
	}
	}	
	
	
	

