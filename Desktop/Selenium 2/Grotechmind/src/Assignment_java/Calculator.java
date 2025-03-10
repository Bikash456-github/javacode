package Assignment_java;

public class Calculator {
	
		//non static method to add two number
		public int add(int a,int b) {
			return a+b;
				
			}
				public static void main(String[] args) {
					//create an instance of the calculator class
					Calculator calc=new Calculator();
				
					//call the non static method using the instance
					int result=calc.add(5,3);
					//print the result
					System.out.println("the sum is:"+result);
					
				}
	}
			
			
				
			

				
			
