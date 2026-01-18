//Challenge 3: Count Elements Greater Than First Element

//Problem Statement
//You are given an array of integers.
// Write a Java program to count how many elements are greater than the first element of the array.
package array1D;
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
			
		Scanner read = new Scanner(System.in);
//		read number of elements
		System.out.println("Enter the size of array: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		
//		read array elements
		System.out.println("Enter the elements in array: ");
		for(int i=0; i<n; i++) {
			arr[i] = read.nextInt();
		}
		
		int firstElement = arr[0];
		int count = 0;
		
		for(int i=1; i<n; i++) {
			if(arr[i]>firstElement) {
				count++;
			}
		}
		System.out.println(count);
		read.close();
	}
}
