package Assignment_java;

import java.util.Scanner;

public class Nextcase {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your name ");
		String lastname=s1.nextLine();
		System.out.println("Hello,  "+lastname+"");
		System.out.println("Enter your email id");
		String Emailid=s1.next();
		System.out.println("Hello,  "+Emailid+"");
		System.out.println("Enter your password");
		String password=s1.next();
		System.out.println("Hello, "+password+"");
		System.out.println("Enter your gender");
		String Gender=s1.next();
		System.out.println("Hello,"+Gender);
		System.out.println("Enter your present Address");
		String presentAddress=s1.next();
		System.out.println("Hello, "   +presentAddress+"");
		System.out.println("Enter your parmanant Address");
		String parmanantAddress=s1.next();
		System.out.println("Hello ,"+parmanantAddress+"");
		System.out.println("Enter your .PIN ");
	    int pin = s1.nextInt();
	    System.out.println("Hello,"+ pin+"");
		s1.close();
	} 
	
	

}	