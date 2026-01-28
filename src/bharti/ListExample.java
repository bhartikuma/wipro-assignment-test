package bharti;
import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(95);
		list.add(35);
		list.add(445);
		list.add(423);
		list.add(245);
		list.add(645);
		System.out.println(list);
		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println("Size of the Array list : "+list.size());
		System.out.println("is Empty:  "+list.isEmpty());
		System.out.println("Index of 95: "+list.indexOf(95));
		System.out.println("Contain 35? "+list.contains(35));
		list.set(2,  50);
		list.add(1,  100);
		List<Integer> otherList = Arrays.asList(1000, 2000);
		list.addAll(otherList);
		list.contains(otherList);
		list.removeIf(n -> n > 102);
		list.replaceAll(n -> n+1 );
		list.forEach(n -> System.out.println(n+ " "));
//		list.addFirst(12345);
		System.out.println(list);
//		list.addLast(123475);
		System.out.println(list);
		System.out.println(list.getClass());
		list.clear();
		System.out.println(list);

	}

}
