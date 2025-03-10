package Assignment_java;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Augest22 {
    public static void main(String[] args) {


	try {
		@SuppressWarnings("resource")
		Scanner sc1=new Scanner(System.in);
		System.out.println("please enter your age");
		sc1.nextInt();
		
	}
	catch(InputMismatchException al)
	{
	System.out.println("sorry but this doesnt seems your age,please check again");
	@SuppressWarnings("resource")
	Scanner s2=new Scanner(System.in);
	System.out.println("please enter your age again");
	s2.nextInt();
	  
	
	}
    }}

