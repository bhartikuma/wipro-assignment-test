package bharti;
import java.util.*;


public class bankLoanEligiblitySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=21;
		Integer cibil =(Integer) 700;
	
		ArrayList<Double> monthlyIncome = new  ArrayList<>();
		monthlyIncome.add(23445.34);
		monthlyIncome.add(2345.24);
		monthlyIncome.add(23454.34);
		monthlyIncome.add(2222227.5);
		monthlyIncome.add(76423.45);
		for(Double i : monthlyIncome) {
			
			if(age > 21 && cibil >=700 && i>20000) {
				System.out.println("Eligible for loan : "+i);
			}
			else {
				System.out.println("Not Eligible :" + i);
			}
		}
		



	}

}
