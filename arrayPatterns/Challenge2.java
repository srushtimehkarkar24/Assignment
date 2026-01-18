//Problem Statement:
// Find the second largest distinct element in the array.
package arrayPatterns;
import java.util.Scanner;
public class Challenge2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		Read the array size
		int n = read.nextInt();
		
//		Read the array element
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i = 1; i<n; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]<largest && arr[i]>secondLargest) {
				secondLargest = arr[i];
			}
		}
	System.out.println(secondLargest);
	read.close();
	}

}
