package bharti;
 class encaps{
	 private String name;
	 private int marks;
	 public void name(String name,int marks) {
		 this.name=name;
		 this.marks=marks;
	 }
	 public int getMarks() {
		 return marks;
	 }
	 public String getName() {
		 return name;
	 }
	 public void display() {
		 System.out.println("name : "+name);
		 System.out.println("marks : "+marks);
	 }
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encaps rec= new encaps();
		rec.name("neha", 98);
		rec.getName();
		rec.getMarks();
		rec.display();
		

	}

}
