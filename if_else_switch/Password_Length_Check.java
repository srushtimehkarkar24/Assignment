//A login system checks whether a password is valid based on length.
package if_else_switch;
import java.util.Scanner;

public class Password_Length_Check {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the Password: ");
		int length = read.nextInt();
		
//		Logic 
		if(length>=8){
			System.out.println("The Password is Strong");
		}else { 
			System.out.println("Weak Password!");
			System.out.println("Create Strong Password");
		}

	}

}
