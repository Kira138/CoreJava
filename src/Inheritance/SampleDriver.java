package Inheritance;

public class SampleDriver extends Sample {

public void demo()
{
	System.out.println("From SamDriver");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	SampleDriver s=new SampleDriver();
	s.demo();
	System.out.println(s.x);
	s.x=100;
	System.out.println(s.x);
	}

}
