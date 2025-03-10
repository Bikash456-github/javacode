package Assignment;

public class Assignment32_Stringreverse2 {
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
}
}