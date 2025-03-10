package stringBufferVSStringBuilder;

public class String_Buffer_2 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("BIKASHDHUNGANA");//2,9+1 dhun
		s1.substring(3,11);
		//System.out.println(s1.length());
		//System.out.println(s1.append(" ").append("Bikash"));
		//System.out.println(s1.replace(1, 7," Dhungana"));
		System.out.println(s1.replace(6, 10,"nuhd"));
        String a2=new String("bikash");
        System.out.println(a2);

	}

}
