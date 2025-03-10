package in.automationtesting.youtube.Youtubemavenproject;

public class SwitchCaseBasic {

	public static void main(String[] args) {
		int dayNumber = 6;
		
		switch(dayNumber) {
			case 1:
				System.out.println("Day 1 is Monday");
				break;
			case 2:
				System.out.println("Day 2 is Tuesday");
			case 3:
			    System.out.println("Day 3 is Wednesday");
			case 4:
				System.out.println("Day 4 is Thrusday");
				break ;
			case 5:
				System.out.println("Day 5 is Friday");
			case 6:
				System.out.println("Day 6 is Saturday");
			case 7:
				System.out.println("Day 7 is Sunday");
				default:
				System.out.println("Day Number is invalid");
				
		}}

	}


