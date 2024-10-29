package method;

public class Employee {
	//instance variables
	String ename;
	private double sal;
	private String eid;
	private long mobno;
	 // Constructor to initialize instance variables
	Employee(String ename,double sal,String eid,long mobno)
	{
		// 'this' keyword is used to refer to the instance variable
	this.ename=ename;
	this.sal=sal;
	this.eid=eid;
	this.mobno=mobno;
	}
	// Method to display person details
	public void employeeData()
	{
		System.out.println("Details are mentioned below");
	}
public double getSal()
{
return sal;	
}
public String getEid()
{
	return eid;
}
public long getMobno()
{
	return mobno;
}
public void setSal(double sal)
{
	this.sal=sal;	
}
public void seteid(String eid)
{
	this.eid=eid;	
}
public void setMobno(long mobno)
{
	this.mobno=mobno;	
}
}
