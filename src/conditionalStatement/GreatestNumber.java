package conditionalStatement;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
			{
		        Scanner in = new Scanner(System.in);
		        System.out.print("Input a: ");
	            int a = in.nextInt();
	            System.out.print("Input b: ");
	            int b = in.nextInt();
	            System.out.print("Input c: ");
	            int c =in.nextInt();

		        if ((a>=b)&&(a>=c))
		        {
		            System.out.println("The greatest:"+a);
		        }
		        else if ((b>=c)&&(b>=a))
		        {
		            System.out.println("The greatest:"+b);
		        }
		        else {
		        	 System.out.println("The greatest:"+c);
		        }
		        
		}
	}
	}
