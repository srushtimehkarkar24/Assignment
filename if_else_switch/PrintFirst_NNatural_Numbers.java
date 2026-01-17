//Print the first N natural numbers starting from 1.
package if_else_switch;
import java.util.Scanner;
public class PrintFirst_NNatural_Numbers {

	public static void main(String[] args) {
		
//		For user input
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int num = read.nextInt();
		
		for(int i=0; i>num; i++) {
			System.out.println("The Natural Numbers: "+num);
		}

	}	

}
