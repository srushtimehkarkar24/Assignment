//Problem Statement:
// Find the difference between the maximum and minimum element in the array.

package arrayPatterns;
import java.util.Scanner;
public class Challenge3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		int diff = max - min;
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println(diff);
		read.close();
	}

}
