package Assignment_java;


import java.util.Scanner;
public class Numberchecker {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
				if(number==19) {
					System.out.println("the number is 19");
				}else if (number==7) {
					System.out.println("the number is 7");
				}else {
					System.out.println("the number is neither 19 not 7");
				}
		
	}
}
