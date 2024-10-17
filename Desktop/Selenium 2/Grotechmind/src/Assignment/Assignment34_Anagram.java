package Assignment;

import java.util.Arrays;

public class Assignment34_Anagram {
// finout if two given string are anagram
	public static void main(String[] args) {
		
		String str1="MOMO";
		String str2="OMOM";
		char str1_array[]=str1.toCharArray();
		char str2_array[]=str2.toCharArray();
		
		if(Arrays.equals(str1_array,  str2_array)) {
			
			{
			System.out.println("both sting are in anagram of each other");	
			}
		}
			else
			{
			System.out.println("both string are not anagram of each other");
	}
		
	}
	}
	
	
	
	
	
	
	
	
	
	

