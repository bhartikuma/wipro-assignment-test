package bharti;

interface firstClass{
	public void first();
}
interface secondClass{
	public void second();
}
class demo implements firstClass ,secondClass{
	public void first() {
		System.out.println("this first interface ");
	}
	public void second() {
		System.out.println("this is second interface");
	}
	
}

public class interfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo obj=new demo();
		obj.first();
		obj.second();

	}

}
