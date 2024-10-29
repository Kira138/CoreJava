package Inheritance;

public class College extends University {

String cname;
int dept;
College (String Uname,String loc,String cname,int dept)
{
	super(Uname,loc);
	this.cname=cname;
	this.dept=dept;
}
}
