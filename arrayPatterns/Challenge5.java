//Problem Statement:
// Find the maximum sum of consecutive elements in the array.

package arrayPatterns;
import java.util.Scanner;
public class Challenge5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int n = read.nextInt();
		int arr[] = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = read.nextInt();
		}

		int sum =0;
		int maxsum = arr[0];
		
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
			
			if(sum > maxsum) {
				maxsum = sum;
			}
			if(sum<0) {
				sum = 0;
			}
		}
		System.out.println(maxsum);
		read.close();
	}
}
