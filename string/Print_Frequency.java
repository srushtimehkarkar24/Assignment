package string;

public class Print_Frequency {
		  public static void main(String[] args) {

			  //input string
		        String input = "aabbc";
		        Freq(input);
		    }
		  public  static void Freq(String s) {
			  
			 // business logic
		    for (int i = 0; i < s.length(); i++) {
		        char ch = s.charAt(i);
		        int count = 0;

		        if (s.indexOf(ch) == i) { 
		            for (int j = 0; j < s.length(); j++) {
		                if (s.charAt(j) == ch) {
		                    count++;
		                }
		            }
		            System.out.println(ch + "=" + count);
		        }
		 }
	}

}
