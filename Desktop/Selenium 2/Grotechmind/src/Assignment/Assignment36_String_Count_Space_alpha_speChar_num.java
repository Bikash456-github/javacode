package Assignment;

public class Assignment36_String_Count_Space_alpha_speChar_num {
// in given string find how many are alpha how many special n numeric and space are
	public static void main(String[] args) {
		
		
		
		
		
		
		String str="my home #1830 ";
		int cnt_alphabets=0;
		int cnt_whtSpaces=0;
		int cnt_num=0;
		int str_length=str.length();
		char array_str[]=str.toCharArray();
		for (int i=0;i<array_str.length;i++) {
		if (Character.isAlphabetic(i))
		{
			cnt_alphabets++;
		}
		if (Character.isWhitespace(array_str[i])) 
		{
			cnt_whtSpaces++;
			
		}
		if(Character.isDigit(array_str[i]))
		{
			cnt_num++;
		}
		}
		int cnt_speChar=str_length-(cnt_alphabets+cnt_whtSpaces+cnt_num);
		System.out.println("Given string is -"+str);
		System.out.println("Alphabetes in String is - "+cnt_alphabets); 
		System.out.println("Spaces in String is-"+cnt_whtSpaces);
		System.out.println("Numerics in string is-"+cnt_num);
		System.out.println("Special Char in string is -"+cnt_speChar);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
