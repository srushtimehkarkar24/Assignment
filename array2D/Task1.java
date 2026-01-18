//Count the number of even and odd elements present in a 2D array.
package array2D;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
	
			        Scanner sc = new Scanner(System.in);
			        
//			        Declare a 2D array of size 2x2
			        int[][] arr = new int[2][2];

//			        store count of even and odd numbers
			        int even = 0, odd = 0;

//			        Taking input for the 2D array
			        for (int r = 0; r < 2; r++) {
			            for (int c = 0; c < 2; c++) {
			            	
			                arr[r][c] = sc.nextInt();
			            }
			        }

			        for (int r = 0; r < 2; r++) {
			            for (int c = 0; c < 2; c++) {
			            	
//					 Logic for even or odd
			                if (arr[r][c] % 2 == 0)
			                    even++;
			                else
			                    odd++;
			            }
			        }
			        System.out.println("Even = " + even);
			        System.out.println("Odd = " + odd);

			        sc.close();
	}
}
