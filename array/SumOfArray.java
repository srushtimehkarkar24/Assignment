//Write a program to calculate the sum of all elements in array
package array;
import java.util.Scanner;
public class SumOfArray {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		Enter the size
		System.out.println("Enter the size of array: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		
//		Enter the elements
//		Read the elements
		
		System.out.println("Enter the elements: ");

		for(int i = 0; i<arr.length; i++) {
			arr[i] = read.nextInt();
			System.out.print(arr[i]+" ");
			System.out.println();
		}
//			Sum of the array
			int sum=0;
			for(int i = 0; i<arr.length; i++) {
				sum = sum + arr[i];
		}
			System.out.println("Sum of array is:  "+sum);
		
	}

}
