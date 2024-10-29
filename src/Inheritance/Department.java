package Inheritance;

public class Department extends College {
	String dname;
	String exam;
	Department(String Uname, String loc,String cname,int dept,String dname,String exam) {
	    super(Uname,loc,cname,dept);
		this.dname=dname;
		this.exam=exam;
	}

}
//Super()
//Is used to call the constructors of Parent Class
//It should be the first Statement in a constructor block
//it won't accept the datatypes of the attributes

