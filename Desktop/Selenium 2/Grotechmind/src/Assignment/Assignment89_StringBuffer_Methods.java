package Assignment;

public class Assignment89_StringBuffer_Methods {

	public static void main(String[] args) {
		
StringBuffer sb=new StringBuffer("BIKASH");
	System.out.println("Orginal StringBuffer -"+sb);
	sb.append("Dhungana");
	
	System.out.println("After Append-"+sb);
	sb.insert(0, "mrs.");
	System.out.println("After replace-"+sb);
	sb.replace(0, 5, "---");
	System.out.println("After replace -"+sb);
	sb.delete(0, 3);
	System.out.println("Length-"+sb.length());
	System.out.println("Char at index 6-"+sb.charAt(6));
	System.out.println("Substring-"+sb.substring(0,8));
	System.out.println("After Reverse-"+sb.reverse());
	System.out.println("String capacity-"+sb.capacity());
	
	
	
	
	
	}

}
