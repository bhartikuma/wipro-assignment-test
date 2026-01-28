package bharti;


import java.util.*;
import java.util.Map;
 
public class mapDemo {
public static void main(String[] args)
{
Map<Integer, String>Employee = new HashMap<>();
		Employee.put(101, " Vinay ");
		Employee.put(102, " Sonali ");
		Employee.put(103, "Renu");
		
		System.out.println(Employee);
		System.out.println("size of mmap: " +Employee.size());
		System.out.println("get the value for key 102: " + Employee.get(102));
		System.out.println("Contain key 101 " + Employee.containsKey(101));
        System.out.println("Contains key 105 " + Employee.containsKey(105));
        System.out.println("Contains value Renu " + Employee.containsValue("Renu"));
        System.out.println("Contains value Rahul " + Employee.containsValue("Rahul"));

        Map<Integer, String> newEmployees = new HashMap<>();
        newEmployees.put(104, "romi");
        newEmployees.put(105, "harsh");
        Employee.putAll(newEmployees);
        System.out.println("map after putelemet: "+Employee);
        String removedValue = Employee.remove(104);
        System.out.println("rimoved value for key 104: " + removedValue);
        System.out.println("map after remove: " + Employee);
        System.out.println("key Set: "+Employee.keySet());
        System.out.println("value collection: "+Employee.values());
        System.out.println("entri Set: " + Employee.entrySet());
        System.out.println("iterating from the map:");
        for (Map.Entry<Integer, String> entry : Employee.entrySet()) {
            System.out.println("Key: " + entry.getKey() +" Value: " + entry.getValue());
        }
        System.out.println("map empty? " + Employee.isEmpty());
        Employee.clear();
        System.out.println("Map after clear: " + Employee);
        System.out.println("map empty after clear " + Employee.isEmpty());
 
	}
 
}
 
 

