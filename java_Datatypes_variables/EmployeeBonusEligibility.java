package java_Datatypes_variables;
import java.util.Scanner;
public class EmployeeBonusEligibility {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		User input
		System.out.print("Enter Your Salary: ");
		int Salary = read.nextInt();
		
		System.out.print("Enter Your Experience: ");
		int Experience = read.nextInt();
		
//		Logic
		if(Salary>30000 && Experience>=3) {
			System.out.println("Congratulation! You are Eligilble For bonus!");
		}else {
			System.out.println("Soory! You are not Eligible for bonus!");
		}
		read.close();
	}

}
