package bharti;
import java.util.*;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> sets = new  TreeSet<>();
		try {
			
			sets.add("bharti");
			sets.add("ramya");
			sets.add("rica");
			sets.add(null);
		}catch(NullPointerException e) {
			System.out.println("Null value u can't add to set ");
		}
		System.out.println(sets);

	}

}
