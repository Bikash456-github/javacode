package learning;

import java.util.Arrays;

public class Assignment27_CopyReversedArray {
public static void main(String[] args) {
	int array1[]=new int[5];
	array1[0]=2;
	array1[1]=3;
	array1[2]=4;
	array1[3]=5;
	array1[4]=6;
	
	int reversedArray[]=new int[5];
	for (int i=0,k=reversedArray.length-1;i<array1.length;i++,k--)
	{//// here k is taken for new array index
		reversedArray[k]=array1[i];
	}
	System.out.println("orginal array-"+Arrays.toString(array1));
	System.out.println("reversed array-"+Arrays.toString(reversedArray));

	
	
}

}
