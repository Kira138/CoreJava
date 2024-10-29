package AbstractMethod;

public abstract class Student {
	String sname;
	long mobno;
	double marks;
	Student(String sname,Long mobno,double marks)
	{
		this.sname=sname;
		this.mobno=mobno;
		this.marks=marks;
	}
	abstract void studentDetails();
	

}
