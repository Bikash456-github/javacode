package Assignment;

class Assignment32_Stringreverse {
//Writing a program to reverse string
	public static void main(String[] args) {
		String orginalString="BIKASH-DHUNGANA";
		String revString="";
		for (int i=orginalString.length()-1;i>=0;i--)
		{
			char ch=orginalString.charAt(i);
			revString=revString+ch;
		}
		
		System.out.println("Orginal String - "+orginalString);
		System.out.println("Reverse String -"+revString);
		
;	}
	
	
	
	
	
	
}
