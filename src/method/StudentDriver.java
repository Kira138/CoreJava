package method;
//encapsulation
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the sname:");
String sname=s.next();
System.out.println("Enter the marks:");
int marks=s.nextInt();
System.out.println("Enter the yop:");
int yop=s.nextInt();
System.out.println("Enter the uname:");
long uname=s.nextLong();
Student t = new Student(sname, marks, yop, uname);
System.out.println("Marks:" + t.getMarks());
System.out.println("UserName:" + t.getUname());

s.nextLine();
System.out.println("\nUpdate the details");

System.out.println("Enter the Updated Marks:");
int newMarks=s.nextInt();
t.setMarks(newMarks);

System.out.println("Enter the Updated User Name:");
long newUname=s.nextLong();
t.setuname(newUname);

System.out.println("Updated Marks: " + t.getMarks());
System.out.println("Updated User Name: " + t.getUname());

	}

}
