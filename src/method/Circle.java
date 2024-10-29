package method;

public class Circle {
double r;
//defining value inside constructor, constructor name should be same as class name.
Circle()//no argument constructor because no value is passed
{
	r=4.5;
}
public void area() {
	System.out.println(3.14*r*r);
}
public void dia() {
	System.out.println("Diameter =" + 2*r);
}
public void circum() {
	System.out.println("circumference =" + 2*3.14*r);
}
}
