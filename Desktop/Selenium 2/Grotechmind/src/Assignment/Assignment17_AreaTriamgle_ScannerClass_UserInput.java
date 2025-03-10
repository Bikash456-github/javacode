package Assignment;

import java.util.Scanner;



public class Assignment17_AreaTriamgle_ScannerClass_UserInput
{
	public static void main(String[] args) {
		
	
//Area of triangle =0.5*b*h
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the value of base:");
	double b=s1.nextDouble();
	System.out.println("enter the value of hight:");
	double h=s1.nextDouble();
	double result =0.5*b*h;
	System.out.println("Area of triangle is:"+result);
	
	
	
	
	}
}