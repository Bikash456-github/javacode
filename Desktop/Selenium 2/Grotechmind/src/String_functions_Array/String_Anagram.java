package String_functions_Array;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		String ram="angel";//r,a,m
		String shyam="angel";//a,r,m
		
	char c1[]=	ram.toCharArray();
	char c2[]=	shyam.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	System.out.println();
	

boolean b2=	Arrays.equals(c1, c2);
	System.out.println(b2);
	if(b2==true)
	{
		System.out.println("they are anagram");
	}
	else
	{
		System.out.println("they are not anagram");
	}
	
	}

}
