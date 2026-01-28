package bharti;

public class employee {
	private int salary;
	void setSalary(int sal) {
		salary=sal;
	}
	int getSalary() {
		return salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj = new employee();
		obj.setSalary(60000);
		System.out.println(obj.getSalary());
		

	}

}
