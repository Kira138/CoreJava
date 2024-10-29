package nonPrimitivatypeconversion;

public class HouseDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Building b=new House();//upcasting
System.out.println(b.l);
//System.out.println(b.b);error because after upcasting we can't access child class members.somwe have to do downcasting
House h=(House)b;
//(House)--type cast operator
System.out.println(h.l);
System.out.println(h.b);
// non primitive conversion seen only in inheritance 
	}

}
