package Assignment_java;

import java.util.Arrays;

public class Stringhandledemo {
public static void main(String[] args) {
	
	
	
	String m="tester";
	System.out.println(m);
	System.out.println("hello tester");
	//Length of String
	System.out.println(m.length());
	//concat method combines 2 or more strings
	String m1="Dhungana";
	String m2="Bikash";
System.out.println(m1+m2);//1st approach
	System.out.println(m1.concat(m2));//2nd approach
	String m3="sarmila";
	System.out.println(m1+m2+m3);
	System.out.println(m1+m2.concat(m3));
	System.out.println("Dhungana"+m2.concat(m3));
	//trim method demo remove spacesleft n right
	System.out.println("length of m1 is ......"+m1.length());
String mm="     Pokhara     ";
System.out.println("length of string  "+mm+"is ..."+mm.length());
System.out.println(mm.trim());
System.out.println("length after trim method utilization is"+mm.trim().length());
//charAt() return character at particular position
//charAt()return character at particular at that index
System.out.println(m3.charAt(2));
//contains method to verify string present r not returns boolean value
System.out.println(m2.contains("fee"));//false
System.out.println(m2.contains("see"));//true
System.out.println(m2.contains("gan"));//true
//equal ignore case ---return boolean values
System.out.println(m1.equals("Dhungana"));//false
System.out.println(m1.equals(m3));//false
m2="Nepal";
System.out.println(m2==m3);//true
System.out.println(m1.equalsIgnoreCase("Dhungana"));

//replace()-->replace single r multiple characters in a string in sequence
m="welcome to automation Testing ";
System.out.println(m.replace('r', 'T'));
System.out.println(m.replace(" "," System.out.println(m);$"));
System.out.println(m1.replace("ram", "shaym"));

//substring() efeect substring from main string 
m="Sarmila";
System.out.println("substring with inderx"+m.substring(3));
System.out.println(m.substring(0,4));
System.out.println(m.substring(1,3));
System.out.println(m.substring(0,2));

System.out.println(m.toUpperCase());
System.out.println(m.toLowerCase());
//split()--split string based on delimeter
m3="xy@gmail.com";
String b[]=m3.split("@");
System.out.println(Arrays.toString(b));
System.out.println(b[2]);
System.out.println(b[1]);
//example--1
String amt="$647,46347,547";
System.out.println(amt.replace("$", "").replace("", ""));

//example--2
m="xyz,123@abc";
String arr[]=m.split(",");
System.out.println(Arrays.toString(arr));
String arr2[]=arr[1].split("*");

System.out.println(Arrays.toString(arr2));
System.out.println(arr[0]);
System.out.println(arr2[0]);
System.out.println(arr2[1]);
//*%^() for these we cannot use split operator as delimeters



}}