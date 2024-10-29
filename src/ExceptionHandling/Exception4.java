package ExceptionHandling;

public class Exception4 {

public static void main(String[] args)throws NullPointerException {//throws is a keyword used to declare the exception.throws should always be written always with main method
		// TODO Auto-generated method stub
		System.out.println("Main Begins");
		//String s="Hello";
		String s=" ";
		try {
		System.out.println(s.length());//
		}
		catch(NullPointerException e) {
			System.out.println("Exception Handled");
		}
		finally
		{
		System.out.println("Main Ends");

	}
}
}
