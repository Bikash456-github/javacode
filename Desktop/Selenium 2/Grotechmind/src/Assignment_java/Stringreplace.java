package Assignment_java;

public class Stringreplace {
public static void main(String[] args) {
	String s1="dhungana";
	String m2="Sarmila";
	s1.equals(m2);
	System.out.println(s1);
	
	//equal ignorecase
	boolean m1=s1.equals(m2);
	System.out.println(m1);
	
	s1.equalsIgnoreCase(m2);
	System.out.println();
	//concat operator
	String s3=s1.concat(m2);
	System.out.println(s3);
	
	String s4=s1.concat(s3).concat("RAM");
	System.out.println(s4);
	
	String s7=s1.replace('M', 'N');
	System.out.println(s7);
	String s8=s1.replaceAll("Dh", "sa");
	System.out.println(s8);}}
	
	
	
	
	
	
	

	
	
	
	
	
	

