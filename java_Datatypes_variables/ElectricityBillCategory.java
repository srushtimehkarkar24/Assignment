//Electricity board categorizes users based on units consumed
package java_Datatypes_variables;
import java.util.Scanner;

public class ElectricityBillCategory {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the units consumed: ");
		int unit = read.nextInt();
		
		if(unit<=100) {
			System.out.println("Low Usage! ");
		}else if(unit>100 && unit<=300) {
			System.out.println("Medium Usage! ");
		}else {
			System.out.println("High Usage!");
		}
		System.out.println("End!");
		read.close();
	}

}
