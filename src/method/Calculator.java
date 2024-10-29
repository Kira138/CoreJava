package method;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		product(10,30);
		reminder(30,10);

	}
	private static void reminder(int i, int j) {
		// TODO Auto-generated method stub
		int res=i%j;
		System.out.println("reminder of two numbers is:"+res);
		return;
		
	}
	private static void product(int i, int j) {
		// TODO Auto-generated method stub
		int res=i*j;
		System.out.println("Product of two numbers is:"+res);
		return;
		
	}
	private static void sum(int i, int j) {
		// TODO Auto-generated method stub
		int res=i+j;
		System.out.println("sum of two numbers is:"+res);
		return;
		
	}

}