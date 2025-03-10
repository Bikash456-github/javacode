package String_functions_Array;

public class String_reverse {

	public static void main(String[] args) {
		String m="hsakib";//012345 at char value //123456 for lenth value 
		String n="";
		
		for(int i =m.length()-1;i>=0;i--)
//int i =m total lenth -1 will be 5 and reverse		
		{
			n=n+m.charAt(i);
	
		}
		System.out.println(n);
		
	}

}
