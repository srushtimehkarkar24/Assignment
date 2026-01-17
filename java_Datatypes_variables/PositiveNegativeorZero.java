//Write a program to identify whether a given number is positive, Negative or Zero
package java_Datatypes_variables;
import java.util.Scanner;

public class PositiveNegativeorZero {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = read.nextInt();
		
		if(num>0) {
			System.out.println("The number is positive!");
		}else if(num<0) {
			System.out.println("Tne number is negative!");
		}else if(num==0){
			System.out.println("The number is Zero ");
		}else {
			System.out.println("Enter the valid character! ");
		}
		System.out.println("End! ");
		read.close();
	}
	

}
