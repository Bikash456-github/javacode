package Assignment_java;

import java.util.Arrays;
public class Stringreveersedelete {

	public static void main(String[] args) {	
		
		
	int array1[]=new int[6];
	array1[0]=20;
	array1[1]=30;
	array1[2]=40;
	array1[3]=50;
	array1[4]=60;
	array1[5]=70;
	
	int array2[]=new int[6];
	
	int M=array1.length -1;
	for(int i=0;i<array1.length;i++){
		array2[M]  =   array1[i];
		M--;}
		System.out.println("Orginal Array:"+Arrays.toString(array1));
		System.out.println("Reversed Array:"+Arrays.toString(array2));}}
	
		
