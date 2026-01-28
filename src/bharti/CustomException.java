package bharti;
import java.util.*;

class InvalidPasswordException extends Exception{
	InvalidPasswordException(String password){
		super(password);
	}
}

public class CustomException {
	public static void invalidPassword(String password) throws InvalidPasswordException{
		if(password.length()<8) {
			throw new InvalidPasswordException("Password must contains at least 8 character");
			}

		boolean isdigit = false;
		for(int i=1;i<password.length();i++) {
			char ch = password.charAt(i);
			if(Character.isDigit(ch)) {
				isdigit = true;
			}
		}
		if(!isdigit) {
			throw new InvalidPasswordException("Password must contains at least 1 digit");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		String password = sc.nextLine();
		try {
			invalidPassword(password);
			System.out.println("Valid password");
		}catch(InvalidPasswordException e) {
			System.out.println("Invalid password "+e.getMessage());
		}

	}

}
