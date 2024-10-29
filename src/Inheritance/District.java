package Inheritance;

public class District extends State {
	
	String dname;
    District (String cname,int nstates,String sname,int ndistrict,String dname)
    {
    	this.cname=cname;
    	this.nstates=nstates;
    	this.sname=sname;
    	this.ndistrict=ndistrict;
    	this.dname=dname;
    }
}
