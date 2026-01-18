// Find the largest element from each row of a matrix.
package array2D;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

			        Scanner sc = new Scanner(System.in);
			        
//			        Declare a 2D array of size 2x2

			        int rows = sc.nextInt();
			        int cols = sc.nextInt();
			        int[][] arr = new int[rows][cols];

//			        Taking input for the 2D array
			        for (int r = 0; r < rows; r++) {
			            for (int c = 0; c < cols; c++) {
			                arr[r][c] = sc.nextInt();
			            }
			        }

			        for (int r = 0; r < rows; r++) {
			            int max = arr[r][0];
			            for (int c = 1; c < cols; c++) {
			                if (arr[r][c] > max) {
			                    max = arr[r][c];
			                }
			            }
			            System.out.print(max + " ");
			        }

			        sc.close();
				}		

			}
