package nonPrimitivatypeconversion;

public class OlaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Upcasting");
Ola o=new Auto();//upcasting
Ola o2=new Mini();//Upcasting
System.out.println("Downcasting");
Auto a=(Auto)o;//DownCasting
Mini m=(Mini)o2;//Downcasting
//Upcasting is mandatory before doing Downcasting
	}

}
