package method;

public class Ascii {
		public static int Ascii(char n1)
	{
     return (int)n1;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  char res ='A';
		  int asciiValue = Ascii(res);
		  System.out.println("The ASCII value of '" + res + "' is: " + asciiValue);

	}


	}
