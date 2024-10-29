package Arrays;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
        
        // Prompt user for input
        System.out.println("Enter five integers:");

        int e1 = s.nextInt();
        int e2 = s.nextInt();
        int e3 = s.nextInt();
        int e4 = s.nextInt();
        int e5 = s.nextInt();
        

        int[] a = {e1, e2, e3, e4, e5};


        System.out.println("The Array elements are:");
        for (int i = 0; i < a.length; i++)
        {
            if(i%2==0)
            {
            System.out.println(a[i]);
            }
        }
	}
}
        
        
    



		
	
	


	
