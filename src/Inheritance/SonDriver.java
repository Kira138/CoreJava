package Inheritance;

import java.util.Scanner;

public class SonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("Enter no.of Bike");
int bike=s.nextInt();
System.out.println("Enter no.of Car");
int car=s.nextInt();
System.out.println("Enter no.of Cycle");
int cycle=s.nextInt();
Son n=new Son(bike,car,cycle);
System.out.println("Total no of Bikes are:"+n.bike);
System.out.println("Total no of Cars are:"+n.car);
System.out.println("Total no of Cycle are:"+n.cycle);


	}

}
