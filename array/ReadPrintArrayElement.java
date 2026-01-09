//Write a java program to read N integer elements into an array and print them
package array;
import java.util.Scanner;
public class ReadPrintArrayElement {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
//		Add array's size
		System.out.println("Enter Size of Array: ");
		int n = read.nextInt();
		int arr[] = new int[n];
	
//		Add and show element in the array
		System.out.println("Enter Array element: ");
		for(int i =0; i<arr.length; i++) {
			arr [i] = read.nextInt();
			System.out.println(arr[i]+" ");
		}
	read.close();
	}
}
