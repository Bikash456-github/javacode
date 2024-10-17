package Assignment;

import java.util.Arrays;

public class Assignment45_array_sorting {

	public static void main(String[] args) {
		
	int array1[]=new int[5]	;
		array1[0]=32;
		array1[1]=50;
		array1[2]=36;
		array1[3]=34;
		array1[4]=38;
		
		System.out.println("Array before sorting-"+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("Array after sorting-"+Arrays.toString(array1));
		
		
		
		

	}

}
