//Check whether a given number is present or not

package array;
import java.util.Scanner;

public class SearchanElement {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		
//		Enter the elements
//		Read the elements
		
		System.out.println("Enter the elements: ");
		for(int i =0;i<n; i++) {
			arr[i] = read.nextInt();
		}
		
//		logic for num present or not
		System.out.println("Enter number to search: ");
		int key = read.nextInt();
		
		boolean found = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==key) {
			found = true;
				break;
			}
			}
		
		if(found) {
			System.out.println("Number is present in array");
		}else {
			System.out.println("Number is not present in the array");
		}
		read.close();
	}

}
