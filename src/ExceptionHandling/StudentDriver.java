package ExceptionHandling;

public class StudentDriver {

	public static void main(String[] args) throws NotEligibleException {
		// TODO Auto-generated method stub
		Student s=new Student(10,51,"Tina");
		System.out.println(s.age);
		System.out.println(s.marks);
		System.out.println(s.name);
	}

}
