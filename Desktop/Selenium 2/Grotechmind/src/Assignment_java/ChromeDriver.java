package Assignment_java;


import java.util.Scanner;

public class ChromeDriver  {
	 public void InputMismatchException() {
	}
	Assignment_java.ChromeDriver driver = new Assignment_java.ChromeDriver();

	public static void main(String[] args) {
	System.out.println("pres s1 for Chrome Browser");
	
	@SuppressWarnings("resource")
	Scanner s1 = new Scanner(System.in);
	
	int selection=    s1.nextInt();
	
	 
	switch(selection)
	{
	case 1:
	 System.out.println("Launch Chrome Browser");
	       break;
	case 2:
	System.out.println("Launch Safari Browser");
		break;
	case 3:
	   System.out.println("Lunch google  Browser");
	break;
	}}}

	






