package method;

import java.util.Scanner;

public class EmployeeDriver {
// Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A Scanner object s is created to read input from the console.
Scanner s=new Scanner(System.in);
//Taking User Input
System.out.println("Enter ename");
String ename=s.next();//The entered values are stored in the respective variables.
System.out.println("Enter sal");
  double sal = s.nextDouble();//The entered values are stored in the respective variables.
 System.out.println("Enter eid");
    String eid = s.next();//The entered values are stored in the respective variables.
    System.out.println("Enter mobno");
    long mobno = s.nextLong();//The entered values are stored in the respective variables.
    
    //Creating an Employee Object

    Employee e = new Employee(ename, sal, eid, mobno);
//The program uses getter methods (getSal(), getEid(), getMobno()) 
    //to display the initial salary, employee ID, and mobile number of the employee.
    //getter
    System.out.println("Salary:" + e.getSal());
    System.out.println("EmployeeID:" + e.getEid());
    System.out.println("MobileNumber:" + e.getMobno());
    
    s.nextLine(); // Consume the leftover newline
    System.out.println("\nUpdate the details:");
    //The program prompts the user to enter new values for the employee ID, salary, and mobile number.
    System.out.println("Enter new Employee ID:");
    String newEid = s.nextLine();//The new values is stored in the respective variable (newEid).
    e.seteid(newEid);//The setter method (seteid()) is called to update the instance variable of the Employee object with the new value.

    System.out.println("Enter new Salary:");
    double newSal = s.nextDouble();
    e.setSal(newSal);

    System.out.println("Enter new mobile number:");
    long newMobno = s.nextLong();
    e.setMobno(newMobno);

    // The program uses getter methods again to display the updated employee ID, salary, and mobile number.
    System.out.println("Updated Employee ID: " + e.getEid());
    System.out.println("Updated Salary: " + e.getSal());
    System.out.println("Updated Mobile Number: " + e.getMobno());
    
	}

}
