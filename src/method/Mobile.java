package method;

public class Mobile {
	String Brand;
	long Price;
	String Color;
	Mobile(String Brand,long Price,String Color)
	{
	this.Brand=Brand;
	this.Price=Price;
	this.Color=Color;
	
	}
	public void cost()
	{
		System.out.println("Cost of the phone depends on");
	}
public void details()
{
	System.out.println("Brand:" +Brand);
	System.out.println("Price:" +Price);
	System.out.println("Color:" +Color);
	
	
}
	}



