package ExceptionHandling;

public class Employee {

	String ename;
	double salary;
	long mobno;
	Employee(String ename,double salary,long mobno)
	{
		this.ename=ename;
		this.mobno=mobno;
		//if(salary<1000)// no error
		if(salary>1000) //exception error
		{
			throw new SalaryException();
		}
		else
		{
			this.salary=salary;
		}
	}

}
