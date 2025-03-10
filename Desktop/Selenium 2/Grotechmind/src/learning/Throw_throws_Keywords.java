package learning;
import java.lang.NullPointerException;
import java.util.InputMismatchException;

public class Throw_throws_Keywords {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws NullPointerException,InputMismatchException{
		//throws decelered the method
		if (11==1)
		{
		throw new NullPointerException("sorry your cell is empty");
		
		
	}
		else
		{
			
		throw new InputMismatchException("sorry check your input nbefore entereing");	
		}
	
}
}