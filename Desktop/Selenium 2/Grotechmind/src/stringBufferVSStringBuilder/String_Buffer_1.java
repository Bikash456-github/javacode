package stringBufferVSStringBuilder;

public class String_Buffer_1 {

	public static void main(String[] args) {
	String oldstring=new String("Stringonly");
	oldstring.concat("immutable and changeable");
	System.out.println(oldstring);
	//immputable not change 
	
	StringBuilder s1=new StringBuilder("StringBuilder");
	s1.append("  ") .append("Mutable and changable");
	System.out.println(s1);
	//Mutable//changeable
	
	
	StringBuffer s2=new StringBuffer("StringBuffer");
	s2.append("  ") .append("Mutable and changeable");
	System.out.println(s2);
	//Mutable//changeable
    /*
     StringBuffer()	its create an empty buffer with the initial capacity of 16
	 its create a string buffer with the specified string
     StringBuilder()	
	
     */	
	}

}
