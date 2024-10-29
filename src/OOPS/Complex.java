package OOPS;

public class Complex {
	double real;
	double imaginary;
	Complex(double real,double imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	 public static Complex add(Complex c1, Complex c2)
	{
		Complex temp=new Complex(0,0);
		temp.real=c1.real+c2.real;
		temp.imaginary=c1.imaginary+c2.imaginary;
		return temp;
		
	}
}

	
		 