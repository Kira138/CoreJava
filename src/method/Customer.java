package method;

public class Customer {
	String Address;
	long Phonenumber;
	String Name;
	Customer(String Address,long Phonenumber,String Name)
	{
	this.Address=Address;
	this.Phonenumber=Phonenumber;
	this.Name=Name;
	
	}
	public void Data()
	{
		System.out.println("Data of the customer");
	}
public void details()
{
	System.out.println("Address:" +Address);
	System.out.println("Phonenumber:" +Phonenumber);
	System.out.println("Name:" +Name);
	
	
}
	}



