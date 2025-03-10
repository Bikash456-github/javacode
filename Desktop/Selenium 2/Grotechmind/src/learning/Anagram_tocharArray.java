package learning;

import java.util.Arrays;

public class Anagram_tocharArray {

	public static void main(String[] args) {
		
		String ram="momo";
		String shyam="momo";
		
		char usa[]=ram.toCharArray();
		char sfo[]=shyam.toCharArray();
		
		if(Arrays.equals(usa, sfo))
		{
			System.out.println("anagram each other");
		}
	
		else
		{
			System.out.println("both are no in anagram ");
		}

	}

}
