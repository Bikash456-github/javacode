package Assignment;

import java.util.Scanner;

public class Assignment15_16_SquareAreaCircum_ScannerClass_UserInput {
Scanner s1=new Scanner(System.in);
	double a=s1.nextDouble();
	static void SquareArea()
	{
		System.out.println("Enter value of a:");
		Assignment15_16_SquareAreaCircum_ScannerClass_UserInput  m2=new Assignment15_16_SquareAreaCircum_ScannerClass_UserInput ();
	double result=m2.a*m2.a;
	System.out.println("Area of square is:"+result);
	}
	static void Squarecircum()
	{
		System.out.println("Enter value of a:");
		Assignment15_16_SquareAreaCircum_ScannerClass_UserInput m2=new Assignment15_16_SquareAreaCircum_ScannerClass_UserInput();	
	double result =4*m2.a;
	System.out.println("Circumference of squre is :"+result);
	}
	public static void main(String[] args) {
		SquareArea();
		Squarecircum();
	}
	
	
}
