package Inheritance;
//Hierarchical inheritance
public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Creating an object for Account");
Account a =new Account("XYZ",345);
System.out.println(a.accname);
System.out.println(a.accno);
//System.out.println(a.balance);//error
//System.out.println(a.withdraw);//error
System.out.println("Creating an object for Saving");
Savings s = new Savings("Anu",4567,10000);
System.out.println(s.accname);
System.out.println(s.accno);
System.out.println(s.balance);
//System.out.println(s.withdraw);error
System.out.println("Creating an object for Current");
Current c = new Current("Tina",45679,20000);
System.out.println(c.accname);
System.out.println(c.accno);
//System.out.println(c.balance);error
System.out.println(c.withdraw);
	}

}
