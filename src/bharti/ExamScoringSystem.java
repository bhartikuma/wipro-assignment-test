package bharti;
import java.util.*;

public class ExamScoringSystem {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer>  studentscore = new HashMap<>();
		studentscore.put("Java" , 88);
		studentscore.put("MySql" , 98);
		studentscore.put("MPMC" , 58);
		studentscore.put("Testing" , 86);
		studentscore.put("Networking" , 88);
		int sum = 0;
		for(Map.Entry<String, Integer> entry : studentscore.entrySet()) {
			sum += entry.getValue();
		}
		int size= studentscore.size();
		double avg = (double) sum / size;
		System.out.println("Student Scores: " + studentscore);
        System.out.format("Average Score: %.2f\n", avg);

	}

}
