// Count Positive, Negative and Zero Elements
//You are given an array of integers representing daily profit and loss values.
// Write a Java program to count:
package array1D;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array: ");
		int n = read.nextInt();
		
	
		int arr[] = new int[n];
		
		int countPositive = 0;
		int countNegative = 0;
		int countzero = 0;
		
		System.out.println("Enter elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = read.nextInt();
			
			if(arr[i]>0) {
				countPositive++;
			}else if(arr[i]<0) {
				countNegative++;
			}else {
				countzero++;
			}
		}
		System.out.println("Number Of Positive elements: "+countPositive);
		System.out.println("Number of Negative elements: "+countNegative);
		System.out.println("Number of Zero elements: "+countzero);
		
		read.close();
	}

}
