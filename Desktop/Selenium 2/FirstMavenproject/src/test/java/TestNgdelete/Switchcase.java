package TestNgdelete;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Switchcase {

	public static void main(String[] args) {
		System.out.println("press1 for chrome");
		System.out.println("press1 for firefox");
		System.out.println("press1 for edge");
		System.out.println("press1 for safari");
		System.out.println("press1 for IE");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		switch(a)
		{
		case 1:
			ChromeDriver driver=new ChromeDriver();
			System.out.println("lunch chrome browser again");
		break;
		case 2:
		
			System.out.println("lunch firefox browser");
			break;
		  case 3:
		
			System.out.println("lunch edge browser");
			break;
		case 4:
		
			System.out.println("lunch safari browser");
			break;
		
		case 5:
		
			System.out.println("lunch IE");
			break;
		
		
		
		
	}
	}
	}

