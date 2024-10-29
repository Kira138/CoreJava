package nonstaticmethods;

public class Account {
	String accname;
	String type;
	double balance;
	int pwd;
	Account(String accname,String type,double balance,int pwd)
	{	
		this.accname=accname;
		this.type=type;
		this.balance=balance;
		this.pwd=pwd;
	}
	//override toString()
	public String toString()
	{
		return "AccName: "+accname+" Type: "+type+"Balance: "+balance+"Pwd: "+pwd;
		
		
	}
	//overridden equals:
	public boolean equals (Object o) {
		Account a=(Account)o;
		return this.accname==accname &&
				this.type==type &&
		        this.balance==balance&&
		         this.pwd==pwd;
	}
	//overridden hashCode:
	public int hashCode() {
		double hc=0;
		hc=hc+accname.hashCode();
		hc=hc+type.hashCode();
		hc=hc+(double)balance;
		hc=hc+(int)pwd;
		return (int) hc;
	}

}
