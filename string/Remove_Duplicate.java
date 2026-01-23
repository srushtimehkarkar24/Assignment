//Remove duplicate characters while maintaining order.
package string;
public class Remove_Duplicate {

	public static void main(String[] args) {
	
				// input string
				String str = "programming";
				removeDuplicate(str);
			}
			public static void removeDuplicate(String str) {
				// business logic 
				int len = str.length();
				String result = " ";
						for(int i = 0; i < len; i++) {
							char ch = str.charAt(i);
							  if (result.indexOf(ch) == -1) {
					                result = result + ch;
					            }
					        }
						// display
					        System.out.println(result);
					    }
					}
		



