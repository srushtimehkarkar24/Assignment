//5.Spiral Order Traversal
//Problem Statement:
// Print elements of the matrix in spiral order.
package array2D;
import java.util.Scanner;

public class Task5 {
			 public static void main(String[] args) {

			        Scanner sc = new Scanner(System.in);
			        int rows = sc.nextInt();
			        int cols = sc.nextInt();
			        int[][] arr = new int[rows][cols];

			
			        for (int r = 0; r < rows; r++) {
			            for (int c = 0; c < cols; c++) {
			                arr[r][c] = sc.nextInt();
			            }
			        }
			        int top = 0, bottom = rows - 1;
			        int left = 0, right = cols - 1;
			  
			        while (top <= bottom && left <= right) {

			         
			            for (int i = left; i <= right; i++) {
			                System.out.print(arr[top][i] + " ");
			            }
			            top++;

			   
			            for (int i = top; i <= bottom; i++) {
			                System.out.print(arr[i][right] + " ");
			            }
			            right--;
			            
			            if (top <= bottom) {
			                for (int i = right; i >= left; i--) {
			                    System.out.print(arr[bottom][i] + " ");
			                }
			                bottom--;
			            }
			            if (left <= right) {
			                for (int i = bottom; i >= top; i--) {
			                    System.out.print(arr[i][left] + " ");
			                }
			                left++;
			            }
			        }

			       sc.close();
	}
}
