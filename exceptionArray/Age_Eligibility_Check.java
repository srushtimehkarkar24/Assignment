//A job portal allows users to register only if their age is between 21 and 35.
// If the age is outside this range, throw a custom exception.

package exceptionArray;

public class Age_Eligibility_Check {

	public static void main(String[] args) {
		int age = 38;
		
		try {
			if(age < 21 || age > 35 ) {
				throw new InvalidAgeException("Age is not in range. You are not able to register! ");
			}else {
				System.out.println("Registeration Successful!");
			}
				
			}catch(InvalidAgeException ob) {
				ob.printStackTrace();
		}
	}
}
class InvalidAgeException extends RuntimeException{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}