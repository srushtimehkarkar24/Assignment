//Determine whether a given number is Positive, Negative, or Zero.
package if_else_switch;
import java.util.Scanner;

public class NumberSignChecker {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = read.nextInt();
		
//		Logic
		if(num>0) {
			System.out.println("The number is Positive");
		}else if(num<0) {
			System.out.println("The number is Negative");
		}else if(num==0) {
			System.out.println("The number is Zero");
		}else {
			System.out.println("Invalid character! please enter valid character");
		}
		
	}

}
