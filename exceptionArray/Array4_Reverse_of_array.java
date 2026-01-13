package exceptionArray;
import java.util.Scanner;
public class Array4_Reverse_of_array {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
//		Enter the array size
		System.out.println("Enter the size: ");
		int n = read.nextInt();
		
		int arr[] = new int[n]; 
		
//		Enter the Numbers
		System.out.println("Enter the Numbers: ");
		for(int i =0; i<n;i++) {
			arr[i] = read.nextInt();
		}
		System.out.println("Reverse of array: ");
		for(int i=n-1; i>=0; i--) {
			System.out.println(arr[i]+" ");
			
		}
	}
}
