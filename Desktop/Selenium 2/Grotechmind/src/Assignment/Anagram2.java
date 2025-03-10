package Assignment;
import java.util.Arrays;
public class Anagram2 {
public static  boolean areAnagrams(String str1,String str2){
	
	str1=str1.replaceAll("\\s","").toLowerCase();
	str2=str2.replaceAll("\\s","").toLowerCase();
	//if lengths are not same ,they can't be anagrams
	if (str1.length()!=str2.length()) {
		return false;
}
//convert string to char arrays and sort them
	char[]charArrays1=str1.toCharArray();
	char[]charArrays2=str2.toCharArray();
	Arrays.sort(charArrays1);
	Arrays.sort(charArrays2);
	//check if sorted char arrays are equal
	return Arrays.equals(charArrays1, charArrays2);
	
}
public static void main(String[] args) {
	String str1="listen";
	String str2="Silent";
	
	if(areAnagrams(str1,str2)) {
		System.out.println(str1+"and"+str2+" are anagrams");
	System.out.println(str1+"and"+str2+"are not anagrams");
	
}
}}
