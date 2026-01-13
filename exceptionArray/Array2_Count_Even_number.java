package exceptionArray;
import java.util.Scanner;
public class Array2_Count_Even_number {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		Enter the size of array
		System.out.println("Enter the size: ");
		int n = read.nextInt();
		int[]number = new int[n];
		
		
//		Array Declaration
		System.out.println("Enter the Numbers: ");
		int count = 0;
		for(int i=0; i<n; i++) {
			number[i] = read.nextInt();
			
//			Logic for Even number
			if(number[i] %2 == 0) {
				count++;
			}
		}
		
		System.out.println("Even Number Elements: "+count);
		read.close();
	}

}
