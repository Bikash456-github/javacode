package Assignment_java;

public class Global {
	
	static int daysInyear=365;
	static int monthsInyear = 12;
    static String[] month= {"jan","feb","march","nov",};

    public static void main(String[] args) {
		for(int i = 0; i < monthsInyear;  i++) 
			System.out.println(month[i]);
			
		}
	
    
	public static int getDaysInYear() {
		return daysInyear;
		
	
		
		
	}
	
	

}
