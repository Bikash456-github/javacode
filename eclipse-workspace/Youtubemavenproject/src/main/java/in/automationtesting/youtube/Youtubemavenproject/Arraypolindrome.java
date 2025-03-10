
package in.automationtesting.youtube.Youtubemavenproject;

public class Arraypolindrome {

	private static final Object Reverse = null;

	public static void main(String[] args) {
		//program to find the array string polindrome
		
		String[] str = {"Daaay" ,"DaD " ,"radar" ,"Testing"};
		for(int i=0; i<str.length ;i++) {
			
			String original = str[i];
			
			System.out.println("my orginal array string is  :"  +original);
			StringBuilder Stringbuilder = new StringBuilder();
			
			Stringbuilder = Stringbuilder .append(original);
			original = Stringbuilder.reverse().toString();
			if(original .equals( Reverse )) {
				System.out.println("given string is a Palindrome :"+Reverse);
			}else {
				System.out.println("givens string is not palindrome :+Reverse");
				
			}
	}

}
}