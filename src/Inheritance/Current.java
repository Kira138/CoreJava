package Inheritance;

public class Current extends Account {
double withdraw;
Current(String accname,long accno,double withdraw)
{
	super(accname,accno);
	this.withdraw=withdraw;
}
}
