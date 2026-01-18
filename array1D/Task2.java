//Challenge 2: Check if All Elements Are Unique
//Problem Statement
//Given an array of integers, check whether all elements are unique.
// If any element repeats, print NO, otherwise print YES.
package array1D;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		read elements in array
		System.out.println("Enter size of array: ");
		int n = read.nextInt();
		
//		declare elements in array
		int arr[] = new int[n];
		
		System.out.println("Enter elements in array: ");
		for(int i=0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		
		boolean isUnique = true;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					isUnique = false;
					break;
				}
			}
			if(isUnique)
				break;
		}
		
			if(isUnique) {
				System.out.println("YES: Number is Unique!");
			}else {
				System.out.println("NO : Number is Duplicate!");
			}
			read.close();
		}
}
