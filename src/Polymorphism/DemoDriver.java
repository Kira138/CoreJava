package Polymorphism;

public class DemoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d1=new Demo();
d1.test();
Demo2 d2=new Demo2();
d2.test();
System.out.println("Test");
Demo d3=new Demo2();//creating reference of parent class,parent class will be executed. 
//this happenswhenever child class nd parent class have same method with same signature.This is called method shadowing.
//Compile time polymorhphism.
//Conditions are
//1.inheritance,static,same method,both should be public,return type(void) should be same
System.out.println(d3.x);
d3.test();
Demo d4=new Demo();//creating reference of parent class
System.out.println(d4.x);
d4.test();
Demo2 d5=new Demo2();//creating reference of child class,child class will be executed. 
d5.test();
System.out.println(d5.x);
	}

}
