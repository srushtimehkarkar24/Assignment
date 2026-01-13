//You are developing a banking system where an account must maintain a minimum balance of ₹1000.
// If a withdrawal causes the balance to go below the minimum limit, the system should throw a custom exception.

package exceptionArray;

public class Minimum_Balance_Rule {

	public static void main(String[] args) {
		int balance = 30000;
		int withdraw = 90000;
		
		try {
//		exception
			if(balance - withdraw < 1000) {
			throw new MinimumBalanceException("Insufficient Balance! Minimum balance must be 1000.");
		} else{
			balance = balance - withdraw;
			System.out.println("Withdraw successful!");
			System.out.println("Updated Balance: "+balance);
			}
		} catch(MinimumBalanceException ob) {
			   ob.printStackTrace();
		   }
	}
}
	class MinimumBalanceException extends RuntimeException{
		public MinimumBalanceException(String msg) {
			super(msg);
		
	}

}
