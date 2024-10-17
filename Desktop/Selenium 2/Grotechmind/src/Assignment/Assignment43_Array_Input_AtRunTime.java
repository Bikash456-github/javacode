package Assignment;

import java.util.Arrays;
import java.util.Scanner;

// write a program accept the value of your array at runtime
//isitif int datatype size of 4
public class Assignment43_Array_Input_AtRunTime {
public static void main(String[] args) {
	
int intArray[]	=new int[4];
for (int i=0;i<intArray.length;i++) {
	System.out.println("enter int value at index-"+i);
	Scanner s1=new Scanner(System.in);
	intArray[i]=s1.nextInt();
	
}
System.out.println("final Array -"+Arrays.toString(intArray));	
	
	
	
}
}