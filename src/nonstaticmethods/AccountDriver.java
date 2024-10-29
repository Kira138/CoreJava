package nonstaticmethods;

public class AccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account a = new Account("Tina","Current",123456,999);
Account a2=new Account("Tina","Current",123456,88);
System.out.println(a);
System.out.println(a2);
System.out.println(a.toString());
System.out.println(a==a2);
System.out.println(a.equals(a2));
System.out.println(a.hashCode());
System.out.println(a2.hashCode());

	}

}
