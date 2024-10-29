package Inheritance;

import java.util.Scanner;

public class DistrictDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter Country Name");
String cname=s.next();
System.out.println("Enter Number of States");
int nstates=s.nextInt();
System.out.println("Enter State Name");
String sname=s.next();
System.out.println("Enter Number of District");
int ndistrict=s.nextInt();
System.out.println("Enter District Name");
String dname=s.next();
District d = new District (cname,nstates,sname,ndistrict,dname);
System.out.println("Country Name:"+d.cname);
System.out.println("Number of States:"+d.nstates);
System.out.println("State Name:"+d.sname);
System.out.println("Number of District:"+d.ndistrict);
System.out.println("District Name:"+d.dname);
	}

}
