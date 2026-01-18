//Problem Statement:
// Replace all negative elements in the array with 0 and print the updated array.

package arrayPatterns;
import java.util.Scanner;
public class Challenge4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]<0) {
			 arr[i] = 0;
			}
		}
	
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+ " ");
		}
		read.close();
	}
}
