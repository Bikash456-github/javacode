package String_functions_Array;

public class String_Palindrome {

	public static void main(String[] args) 
	{
		String name="mom";
		String output="";
		//System.out.println("My input is ->"+name);
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1=     name.charAt(i);
			output=output+c1;
		}
        //System.out.println("my output is ->"+output);
		if (name.equals(output)==true)
			System.out.println("it is a palindrome");
		
		else
		System.out.println("it is not a palindrome");
		
		
		
		
		
		
	}

}
