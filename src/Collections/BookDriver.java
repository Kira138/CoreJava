package Collections;
import java.util.ArrayList;
import java.util.List;
public class BookDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(new Book(100,"ClassMate"));
		a.add(new Book(80,"Vidya"));
		a.add(new Book(80,"Nataraj"));
		a.add(new Book(80,"Apsara"));
		System.out.println(a);
	}

}
