package method;

public class ATM {
	private int pin;
	String uname;
	long accno;
	private double balance;//private because this is confidential, so using get set method to access
	ATM(int pin,String uname,long accno,double balance)
	{
	this.pin=pin;
	this.uname=uname;
	this.accno=accno;
	this.balance=balance;
	}
	public void withdraw()
	{
		System.out.println("You can withdraw");
		
	}
	public int getpin()
	{
		return pin;
	}
	public double getbalance()
	{
		return balance;	
	}
	public void  setpin(int pin) {
		this.pin=pin;
	}
}
	

