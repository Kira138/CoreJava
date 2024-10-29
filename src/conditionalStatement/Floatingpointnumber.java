package conditionalStatement;

import java.util.Scanner;

public class Floatingpointnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
	        if(a>0)
	        {
	        	 System.out.println("The number is positive");
	        	
	        }
	        else if (a<0)
	        {
	        	 System.out.println("The number is negative");	
	        }
	        else if (a==0)
	        {
	        	 System.out.println("The number is zero");		
	        }
	        		
        

	}

}
