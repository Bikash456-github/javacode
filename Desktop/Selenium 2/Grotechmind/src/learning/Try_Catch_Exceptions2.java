package learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Exceptions2 {
public static void main(String[] args) 
{
	try {
	Scanner s1=new Scanner(System.in);
	
System.out.println("please enter your age ok");
	
int age=s1.nextInt();

}
catch(InputMismatchException al)
	{
		System.out.println("Sorry but this doesn't seems your age,please check again");
		Scanner s2=new Scanner(System.in);
		System.out.println(s2);
		System.out.println("please enter your age");
		int age1=      s2.nextInt();
		
	}
}}