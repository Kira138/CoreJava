package Inheritance;

public class Savings extends Account {
	double balance;
	Savings(String accname,long accno,double balance)
	{
	super(accname,accno);
	this.balance=balance;
	}

}
