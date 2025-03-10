package Assignment_java;

import java.util.Scanner;

public class Trycatcvhblock {
public static void main(String[] args) 
{
	try 
	{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter valid age");
	int b=sc.nextInt();
	System.out.println("input for a is--->"+b);
	}
	catch(Exception m)
	
	{
		System.out.println("Something went wrong");
	}
}}

