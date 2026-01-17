//A company system identifies whether a day is a Working Day or Weekend.
package if_else_switch;
import java.util.Scanner;

public class Day_Type_Identifier {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the Day: ");
		int day = read.nextInt();
		
//		Logic
		switch(day) {
		
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Working Day");
			break;
		case 6:
		case 7:System.out.println("Sunday");
			System.out.println("It's WEEKEND");
			break;
		default:
			System.out.println("Invalid INPUT!");
		}
	}

}
