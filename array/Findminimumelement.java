//Write a program to find the minimum element in the array
package array;
import java.util.Scanner; 
public class Findminimumelement {

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
		}
		
//		Find Minimum element
		int minimum = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
		if(arr[i]<minimum) {
			minimum = arr[i];
		}
	}
		System.out.println("Smallest number is: "+minimum);

	}

}
