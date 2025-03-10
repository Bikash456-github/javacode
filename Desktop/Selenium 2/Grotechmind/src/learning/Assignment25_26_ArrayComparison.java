package learning;

import java.util.Arrays;

public class Assignment25_26_ArrayComparison 
{
static void stringarray_01()
{
	String strarray1[]=new  String[4];
	String strarray2[]=new String [4];
	strarray1[0]="Bikash";
	strarray1[1]="Dhungana";
	strarray1[2]="bani";
	strarray1[3]="dikhshya";
	
	strarray2[0]="Bikash2";
	strarray2[1]="Dhungana2";
	strarray2[2]="bani2";
	strarray2[3]="dikhshya2";
	 if (Arrays.equals(strarray1, strarray2))
	 {
		System.out.println("both string arrays are equal m"); 
		 
	 }
	 else
	 {
		 
		 System.out.println("both string arrays  are not equal  5");
	 }
}
static void charray_2()
{
	char charray1[]=new char[4];
	charray1[0]='a';
	charray1[1]='b';
	charray1[2]='c';
	charray1[3]='d';

	char charray2[]=new char[4];
	 charray2[0]  ='e';
	 charray2[1]  ='f';
	 charray2[2]  ='g';
	 charray2[3]  ='h';
	if (Arrays.equals(charray1, charray2))
	{
		System.out.println("both char arrays are equal  n");
	}
	else
	{
	System.out.println("both char arrays are not equal  r");
	}
}
public static void main(String[] args) {
	stringarray_01();
	charray_2();
}
}