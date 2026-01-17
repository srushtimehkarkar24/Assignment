//Bank approves a loan based on the following conditions
package java_Datatypes_variables;
import java.util.Scanner;
public class LoanApprovalSystem {

	public static void main(String[] args) {
		Scanner read  = new Scanner(System.in);
		
		System.out.print("Enter Your Age: ");
		int age = read.nextInt();
		
		System.out.print("Enter Your Monthly Salary: ");
		double salary = read.nextDouble();
		
		System.out.print("Enter Your Credit Score: ");
		int score = read.nextInt();
		
		if(age>=21) {
			if(salary>=25000) {
				if(score>=700) {
					System.out.println("===============================");
					System.out.println("Congrats! Your Loan is Approved! ");
				}else {
					System.out.println("===============================");
					System.out.println("Sorry! Your Loan is Rejected! ");
				}
			}else {
				System.out.println("===============================");
				System.out.println("Sorry! Your Loan is Rejected! ");
			}
		}else {
			System.out.println("===============================");
			System.out.println("Sorry! Your Loan is Rejected! ");
		}

	}

}
