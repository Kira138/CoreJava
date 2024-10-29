package Practice;

import java.util.Scanner;

public class findpositiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();

        if (a>=0)
        {
            System.out.println("The number:"+a+"is positive");
        }
        else 
        {
        	System.out.println("The number:"+a+"is negative");	
        }
	}

}
