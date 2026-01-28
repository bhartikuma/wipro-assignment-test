package bharti;
import java.util.*;

class InvalidMarksException extends Exception{
	InvalidMarksException(String messaige) {
		super(messaige);
	}
}

public class InvalidMarksExceptions {
	public static void checkResult(int marks) throws InvalidMarksException{
		if(marks <0 || marks >100) {
			throw new InvalidMarksException("Invalid marks entered ");
		}else if(marks >=0 && marks <35) {
			throw new InvalidMarksException("Student failded");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		try {
			checkResult(marks);
			System.out.println("passed");
		}catch(InvalidMarksException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("result");
		}

	}

}
