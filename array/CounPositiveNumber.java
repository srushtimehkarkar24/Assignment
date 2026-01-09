//count how many positive numbers exist in the array
package array;
import java.util.Scanner;
public class CounPositiveNumber {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
//		Enter the size of the array
		System.out.println("Enter the size of the array");
		
		int n = read.nextInt();
		int arr[] = new int[n];
		int count = 0;
		
//		Enter the elements
//		Read the elements
		
		System.out.println("Enter the elements: ");
		for(int i = 0; i<arr.length; i++) {
		arr[i] = read.nextInt();
		if(arr[i]>0) {
			count++;
		}
		}
		System.out.println("Number of positive elements: "+count);

     }
}
