package ExceptionHandling;

public class Student {
int age;
int marks;
String name;
Student(int age,int marks,String name) throws NotEligibleException
{
	this.age=age;
	this.name=name;
	if(marks<50)
	{
		throw new NotEligibleException();
	}
	else {
		this.marks=marks;
	}
}
}
