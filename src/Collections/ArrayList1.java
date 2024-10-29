package Collections;


import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
System.out.println(a.isEmpty());//to verify array list empty or not
System.out.println(a.size());//to find size of the array
a.add(10);
a.add(1.5);
a.add('d');
a.add(true);
a.add("Virat");//these are all objects not data types
a.add(new Book());
a.add(new Pen());
System.out.println(a);
	}

}
