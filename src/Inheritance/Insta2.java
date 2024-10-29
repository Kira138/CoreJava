package Inheritance;
//initialize 1 attribute
//initialize 2 attribute
//initialize 3 attribute
public class Insta2 {
long mobno;
int pin;
String uname;
Insta2(long mobno)
{
	this.mobno=mobno;
}
Insta2(long mobno,int pin)
{
	this(mobno);//Constructor chaining
	this.pin=pin;
}
Insta2(long mobno,int pin,String uname)
{
	this(mobno,pin);//Constructor chaining
	
	this.uname=uname;
}
}
//Constructor chaining