package exceptionArray;
import java.util.Scanner;
public class Array3_Find_Max_Salary {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the size: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		int max = arr[0];
		
//		Declare the array
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = read.nextInt();
			
//		Logic for maximum salary
		if(arr[i]>max) {
			max = arr[i];
		}
	}
		System.out.println("Largest Salary Of the Employee: "+max);
		
	}

}
