package method;

public class Ticket {
	int no_tickets;
	private double price;
	private String loc;
	Ticket(int n,double price,String loc)
	{
			this.no_tickets=n;
			this.price=price;
			this.loc=loc;
			}
	public double getprice()
	{
	return price;	
	}
	public String getloc()
	{
		return loc;		
	}
	public void  setprice(double price) {
		this.price=price;
	}
	public void  setloc(String loc) {
		this.loc=loc;
	}
}
