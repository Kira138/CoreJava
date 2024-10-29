package ExceptionHandling;

import java.util.Scanner;

public class Quotientof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=s.nextInt();
		int num2=s.nextInt();
		//int res=num1/num2;//to find quotient
		try {
	int res=num1%num2;//to find reminder. give value 10 and 0 then we will get exception .this is not the error,this occurs in run time
		//Arithmatic exception
	System.out.println(res);
		}
		catch(NullPointerException e)
		{
System.out.println("Exception handled");

	}
		catch(Exception e) {
System.out.println("From Second catch block");//second will be executed only when first exception is not handled.nullpointer is written instead arithmatic
		}
		

	}
}
