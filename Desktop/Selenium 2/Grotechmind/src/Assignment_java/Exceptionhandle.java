package Assignment_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandle 
{
	public static void main(String[] args) 
	{
	try  {	
		
	@SuppressWarnings("resource")
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter your age");
    s1.nextInt();
}
catch(InputMismatchException al)
{
System.out.println("sorry but this donest seems your age,please check again");
@SuppressWarnings("resource")
Scanner s2=new Scanner(System.in);
System.out.println("please enter your age again");
s2.nextInt();
}
}
}