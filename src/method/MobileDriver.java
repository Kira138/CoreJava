package method;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Brand");
		String Brand=s.next();
		System.out.println("Enter Color");
		String Color=s.next();
		System.out.println("Enter Price");
		long Price=s.nextLong();
		Mobile a=new Mobile(Brand,Price,Color);
		a.cost();
		a.details();
			}

		

	}


