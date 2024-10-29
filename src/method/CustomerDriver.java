package method;

import java.util.Scanner;

public class CustomerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Address");
		String Address=s.next();
		System.out.println("Enter Name");
		String Name=s.next();
		System.out.println("Enter Phonenumber");
		long Phonenumber=s.nextLong();
		
		Customer c=new Customer(Address,Phonenumber,Name);
		c.Data();
		c.details();
			}





	}


