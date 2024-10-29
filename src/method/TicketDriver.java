package method;

public class TicketDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket a=new Ticket(2,300,"Delhi");
		System.out.println(a.no_tickets+" ");
		System.out.println(a.getprice()+" ");
		System.out.println(a.getloc()+" ");
		a.setprice(100);
		a.setloc("Mumbai");
		System.out.println("after modifying:  "+a.getprice());
		System.out.println("after modifying:  "+a.getloc());

			}

		}
	


