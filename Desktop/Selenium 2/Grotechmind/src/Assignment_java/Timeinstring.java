package Assignment_java;

import java.util.Date;

public class Timeinstring {
	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		//epoch converter
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String current_time=d2.toString();
		String year=current_time.substring(current_time.length()-4);
		System.out.println(year);
		
		String month=current_time.substring(4,7);
		System.out.println(month);
		
		
	}

}
