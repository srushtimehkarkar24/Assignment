//Write a program to print largest number in the array
package array;
import java.util.Scanner;
public class FindMaximumElement {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

//		Enter the size
		System.out.println("Enter the size of array: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		int max = arr[0];
//		Enter the elements
//		Read the elements
		
		System.out.println("Enter the elements: ");
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = read.nextInt();
			
//		Find Maximum element
		
		if(arr[i]>max) {
			max = arr[i];
		}
	}
		System.out.println("Largest number is: "+max);

}
}