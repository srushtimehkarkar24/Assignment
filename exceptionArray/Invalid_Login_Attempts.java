package exceptionArray;

public class Invalid_Login_Attempts {

	public static void main(String[] args) {
	
		int attempts = 6;

		
		try {
			if(attempts>3) {
				throw new LoginAttemptExceededException("Maximum attempts! Your account is locked !");
			}else {
				System.out.println("Access Granted!");
			}
		}
		catch(LoginAttemptExceededException ob) {
			ob.printStackTrace();
		}
	}
}

	class LoginAttemptExceededException extends RuntimeException{
		LoginAttemptExceededException(String msg){
			super(msg);
		}
	}

