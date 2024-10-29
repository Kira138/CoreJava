package method;

public class Student {

String sname;
private int marks;
int yop;
private long uname;
Student(String sname,int marks,int yop,long uname)
{
	this.sname=sname;
	this.marks=marks;
	this.yop=yop;
	this.uname=uname;
	}
public int getMarks()
{
	return marks;
}
public long getUname()
{
	return uname;
}
public void setMarks(int marks)
{
	this.marks=marks;
}
public void setuname(long uname)
{
	this.uname=uname;
}
}
