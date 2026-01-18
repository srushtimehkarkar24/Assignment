//Check Identity Matrix
//Problem Statement:
// Check whether a given square matrix is an Identity Matrix.
package array2D;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        int n = sc.nextInt();

//			        Declare a 2D array of size 2x2

			        int[][] arr = new int[n][n];
			        
//			        Taking input for the 2D array
			        for (int r = 0; r < n; r++) {
			            for (int c = 0; c < n; c++) {
			                arr[r][c] = sc.nextInt();
			            }
			        }

			        boolean isIdentity = true;

			        for (int r = 0; r < n; r++) {
			            for (int c = 0; c < n; c++) {
			                if (r == c && arr[r][c] != 1) {
			                    isIdentity = false;
			                } 
			                else if (r != c && arr[r][c] != 0) {
			                    isIdentity = false;
			                }
			            }
			        }
			        if (isIdentity)
			            System.out.println("Yes");
			        else
			            System.out.println("No");

			        sc.close();
			    }   
}
