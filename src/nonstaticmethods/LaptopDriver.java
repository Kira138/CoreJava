package nonstaticmethods;

public class LaptopDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l = new Laptop("Mac","Grey",14599,4);
		Laptop l2=new Laptop("Mac","Grey",14599,2);
		System.out.println(l);
		System.out.println(l2);
		System.out.println(l.toString());
		System.out.println(l==l2);
		System.out.println(l.equals(l2));
		System.out.println(l.hashCode());
		System.out.println(l2.hashCode());

			}

		}
