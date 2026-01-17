//A bank checks whether an account has minimum required balance
package java_Datatypes_variables;
import java.util.Scanner;

public class MinimumBalanceCheck {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the account balance: ");
		double balance = read.nextDouble();
		
//		Logic for check the balance
		if(balance>=1000) {
			System.out.println("Your account has sufficient balance! ");
		}else {
			System.out.println("Sorry! Your account has low balance! ");
		}
		
		read.close();
	}

}
