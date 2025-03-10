package Assignment_java;

public class Stringheredemo {
//writ a java program to test if a given string contains the specified sequence of char values
public static void main(String[] args)
{
	String str="dhungana";
	System.out.println(str.contains("na"));
	replace1();
	all();
	
}
	
static void replace1()
{
	String str="Dhungana";
	System.out.println(str.replace('s', 't'));
	}
	
static void all() {
	String str="Dhungana";
	System.out.println(str.replaceAll("[a-z]","M"));
}}