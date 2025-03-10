package stringBufferVSStringBuilder;

public class String_Buffer_Constructor3 {
public static void main(String[] args) {
	



    //StringBuffer()
	//StringBuffer(String str)
	//StringBuffer(int capacity ) its create and empty string with int capacity
	//Arrraylist capacity 10
	//String buffer capacity is 16
StringBuffer s1=new StringBuffer("AUTOmation");//2,9+1 dhun t t
System.out.println(s1.length());
System.out.println(s1.append(" ").append("testing"));
System.out.println(s1.replace(0, 4,"auto"));
System.out.println(s1.substring(9));
System.out.println(s1.reverse());



	}
}

