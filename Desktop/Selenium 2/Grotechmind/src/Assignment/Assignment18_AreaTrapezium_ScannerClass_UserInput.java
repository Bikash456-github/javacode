package Assignment;

import java.util.Scanner;

public class Assignment18_AreaTrapezium_ScannerClass_UserInput {
public static void main(String[] args) {
	//Area of trapezium =((a+b)/2)*h
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of side 1(a):");
	double a=s1.nextDouble();
	System.out.println("Enter the value of side(b):");
	double b =s1.nextDouble();
	System.out.println("Enter the value of height(h):");
	double h=s1.nextDouble();
	double result=((a+b)/2)*h;
	System.out.println("area of trapezium is :"+result);
	
}
}
