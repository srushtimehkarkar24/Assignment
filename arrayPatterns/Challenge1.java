// Given an integer array and a number X,
//check whether X is present in the array.

package arrayPatterns;
import java.util.Scanner;
public class Challenge1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		Read size of array
		int n = read.nextInt();
		
//		Read Array elements
		int arr[] = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		
		int X = read.nextInt();
		
		boolean found = false;
		for(int i=0; i<n; i++) {
			if(arr[i] == X) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
		
		read.close();
	}

}
