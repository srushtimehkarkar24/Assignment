package string;

public class Non_Repeating_char {

	public static void main(String[] args) {
	
				// Find first non repeating characters in a string
				
				// input string 
				String input = "Java is object oriented"; 
				
				// Variable to store  first non-repeating character
		        char firstNonRepeatChar = 0; 
		        
		        boolean found = false; 

		        // Outer loop to travel  character of  string
		        for (int i = 0; i < input.length(); i++) {
		            boolean isRepeating = false; 
		            
		         // current character
		            char currentChar = input.charAt(i); 

		            // Inner loop compares with current character 
		            for (int j = 0; j < input.length(); j++) {
		                // do not compare the character with itself
		                if (i != j && currentChar == input.charAt(j)) {
		                    isRepeating = true; // the character is repeating
		                    break; // Exit inner loop if char is repeat
		                }
		            }

		            // If after checking all  characters, it's not repeating
		            if (!isRepeating) {
		            	
		                firstNonRepeatChar = currentChar; 
		                found = true; // Set it true
		                break; // Exit the outer loop 
		            }
		        }

		        // Print 
		        if (found) {
		            System.out.println("The first non repeated character is: " + firstNonRepeatChar);
		        } else {
		            System.out.println("There is no non repeating character in the string."+input);
		        }
	}

}
