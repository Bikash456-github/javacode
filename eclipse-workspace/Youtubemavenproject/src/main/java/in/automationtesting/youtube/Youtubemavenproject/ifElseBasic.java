package in.automationtesting.youtube.Youtubemavenproject;

public class ifElseBasic {

	public static void main(String[] args) {
		int math = 25;
		//if(math<40) {
		//	System.out.println("Student failed in math");
	//}else {
	//		System.out.println("Student is passed in math");
	
	if(math>80){
System.out.println("student is passed with 1sd Division");
}else if (math>60 && math< 80) {
	System.out.println("student is passed with 2nd Division");
}else if (math > 40 && math <60) {
	System.out.println("student is passed with 3rd Division");
}else{
	System.out.println("Student is failed");
}}}