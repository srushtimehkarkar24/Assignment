//A digital wallet application allows a maximum transaction of ₹50,000 per day.
// If the user tries to exceed this limit, throw a custom exception.

package exceptionArray;

public class Transaction_Limit_Exceeded {

	public static void main(String[] args) {
		int transaction = 50000;
		
	try {
		if(transaction>50000) {
			throw new TransactionLimitExceededException("Transaction Limit is Over!"); 
			}else {
				System.out.println("Transaction Successful!");
			}
		}
		catch(TransactionLimitExceededException ob) {
			ob.printStackTrace();
		}
	}
}
		class TransactionLimitExceededException extends RuntimeException{
			TransactionLimitExceededException(String msg){
				super(msg);
			}
		}
