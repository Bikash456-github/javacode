package String_functions_Array;

import java.util.Arrays;

public class Array_checking {

	public static void main(String[] args) {
	int ram[]=new int [7];
	ram[0]=7;	
	ram[1]=6;	
	ram[2]=5;	
	ram[3]=4;	
	ram[4]=2;	
	ram[5]=1;	
	ram[6]=9;	
	int ram2[]=new  int[7];	
	ram2[0]=7;	
	ram2[1]=6;	
	ram2[2]=5;	
	ram2[3]=4;	
	ram2[4]=2;	
	ram2[5]=1;	
	ram2[6]=9;		
		
boolean b1=	Arrays.equals(ram, ram2);
System.out.println(b1);
	}

}
