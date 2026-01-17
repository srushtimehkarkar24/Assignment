//A company allows office entry only if an employee arrives before or at 9 AM
package if_else_switch;
import java.util.Scanner;

public class OfficeEntryEligibility {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the Entry Time: ");
		int entryTime = read.nextInt();
		
//		Logic
		 if(entryTime<=9) {
			 System.out.println("You allow in the office");
		 }else {
			 System.out.println("Late Entry!");
		 }
		
	}

}
