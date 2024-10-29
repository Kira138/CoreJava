package method;

import java.util.Scanner;

public class ATMDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner s=new Scanner(System.in); System.out.println("Enter pin"); int
		 * pin=s.nextInt(); System.out.println("Enter uname"); String uname=s.next();
		 * System.out.println("Enter accno"); long accno=s.nextLong();
		 * System.out.println("Enter expdate"); String expdate=s.next();
		 */
ATM a=new ATM(123,"Tina",223,1000);
System.out.println(a.accno+" ");
System.out.println(a.uname+" ");
System.out.println(a.getpin()+" ");
System.out.println(a.getbalance()+" ");
a.setpin(100);
System.out.println("after modifying:  "+a.getpin());

	}

}
