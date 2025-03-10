package Assignment;

public class Caar {
	
	/*Constructor with Default Values
	Write a Java program to create a class called Car with instance variables make, model, and year. 
	Implement a parameterized constructor that initializes these variables and assigns default values 
	if not provided. Print the values of the variables.*/

		private String make;
		private String model;
		private int year;
		Caar(String make,String model,int year)
		{
			System.out.println("local string "+make);
			this.make=make;
			this.model=model;
			this.year=year;
			
		}
		
	public static void main(String[] args)
	{
		Caar c1=new Caar("Audi","Q3",2021);
		System.out.println("the details of the car are as follows");
		System.out.println("this car was produced by"+c1.make);
		System.out.println("model of the car is"+c1.model);
		System.out.println("produced in the year"+c1.year);
	}
	}

