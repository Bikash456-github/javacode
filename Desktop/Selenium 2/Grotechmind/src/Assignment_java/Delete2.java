package Assignment_java;
public class Delete2 {
void sound(){
	System.out.println("some generic animal sound");
}
}
	class Dog extends Delete2{
	
	void sound() {
		System.out.println("bark");
		}	
void fetch() {
	System.out.println("fetching");
}
		
	
public static void main(String[] args) {
	//upcasting Delete2 to Animal
	Delete2 delete=new Dog();
	//call god's overridden method
	delete.sound();
	
//animal.fetch() this would cause a compile time error
}
	}

	
	
	

	


