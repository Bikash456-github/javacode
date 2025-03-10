package Assignment_java;

public class Calculator1 {
	//static method to add two numbers
	public static int add(int a,int b){
return a+b;
	}
public static void main(String[] args) {
	//call the static method directly using the class name 
int result=Calculator1.add(5,3);
	
	//print the result
System.out.println("the sum is:"+result);
	
	
}}
