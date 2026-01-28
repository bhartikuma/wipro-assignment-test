package bharti;
import java.util.*;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String messaige){
		super(messaige);
	}
}

public class bankaccounr {
	public static void withdraw(int balance, int amount)
	        throws InsufficientBalanceException{
		if(amount > balance || (balance - amount)>1000 ) {
			throw new InsufficientBalanceException("Insufficient Balance u can't withdraw ");
		}
		else {
			System.out.println("withdraw sucsecfully "+amount);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = sc.nextInt();
		int amount = sc.nextInt();
		bankaccounr obj= new bankaccounr();
		try {
		obj.withdraw(balance, amount);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
