package Assignment;

public class Assignment33_palindrome {
// check if given string is palindrome or not
	
	public static void main(String[] args) {
		String str="Malayalam";
		String rev_Str="";
		for (int i=str.length()-1;i>0;i--)
		{
			
			char ch=str.charAt(i);
			rev_Str=rev_Str+ch;
		}
		if (str.equalsIgnoreCase(rev_Str)) {
			System.out.println("Given string"+str+"is palindrome ");
		}
		else
		{
			System.out.println("Given string "+str+ "is not palindrome");
		}
			
		
	
	
	}
	}

	
	
	
	
	
	
	
	
	

