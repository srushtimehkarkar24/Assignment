//A college result system allows marks only in the range 0 to 100.
// If invalid marks are entered, throw a custom exception.

package exceptionArray;

public class Student_Marks_Validation {

	public static void main(String[] args) {
		int marks = 85;
		
		try {
			if(marks<0 || marks>100) {
				throw new InvalidMarksException("You Entered Invalid Character! Enter Valid Character!");
			}else {
				System.out.println("Saved Successfully! ");
			}
		}
		catch(InvalidMarksException ob) {
			ob.printStackTrace();
		}
		
	}
}
		class InvalidMarksException extends RuntimeException{
			InvalidMarksException(String msg){
				super(msg);
			}
		}
	


