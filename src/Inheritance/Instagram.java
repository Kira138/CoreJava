package Inheritance;
//constructor overloading
//login via mob no and pin
//login via User name and pin
//login via facebook
public class Instagram {
long mobno;
int pin;
String uname;
String fbuname;
Instagram(long mobno,int pin)
{
	this.mobno=mobno;
	this.pin=pin;
	System.out.println("logged in via mobile number");
}
Instagram(String uname,int pin)
{
	this.uname=uname;
	this.pin=pin;
	System.out.println("logged in via User Name");
	
}
Instagram(String fbuname)
{
	this.fbuname=fbuname;
	System.out.println("logged in via fb User Name");
}


}


