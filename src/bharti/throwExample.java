package bharti;

public class throwExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int bal=5000;
			if(bal<6000) {
				throw new Exception("balance is low");	
			}
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		}

	}

}
