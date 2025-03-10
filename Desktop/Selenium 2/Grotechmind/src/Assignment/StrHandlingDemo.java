package Assignment;
import java.util.Arrays;
public class  StrHandlingDemo{
	
	
	
		public static void main(String[] args)
		{
			String s="welcome";
			System.out.println(s);
			System.out.println("Helloworld");
			//Lenght of String
			System.out.println(s.length());
			//Concat method combines 2 or more strings
			String s1="kommareddy";
			String s2="Leelarani";
			System.out.println(s1+s2);//1st approach
			System.out.println(s1.concat(s2));//2nd approach
			String s3="ganesana";
			System.out.println(s1+ s2+s3);
			System.out.println(s1+s2.concat(s3));
			System.out.println(s1.concat(s2).concat(s3));
			System.out.println("kommareddy"+s2.concat(s3));
			
			//Trim method demo remove spacesleft nd right
			System.out.println("length of s1 is...."+s1.length());
			String ss="    Tanishka   ";
			System.out.println("lenght of string "+ss+"is..."+ss.length());
			System.out.println(ss.trim());
			System.out.println("length after trim method utilization is"+ss.trim().length());
		//charAt() return charecter at particular position
			//return the character at that index
			System.out.println(s3.charAt(2));
			//contains method to verify string present r not returns boolean value
			System.out.println(s2.contains("re"));//false
			System.out.println(s2.contains("ran"));//true
			System.out.println(s3.contains("gan"));//true
			//equals   equalsIgnoreCase---returns boolean value
			System.out.println(s1.equals("Kommareddy"));//false
			System.out.println(s1.equals(s3));//false
			s2="ganesana";
			System.out.println(s2==s3);//true
			
			System.out.println(s1.equalsIgnoreCase("KoMMaReddy"));
		
			//replace()-->replace singel r multipel characters in a string in sequence
			s="welcome to Testing domain";
			System.out.println(s.replace('e', 'T'));
			System.out.println(s.replace(" ","System.out.println(s);$"));
			System.out.println(s1.replace("kom", "Kom"));
		//substring()  etract substring from main string
			s="Shresta";
			System.out.println("substring with index"+s.substring(3));
			System.out.println(s.substring(0,3));
			System.out.println(s1.substring(2,5));
			System.out.println(s2.substring(0,1));
			
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			//split()--split string based on delimeter
			s3="asxr234fg@gmail.com";
			String a[]=s3.split("@");
			System.out.println(Arrays.toString(a));
			System.out.println(a[0]);
			System.out.println(a[1]);
			//example--1
			String amt="$121,234,567";
			System.out.println(amt.replace("$", "").replace(",", ""));
			//example--2
			s="abc,123@xyz";
			String arr[]=s.split(",");
			System.out.println(Arrays.toString(arr));
			String arr2[]=arr[1].split("@");
			
			System.out.println(Arrays.toString(arr2));
			System.out.println(arr[0]);
			System.out.println(arr2[0]);
			System.out.println(arr2[1]);
			
			//*  % ^ & ( ) for these we cannot use split operator as delimeters
		}
		
		



}
