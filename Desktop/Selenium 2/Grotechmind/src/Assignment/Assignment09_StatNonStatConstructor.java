package Assignment;

public class Assignment09_StatNonStatConstructor {
//ststic method 1
	static void statMethod1(float salary)
	{
		System.out.println("Salary is"+salary);
	}
	//static method 2
	static void statMethod2(String fName,String lName)
	{
		System.out.println("full name is "+fName+" "+lName);
	}
	//Static method 3
	static void statmethod3(String mobile)
	{
		System.out.println("mobile num is"+mobile);
	}
	//nonstatic method
	void nonstaticmethod1(String dob)
	{
		System.out.println("dob is"+dob);
	}
	// non static method 2
	void nonstaticmethod2(char gender)
	{
		System.out.println("genderis"+gender);
	}
	//non static method 3
	 void nonstaticmethod3(int age)
	 {
		 System.out.println("Age is"+age);
	 }
	 //constructor 1 constructor should have same name as class name
	 Assignment09_StatNonStatConstructor (char shopdone)
	 {
		System.out.println("shopping done?"+shopdone); 
	 }
	 //constructor 2 with argument
	 Assignment09_StatNonStatConstructor (int bill)
	 {
		System.out.println("finall bill"+bill); 
	 }
	 //constructor 3 with arguments
	 Assignment09_StatNonStatConstructor (String city) {
		 
		 System.out.println("city is"+city);
	
	 }
		 public static void main(String[] args) {
		
		//calling static method by its name 
		 statMethod1(150000.50f);
		 statMethod2("bikash","dhungana");
		 statmethod3("425634363");
		 //calling non static method by creating object
		 Assignment09_StatNonStatConstructor a1=new Assignment09_StatNonStatConstructor('y'); 
	 // while creating object with variable a1 constructor with char argunment called already
	    a1.nonstaticmethod1("10/02/1928");
		a1.nonstaticmethod2	('f');	 
		a1.nonstaticmethod3(30);
		 }	 
	 
	 }
