package Assignment;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment41_Try_Catch_Finally {

	public static void main(String[] args) {
		

	Scanner s1=new Scanner(System.in);
	System.out.println("enter age");
	try
	{
		int age=s1.nextInt();
	}
	catch(InputMismatchException e1)
	{
		System.out.println("Exception occured- ");
	}
	finally 
	{
		System.out.println("finally block executed");
	}
}
}
