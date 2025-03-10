package String_functions_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_accept_Runtime {

	public static void main(String[] args) {
//Acccepts the value of  arrays at the run time
//int data type size is four
//in java value traverse from right to left
		
	Scanner sc=new Scanner(System.in);
	int shyam[]=new int[3];		
	for(int i =0;i<3;i++)
	{		
	shyam[i]=sc.nextInt();
	}
System.out.println(Arrays.toString(shyam));
}
}