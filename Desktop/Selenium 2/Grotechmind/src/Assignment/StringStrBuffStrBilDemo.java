package Assignment;

public class StringStrBuffStrBilDemo{
public static void main(String[] args) {
	

System.out.println("String class demo");
String s="welcome";
System.out.println(s);
s.concat("to java");
System.out.println(s);


//StrinBuffer--mutable
System.out.println("StringBuffer DEmo");
StringBuffer str=new StringBuffer("welcome");
str.append(" to java");
System.out.println(str);

//StringBilder--->mutable

System.out.println("Strinbuilder  demo");
StringBuilder str1=new StringBuilder("welcome");
str1.append(" to java");
System.out.println(str1);




}
}
