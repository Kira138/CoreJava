package AbstractMethod;

public class Student2 extends Student {
	int grade;
	Student2(String sname,long mobno,double marks,int grade)
	{
		super(sname,mobno,marks);
		this.grade=grade;
		
	}
	
	@Override
	void studentDetails() {
		// TODO Auto-generated method stub
		System.out.println(sname);
		System.out.println(mobno);
		System.out.println(marks);
		System.out.println(grade);
	}

}
