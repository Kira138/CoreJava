package nonPrimitivatypeconversion;

public class DriverFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		//s is of son class type
		//Father f=s;instead of this we can write like mentioned in 11th line
		//trying to convert son class type to father class
		Father f=new Son();
		//creating objects for subclass and trying to store in parent class.This is called Upcasting
		//Process of converting child class reference to parent class i know as upcasting
		//Upcasting is done implicitly by the compiler
		//downcasting has to be done expicitly using type cast operator
		//Process of converting parent class reference to child class i know as downcasting
		
	}

}
