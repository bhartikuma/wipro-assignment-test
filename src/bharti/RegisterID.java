package bharti;
import java.util.*;
public class RegisterID {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Set<String> patientId = new HashSet<>();
		patientId.add("Bharti21");
		patientId.add("Rajatdalal");
		patientId.add("Rica345");
		patientId.add("PatraSinha23");
		patientId.add("Bharti344");
		patientId.add("tina23");
		patientId.add("arti21");
		System.out.println("Enter the patient ID");
		String newid = sc.nextLine();
		
			if(patientId.contains(newid)) {
				System.out.println("This id is alrady in the database");
			
		

				
			}else {
				patientId.add(newid);
	            System.out.println("New id is created");
			}
			System.out.println("list of all register patient total is : "+patientId);
			System.out.println(patientId);
			
		
		sc.close();
		
		
	}

}
