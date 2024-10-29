package Collections;
import java.util.ArrayList;
import java.util.List;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(new Movie("English",120));
		a.add(new Movie("Kannada",200));
		a.add(new Movie("Hindi",120));
		a.add(new Movie("Telgu", 120));
		System.out.println("Before Removal:"+a);
		for(int i=0;i<a.size();i++)
		{
			Movie m=(Movie)a.get(i);
		if(m.lang.equals("English"))
		{
			a.remove(m);
			
		}
		System.out.println("After Removal:"+a);
	}

	}
}
