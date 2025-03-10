package String_functions_Array;

public class String_Array_Problems1 {
public static void main(String[] args) {
	int alphabet=0;
	int count_of_numeric=0;
	int count_of_space=0;
	
	String a="Bikash dhungana 4356764863";
	char[]c1=        a.toCharArray();
	for(int i=0;i<a.length();i++)
	{	
	boolean  b1=Character.isLetter(c1[0]);
	if(b1==true);
	{	
	alphabet++;	
	}
	}
	System.out.println("the number of alphabet are :"+alphabet);
	//***********************
	for(int i=0;i<a.length();i++)
	{	
	boolean b2=Character.isDigit(c1[i]);
	if(b2==true);
	{	
		 count_of_numeric++;	
	}
	}
	System.out.println("the number of numeric are :"+ count_of_numeric);
	//***********************************
	for(int i=0;i<a.length();i++)
	{	
	boolean b3=Character.isWhitespace(c1[i]);
	if(b3==true);
	{	
		count_of_space++;	
	}
	}
	System.out.println("the number of space are :"+ count_of_space);
	//***********************************
	
	
	
	
	
	
	
	
}
}
