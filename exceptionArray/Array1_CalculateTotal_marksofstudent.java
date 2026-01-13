package exceptionArray;
import java.util.Scanner;
public class Array1_CalculateTotal_marksofstudent {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the subjects: ");
		int n = read.nextInt();
		
		int[] mark = new int[n];
		int total = 0;
		
		for(int i =0; i<n; i++) {
			mark[i] = read.nextInt();
			total += mark[i];
		}
		System.out.println("Total Marks: "+total);
		read.close();
		
	}

}
