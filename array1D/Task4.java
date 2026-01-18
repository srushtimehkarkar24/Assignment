//Challenge 4: Check if Array is Palindrome

//Problem Statement
//An array is said to be a palindrome if it reads the same from left to right and right to left.
// Write a Java program to check whether the given array is a palindrome.

package array1D;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		read number of elements
		System.out.println("Enter the size of array: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in array: ");
		for(int i=0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		
		boolean isPalindrome = true;
		
		for(int i=0; i<n/2; i++) {
			if(arr[i] != arr[n - 1 - i]) {
				isPalindrome = false;
				break;
			}	
		}
		
		if(isPalindrome) {
			System.out.println("YES: Number is Palindrome ");
		}else {
			System.out.println("NO: Number is not Palindrome");
		}
		
		read.close();
	}
}
