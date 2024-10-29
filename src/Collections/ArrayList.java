package Collections;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(new Book(100,"Math"));
		a.add(new Book(80,"Science"));
		a.add(new Book(80,"SocialScience"));
		System.out.println(a);
	
//to remove maths from collections
	for(int i=0;i<a.size();i++)
	{
	Book b=(Book)a.get(i);
	if(b.sub.equals("Maths"))//downcasting to obj
	{
		a.remove(b);
	}
	System.out.println(a);
	}
	
		
	}

}
