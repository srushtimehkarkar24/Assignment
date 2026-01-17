//check whether a person is eligible for the vote or not
package java_Datatypes_variables;
import java.util.Scanner;

public class VoterEligibilityCheck {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Let's Check person is eligible for the vote or not !");
		System.out.println();
		System.out.println("Enter the age: ");
		int age = read.nextInt();
		
		if(age>=18) {
			System.out.println("The person is eligible for the vote! ");
		}else {
			System.out.println("The person is not eligible for the code! ");
		}

		System.out.println("End!");
		read.close();
	}

}
