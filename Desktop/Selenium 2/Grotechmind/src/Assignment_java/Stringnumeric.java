package Assignment_java;

public class Stringnumeric {
public static void main(String[] args) {
	int count_of_alphabet=0;
	int count_of_numeric=0;
	int count_of_space=0;
	int count_of_sepcialchar=0;
	int count_of_upper=0;
	String a="manishkuMAr8574524578m";
			char[]c1=    a.toCharArray();		
	for (int i=0;i<a.length();i++) {
		boolean b1=Character.isLetter(c1[i]);
		if(b1==true) {
			count_of_alphabet++;}}
				System.out.println("the number of alphabets are:-"+count_of_alphabet);		
	for (int i=0;i<a.length();i++) {
		boolean b2=Character.isDigit(c1[i]);
		if( b2==true) {
			count_of_numeric++;}}
	System.out.println("the number of numeric are:-"+count_of_numeric);
	for(int i=0;i<a.length();i++) {
	boolean b2=Character.isDigit(c1[i]);
	if(b2==true) {
		count_of_sepcialchar++;}}
	System.out.println("the number of specialchar are:-"+count_of_sepcialchar);
	for (int i=0;i<a.length();i++) {
		boolean b2=Character.isDigit(c1[i]);
		if( b2==true) {
			count_of_numeric++;}}
	System.out.println("the number of numberic are:-"+count_of_numeric);
	for (int i=0;i<a.length();i++) {
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==false) {
			count_of_space++;}}
	System.out.println("the number of space are:-"+count_of_space);
	for (int i=0;i<a.length();i++) {
		boolean b4=Character.isUpperCase(c1[i]);
if(b4==true) {
	count_of_upper++;}}
	System.out.println("the number of upper are:-"+count_of_upper);}}


	
	
	
