package Inheritance;

public class AB_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Creating object for parent");
A ref1=new A();
System.out.println(ref1.x);
//System.out.println(ref1.y);there is no Y in parent
System.out.println("Creating object for child");
B ref2=new B();
System.out.println(ref2.x);
System.out.println(ref2.y);
	}

}
