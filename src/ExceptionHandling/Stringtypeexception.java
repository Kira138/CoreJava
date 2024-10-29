package ExceptionHandling;

public class Stringtypeexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=null;
try {
	System.out.println(s.length());
}
catch(NullPointerException e)
{
System.out.println("Exception Handled");
	}

}
}
