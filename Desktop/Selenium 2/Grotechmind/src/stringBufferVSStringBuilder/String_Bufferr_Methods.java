package stringBufferVSStringBuilder;

public class String_Bufferr_Methods {

	public static void main(String[] args) {
	//append,insert,delete,replace,substring,char,reverse
		StringBuffer s1=new StringBuffer("BIKASH DHUNGANA");//15
		System.out.println("Orginal string"+s1);
		s1.append(" Subedi");//23
		System.out.println("After append "+s1);//append method
		s1.insert(16, " Mrs ");
		System.out.println("After insert "+s1);//insert method
		s1.replace(17, 20, "Husband");//replace method
		System.out.println("After replace method "+s1);
		
		s1.delete(17,25);
        System.out.println("After delete"+s1);
      
        System.out.println("length-"+s1.length());
        System.out.println("Char at index - "+s1.charAt(5));//H number 5
        System.out.println("Substring -"+s1.substring(7,15));//dhungana
        System.out.println("After reverse "+s1.reverse());
        System.out.println("Total capacity "+s1.capacity());
        
        
        
	}

}
