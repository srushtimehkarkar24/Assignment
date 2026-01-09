//Print elements stored at odd index position
package array;

import java.util.Scanner;

public class Printelementoddindex {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		
//		Enter the elements
//		Read the elements
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<arr.length; i++) {
		arr[i] = read.nextInt();
		
//		logic for odd index 
		if(i % 2 != 0) {
		System.out.println(arr[i]);
			}
		}
	}
}