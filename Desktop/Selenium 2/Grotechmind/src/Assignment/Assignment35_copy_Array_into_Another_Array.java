package Assignment;

import java.util.Arrays;

public class Assignment35_copy_Array_into_Another_Array {

	public static void main(String[] args) {
	// copy of value of one array to another arrya using iteration
		String array1[]=new String[3];
		String array2[]=new String[3];
		array1[0]="Bikash";
		array1[1]="Sarmila";
		array1[2]="Dhungana";
		System.out.println("Array1 before copying -"+Arrays.toString(array2));
			
		for(int i=0;i<array2.length;i++)
		{
			array2[i]=array1[i];
		}
		
	System.out.println("Array1-"+Arrays.toString(array1));
	System.out.println("Array2 After coping -"+Arrays.toString(array2));
	}}