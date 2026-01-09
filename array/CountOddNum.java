////Count how many odd number present in the array
package array;
import java.util.Scanner;
public class CountOddNum {

	public static void main(String[] args) {
				
				Scanner read = new Scanner(System.in);
				
//				Enter the size
				System.out.println("Enter the size of array: ");
				int n = read.nextInt();
				int arr[] = new int[n];
				
//				Enter the elements
//				Read the elements
				
				System.out.println("Enter the elements: ");
				int count = 0;
				for(int i = 0; i<arr.length; i++) {
					arr[i] = read.nextInt();
					
//					Logic for odd number
					if(arr[i] % 2 != 0) {
						count++;
					}
			    }
					System.out.println("Odd number elements: "+count);
		   }

	}

