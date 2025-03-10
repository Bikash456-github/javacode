package Assignment;

import java.util.Scanner;

public class Assignment101_and_104_IfElseIf_block {

	static void grotechminds101() {
	Scanner m=new Scanner(System.in);
	int num=m.nextInt();
	
	if (num==6)
	
	{
	System.out.println("number 5");	
		
	}
	else if (num==11)
	{
		
	System.out.println("random number enter");	
	}
	}
	static void grotechminds104() {
		Scanner m1=new Scanner(System.in);
		System.out.println("enter number in range of 6.from 6 to 12");
		int num=m1.nextInt();
		if (num==6)
		{
			
			System.out.println("number 6 entered");
		}
		else if (num==11)
		{
			
			System.out.println("number 11 entered");
		}	
		else if( num==16)
		{
			
			System.out.println("number 20 entered");
		}
		else
{
System.out.println("random number entered");			
}}
		public static void main(String[] args) {
			grotechminds101();
			grotechminds104();
			}
		}

