package method;

import java.util.Scanner;

public class ResturantDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Address");
		String Address=s.next();
		System.out.println("Enter Type");
		String Type=s.next();
		System.out.println("Enter Rating");
		long Rating=s.nextLong();
		
		Resturant r=new Resturant(Address,Rating,Type);
		r.Data();
		r.details();
			}





	}



