package method;

public class Resturant {
	String Address;
	long Rating;
	String Type;
	Resturant(String Address,long Rating,String Type)
	{
	this.Address=Address;
	this.Rating=Rating;
	this.Type=Type;
	
	}
	public void Data()
	{
		System.out.println("Data of the customer");
	}
public void details()
{
	System.out.println("Address:" +Address);
	System.out.println("Rating:" +Rating);
	System.out.println("Type:" +Type);
	
	
}
	}






